package cpu;

import java.util.Queue;
import java.util.Vector;


class CacheLine{
	public short address;
	public short content;
	
	public CacheLine(short address, short content){
		this.address = address;
		this.content = content;
	}

}

class Cache{
	public Vector<CacheLine> cacheLines;
	private int size;
	public Cache(int size){
		this.cacheLines = new Vector<CacheLine>();
		this.size = size;
	}
	
	public void add(short address, short content){
		
		
		
		CacheLine nCL = find(address);
		if(nCL != null){
			nCL.content = content;
			return;
		}
		
		nCL = new CacheLine(address, content);
		cacheLines.add(nCL);
		if (cacheLines.size() > this.size){
			cacheLines.remove(0);
		}	
	}
	
	public CacheLine find(short address){
		CacheLine result = null;
		for(CacheLine cl : this.cacheLines){
			if (cl.address == address){
				result = cl;
			}
		}
		
		return result;
	}
	
}

public class CPU {
	
	//registers, limit will be put on for register that are smaller than 16 bits. 
	private boolean[] cc;
	private short[] r,x;
	private short[] devin;
	private short[] devout;
	private short ir;
	private short pc;
	private short mar;
	private short mbr;
	private short msr;
	private short mfr;
	private Cache cache;
	//memory
	private short mem[];
	
	// constructor, the register and memory are initiated here
	public CPU(short[] devin)
	{
		ir=pc=mar=mbr=msr=mfr=0;
		cc = new boolean[4];
		r = new short[4];
		x = new short[3];
		mem=new short[2048];
		cache = new Cache(16);
		this.devin=devin;
		this.devout = new short[32];
		for (int i=0;i<cc.length;i++)
		{
			cc[i]=false;
		}
		for(int i=0;i<r.length;i++)
		{
			r[i]=0;
		}
		for(int i=0;i<x.length;i++)
		{
			x[i]=0;
		}
		for(int i=0;i<mem.length;i++)
		{
			mem[i]=0;
		}
	}
	
	// function that is going to be used for setting memory.
	// will also check for invalid read or write
	public void setMem(short content, int index)
	{
		if(index < 6||index>2048)
		{
			mfr=3;
			mem[4] = pc;
		}
		else
		{
			cache.add((short)index, content);
			mem[index] = content;
		}
	}


	// function that is going to be used for reading memory.
	// will also check for invalid read or write
	private short fetchFromMemory(short address)
	{
		if(address < 6||address>2048)
		{
			mfr=3;
			mem[4] = pc;
			return 0;
		}
		else
		{
			CacheLine c= cache.find(address);
			if(c != null){
				return c.content;
			}
			return mem[address];
		}
	}
	
	// execute the current instruction specified by pc
	public int executeNext()
	{

		// fetch instruction
		mar = pc;
		mbr = fetchFromMemory(mar);
		
		if(mbr == -1)
		{
			return -1;
		}
		
		ir = mbr;
		String instruction = String.format("%16s", Integer.toBinaryString(ir)).replace(' ', '0');
		if(instruction.length()>16){
			instruction=instruction.substring(instruction.length()-16,instruction.length());
		}
		short optcode = Short.parseShort(instruction.substring(0, 6),2);
		short r,x,i,address;
		short rx,ry;
		short ri,count,lr,al;
		short tempcc,devid;

		//check op code and switch to the function it is corresponding to
		switch (optcode)
		{
			case 0:
				return -1;
			case 1: // ldr
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				ldr(r,x,address,i);
				break;
			case 2: // str
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				str(r,x,address,i);
				break;
			case 3: // lda
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				lda(r,x,address,i);
				break;
			case 4: // amr
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				amr(r,x,address,i);
				break;
			case 5: // smr
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				smr(r,x,address,i);
				break;
			case 6: //air
				r = Short.parseShort(instruction.substring(6,8),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				air(r,address);
				break;
			case 7: //sir
				r = Short.parseShort(instruction.substring(6,8),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				sir(r,address);
				break;
			case 8: //jz
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				jz(r,x,address,i);
				break;
			case 9: //jne
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				jne(r,x,address,i);
				break;
			case 10: //jcc
				tempcc = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				jcc(tempcc,x,address,i);
				break;
			case 11: //jma
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				jma(x,address,i);
				break;
			case 12: //jsr
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				jsr(x,address,i);
				break;
			case 13: //rfs
				address = Short.parseShort(instruction.substring(11,16),2);
				rfs(address);
				break;
			case 14: //sob
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				sob(r,x,address,i);
				break;
			case 15: //jge
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				jge(r,x,address,i);
				break;
			case 16: //mlt
				rx = Short.parseShort(instruction.substring(6,8),2);
				ry = Short.parseShort(instruction.substring(8,10),2);				
				mlt(rx,ry);
				break;
			case 17: //dvd
				rx = Short.parseShort(instruction.substring(6,8),2);
				ry = Short.parseShort(instruction.substring(8,10),2);				
				dvd(rx,ry);
				break;
			case 18: //trr
				rx = Short.parseShort(instruction.substring(6,8),2);
				ry = Short.parseShort(instruction.substring(8,10),2);				
				trr(rx,ry);
				break;
			case 19: //and
				rx = Short.parseShort(instruction.substring(6,8),2);
				ry = Short.parseShort(instruction.substring(8,10),2);				
				and(rx,ry);
				break;
			case 20: //orr
				rx = Short.parseShort(instruction.substring(6,8),2);
				ry = Short.parseShort(instruction.substring(8,10),2);				
				orr(rx,ry);
				break;
			case 21: //not
				rx = Short.parseShort(instruction.substring(6,8),2);				
				not(rx);
				break;
			case 25: //src
				ri = Short.parseShort(instruction.substring(6,8),2);
				count = Short.parseShort(instruction.substring(12,16),2);
				lr = Short.parseShort(instruction.substring(9,10),2);
				al = Short.parseShort(instruction.substring(8,9),2);
				src(ri,count,lr,al);
				break;
			case 26: //rrc
				ri = Short.parseShort(instruction.substring(6,8),2);
				count = Short.parseShort(instruction.substring(12,16),2);
				lr = Short.parseShort(instruction.substring(9,10),2);
				al = Short.parseShort(instruction.substring(8,9),2);
				rrc(ri,count,lr,al);
				break;
			case 33: //ldx
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				ldx(x,address,i);
				break;
			case 34: //stx
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				stx(x,address,i);
				break;
			
			case 49: //in
				r = Short.parseShort(instruction.substring(6,8),2);
				devid = Short.parseShort(instruction.substring(11,16),2);
				in(r,devid);
				return 32+devid;// signal saying that input needs to be updated
			case 50: //out
				r = Short.parseShort(instruction.substring(6,8),2);
				devid = Short.parseShort(instruction.substring(11,16),2);
				out(r,devid);
				return 64+devid;
				// signal saying that there is new output.
				
		}
		
		if(cc[0]||cc[1]||cc[2]){
			return -1;
		}
			
		
		//increment pc
		pc++;
		return 0;
	}
	

	private void out(short r, short devid) {
		devout[devid] = this.r[r];// TODO Auto-generated method stub
	}

	private void in(short r, short devid) {
		this.r[r] = devin[devid];// TODO Auto-generated method stub
		
	}

	// calculate effective address
	private short calcEA(short x,short address,short i)
	{
		short result=-1;
		if(i == 0)
		{
			if (x>0)
			{
				
				result = (short) (this.x[x-1]+address);
			}
			else
			{
				result = address;
			}
				
		}
		else
		{
			result = mem[calcEA(x,address,(short)0)];
		}
		
		return result;
	}
	
	/*
	* starting from here is the instruction function
	* it follows what is stated in the project description file
	*/

	private void ldr(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		mar = EA;
		mbr = fetchFromMemory(mar);
		this.r[r] = mbr;
	}
	
	private void str(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		mar = EA;
		mbr = this.r[r];
		setMem(mbr,mar);
	}
	
	private void lda(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		this.r[r] = EA;
	}
	
	private void ldx(short x, short address, short indirect)
	{
		short EA = calcEA( (short) 0,address,indirect);
		this.x[x] = EA;
	}
	
	private void stx(short x, short address, short indirect)
	{
		short EA = calcEA( (short) 0,address,indirect);
		mar = EA;
		mbr = this.x[x];
		setMem(mbr,mar);
	}
	
	private void amr(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		mar = EA;
		mbr = fetchFromMemory(mar);
		if(this.r[r] + mbr>Short.MAX_VALUE)
		{
			cc[0] = true;
		}
		else if(this.r[r] + mbr < Short.MIN_VALUE)
		{
			cc[1] = true;
		}else
			this.r[r] +=mbr;
	}
	
	private void smr(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		mar = EA;
		mbr = fetchFromMemory(mar);
		if(this.r[r] - mbr>Short.MAX_VALUE)
		{
			cc[0] = true;
		}
		else if(this.r[r] - mbr < Short.MIN_VALUE)
		{
			cc[1] = true;
		}
		else
			this.r[r] -=mbr;
	}
	
	private void air(short r, short immed)
	{
		mbr = immed;
		if(this.r[r] + mbr>Short.MAX_VALUE)
		{
			cc[0] = true;
		}
		else if(this.r[r] + mbr < Short.MIN_VALUE)
		{
			cc[1] = true;
		}else
			this.r[r] +=mbr;
		
	}
	
	private void sir(short r, short immed)
	{
		mbr = immed;
		if(this.r[r] - mbr>Short.MAX_VALUE)
		{
			cc[0] = true;
		}
		else if(this.r[r] - mbr < Short.MIN_VALUE)
		{
			cc[1] = true;
		}
		else
			this.r[r] -=mbr;
	}
	
	
	private void mlt(short rx, short ry) {
		if(rx == 1 || rx == 3 || ry == 1 || ry == 3) {
			System.out.println("Rx and Ry must be 0 or 2!");
		} else {
			short r1 = r[rx];
			short r2 = r[ry];
			int value = r1 * r2;
			if(value > Math.pow(2,  32) - 1) {
				System.out.println("MLT Overflow!");
				cc[0] = true;
			}
			int high = value >> 16;
		    int low = value % (int) Math.pow(2, 16);
			if (rx == 0) {
				setR0((short) high);
				setR1((short) low);
			} else if (rx ==2) {
				setR2((short) high);
				setR3((short) low);
			}			
		}
	}
	
	private void dvd(short rx, short ry) {
		if(rx == 1 || rx == 3 || ry == 1 || ry ==3) {
			System.out.println("Rx and Ry must be 0 or 2!");
		} else {
			short r1 = r[rx];
			short r2 = r[ry];
			if(r2 == 0) {
				System.out.println("MLT DIVZERO!");
				cc[2] = true;
			}
			int quotient = r1 / r2;
			int remainder = r1 % r2;
			if (rx == 0) {
				setR0((short) quotient);
				setR1((short) remainder);
			} else if (rx == 2) {
				setR2((short) quotient);
				setR3((short) remainder);
			}
		}
	}
	
	
	private void trr(short rx, short ry) {
		if (this.r[rx] == this.r[ry]) {
			cc[3] = true;
		} else {
			cc[3] = false;
		}
	}
	
	private void and(short rx, short ry) {
		short r1 = r[rx];
		short r2 = r[ry];
		this.r[rx] = (short) (r1&r2);
	}
	
	private void orr(short rx, short ry) {
		short r1 = r[rx];
		short r2 = r[ry];
		this.r[rx] = (short) (r1|r2);
	}
	
	private void not(short rx) {
		short r1 = r[rx];
		this.r[rx] = (short) (~r1);
	}
	
	private void src(short ri, short count, short lr, short al) {
		short rx = r[ri];
		if(lr == 1 && al == 0) {
			//left,arithmetical
			this.r[ri] = (short) (rx << count);
		} else if (lr == 1 && al == 1) {
			//left,logical
			this.r[ri] = (short) (rx << count);
		} else if (lr == 0 && al == 0){
			//right,arithmetical
			this.r[ri] = (short) (rx >> count);
		} else if (lr == 0 && al == 1) {
			//right,logical
			this.r[ri] = (short) (rx >>> count);
		} else {
			//error
			System.out.println("SRC: Wrong instruction!");
		}
		if (this.r[ri] % Math.pow(2, 16) == 0) {
			cc[1] = false;
		} else {
			cc[1] = true;
		}
	}
	
	private void rrc(short ri, short count, short lr, short al) {
		short rx = r[ri];
		if(lr == 1 && al == 1) {
			//left,logical
			this.r[ri] = (short) (rx >>> (16 - count) | rx >> count);
		} else if (lr == 0 && al == 1) {
			//right,logical
			this.r[ri] = (short) (rx >>> count | rx << (16 - count));
		}
	}
	
	private void jz(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		if(this.r[r]==0)
		{
			pc = EA;
		}
		else
		{
			pc++;
		}	
	}

	private void jne(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		if(this.r[r]!=0)
		{
			pc = EA;
		}
		else
		{
			pc++;
		}	
	}
	
	// need modification
	private void jcc(short cc,short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		if(this.cc[cc]==true)
		{
			pc = EA;
		}
		else
		{
			pc++;
		}
	}
	
	private void jma(short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		pc = EA;
	}
	
	private void jsr(short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		this.r[3] = (short) (pc+1);
		this.r[0] = (short) 2020;
		pc = EA;
	}
	
	private void rfs(short immed)
	{
		this.r[0] = immed;
		pc = this.r[3];
	}
	
	private void sob(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		this.r[r]=(short) (this.r[r]-1);
		if(this.r[r]>0)
		{
			pc = EA;
		}
		else
		{
			pc++;
		}	
	}
	
	private void jge(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		if(this.r[r]>=0)
		{
			pc = EA;
		}
		else
		{
			pc++;
		}	
	}
	
	
	
	
	
	
	// getters and setters
	// getters and setters


	public short getR0() {
		return r[0];
	}





	public void setR0(short r0) {
		this.r[0] = r0;
	}






	public short getR1() {
		return r[1];
	}





	public void setR1(short r1) {
		this.r[1] = r1;
	}





	public short getR2() {
		return r[2];
	}





	public void setR2(short r2) {
		this.r[2] = r2;
	}





	public short getR3() {
		return r[3];
	}





	public void setR3(short r3) {
		this.r[3] = r3;
	}





	public short getPc() {
		return pc;
	}





	public void setPc(short pc) {
		this.pc = pc;
	}





	public short getX1() {
		return x[0];
	}





	public short getX2() {
		return x[1];
	}





	public short getX3() {
		return x[2];
	}





	public short getIr() {
		return ir;
	}





	public short getMar() {
		return mar;
	}





	public short getMbr() {
		return mbr;
	}





	public short getMsr() {
		return msr;
	}





	public short getMfr() {
		return mfr;
	}




	
}
