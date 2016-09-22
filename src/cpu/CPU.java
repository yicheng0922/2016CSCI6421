package cpu;

public class CPU {
	
	//registers, limit will be put on for register that are smaller than 16 bits. 
	private short[] r,x;
	private short ir,pc,mar,mbr,msr,mfr;
	
	//memory
	private short mem[];
	
	public CPU()
	{
		ir=pc=mar=mbr=msr=mfr=0;
		r = new short[4];
		x = new short[3];
		mem=new short[2048];
		for(short i:r)
		{
			i=0;
		}
		for(short i:x)
		{
			i=0;
		}
		for(short i:mem)
		{
			i=0;
		}
	}
	
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

	private short fetchFromMemory(short address)
	{
		if(address < 6||address>2048)
		{
			mfr=3;
			mem[4] = pc;
			return -1;
		}
		else
		{
			return mem[address];
		}
	}
	
	private void executeNext()
	{
		mar = pc;
		mbr = fetchFromMemory(mar);
		
		if(mbr == -1)
		{
			return;
		}
		
		ir = mbr;
		String instruction = String.format("%16d", Integer.toBinaryString(ir));
		short optcode = Short.parseShort(instruction.substring(0, 6),2);
		short r,x,i,address;
		switch (optcode)
		{
			case 1:
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				ldr(r,x,address,i);
				break;
			case 2:
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				str(r,x,address,i);
				break;
			case 3:
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				lda(r,x,address,i);
				break;
			case 4:
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				amr(r,x,address,i);
				break;
			case 5:
				r = Short.parseShort(instruction.substring(6,8),2);
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				smr(r,x,address,i);
				break;
			case 6:
				r = Short.parseShort(instruction.substring(6,8),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				air(r,address);
				break;
			case 7:
				r = Short.parseShort(instruction.substring(6,8),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				sir(r,address);
				break;
			case 33:
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				ldx(x,address,i);
				break;
			case 34:
				x = Short.parseShort(instruction.substring(8,10),2);
				i = Short.parseShort(instruction.substring(10,11),2);
				address = Short.parseShort(instruction.substring(11,16),2);
				stx(x,address,i);
				break;
				
		}
		pc++;
		
	}
	
	private short calcEA(short x,short address,short i)
	{
		short result=-1;
		
		
		return result;
	}
	
	private void ldr(short r, short x, short address, short indirect)
	{
		
	}
	
	private void str(short r, short x, short address, short indirect)
	{
		
	}
	
	private void lda(short r, short x, short address, short indirect)
	{
		
	}
	
	private void ldx(short x, short address, short indirect)
	{
		
	}
	
	private void stx(short x, short address, short indirect)
	{
		
	}
	
	private void amr(short r, short x, short address, short indirect)
	{
		
	}
	
	private void smr(short r, short x, short address, short indirect)
	{
		
	}
	
	private void air(short r, short immed)
	{
		
	}
	
	private void sir(short r, short immed)
	{
		
	}
	



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
		return x[1];
	}





	public short getX2() {
		return x[2];
	}





	public short getX3() {
		return x[3];
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
