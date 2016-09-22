package cpu;

public class CPU {
	
	//registers, limit will be put on for register that are smaller than 16 bits. 
	private short r0,r1,r2,r3,x1,x2,x3,ir,pc,mar,mbr,msr,mfr;
	
	//memory
	private short mem[];
	
	public CPU()
	{
		r0=r1=r2=r3=x1=x2=x3=ir=pc=mar=mbr=msr=mfr=0;
		mem=new short[2048];
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



	public short getR0() {
		return r0;
	}





	public void setR0(short r0) {
		this.r0 = r0;
	}





	public short getR1() {
		return r1;
	}





	public void setR1(short r1) {
		this.r1 = r1;
	}





	public short getR2() {
		return r2;
	}





	public void setR2(short r2) {
		this.r2 = r2;
	}





	public short getR3() {
		return r3;
	}





	public void setR3(short r3) {
		this.r3 = r3;
	}





	public short getPc() {
		return pc;
	}





	public void setPc(short pc) {
		this.pc = pc;
	}





	public short getX1() {
		return x1;
	}





	public short getX2() {
		return x2;
	}





	public short getX3() {
		return x3;
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





	public void execute_instruction(short instr)
	{
		
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
}
