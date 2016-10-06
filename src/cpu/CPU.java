package cpu;

public class CPU {
	
	//registers, limit will be put on for register that are smaller than 16 bits. 
	private boolean[] cc;
	private short[] r,x;
	private short ir;
	private short pc;
	private short mar;
	private short mbr;
	private short msr;
	private short mfr;
	
	//memory
	private short mem[];
	
	// constructor, the register and memory are initiated here
	public CPU()
	{
		ir=pc=mar=mbr=msr=mfr=0;
		cc = new boolean[4];
		r = new short[4];
		x = new short[3];
		mem=new short[2048];
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
				
		}
		//increment pc
		pc++;
		return 0;
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
			
		}
		else
			this.r[r] +=mbr;
	}
	
	private void smr(short r, short x, short address, short indirect)
	{
		short EA = calcEA(x,address,indirect);
		mar = EA;
		mbr = fetchFromMemory(mar);
		if(this.r[r] - mbr<Short.MIN_VALUE)
		{
			
		}
		else
			this.r[r] -=mbr;
	}
	
	private void air(short r, short immed)
	{
		mbr = immed;
		if(this.r[r] + mbr < Short.MAX_VALUE)
		{
			
		}
		else
			this.r[r] +=mbr;
		
	}
	
	private void sir(short r, short immed)
	{
		mbr = immed;
		if(this.r[r] - mbr < Short.MIN_VALUE)
		{
			
		}
		else
			this.r[r] -=mbr;
	}
	



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
