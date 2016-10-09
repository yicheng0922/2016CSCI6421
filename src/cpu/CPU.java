package cpu;

public class CPU {
	
	//registers, limit will be put on for register that are smaller than 16 bits. 
	private boolean[] cc;
	private short[] r,x;
	private short rx,ry;
	private short ri,count,lr,al;
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
			case 20: //mlt
				rx = Short.parseShort(instruction.substring(6,7),2);
				ry = Short.parseShort(instruction.substring(8,9),2);				
				mlt(rx,ry);
				break;
			case 21: //dvd
				rx = Short.parseShort(instruction.substring(6,7),2);
				ry = Short.parseShort(instruction.substring(8,9),2);				
				dvd(rx,ry);
				break;
			case 22: //trr
				rx = Short.parseShort(instruction.substring(6,7),2);
				ry = Short.parseShort(instruction.substring(8,9),2);				
				trr(rx,ry);
				break;
			case 23: //and
				rx = Short.parseShort(instruction.substring(6,7),2);
				ry = Short.parseShort(instruction.substring(8,9),2);				
				and(rx,ry);
				break;
			case 24: //orr
				rx = Short.parseShort(instruction.substring(6,7),2);
				ry = Short.parseShort(instruction.substring(8,9),2);				
				orr(rx,ry);
				break;
			case 25: //not
				rx = Short.parseShort(instruction.substring(6,7),2);				
				not(rx);
				break;
			case 31: //src
				ri = Short.parseShort(instruction.substring(6,7),2);
				count = Short.parseShort(instruction.substring(12,15),2);
				lr = Short.parseShort(instruction.substring(9),2);
				al = Short.parseShort(instruction.substring(8),2);
				src(ri,count,lr,al);
				break;
			case 32: //rrc
				ri = Short.parseShort(instruction.substring(6,7),2);
				count = Short.parseShort(instruction.substring(12,15),2);
				lr = Short.parseShort(instruction.substring(9),2);
				al = Short.parseShort(instruction.substring(8),2);
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
	
	private void mlt(short rx, short ry) {
		if(rx == 1 || rx == 3 || ry == 1 || ry == 3) {
			System.out.println("Rx and Ry must be 0 or 2!");
		} else {
			StringBuffer r1 = new StringBuffer(r[rx]);
			StringBuffer r2 = new StringBuffer(r[ry]);
			int f1 = 1, f2 = 1;
			int r1int, r2int, signbit = 1;
			
			if (r1.charAt(0) == '1') {
				f1 = -1;
				r1.setCharAt(0, '0');
			}
			if (r2.charAt(0) == '1') {
				f2 = -1;
				r2.setCharAt(0, '0');
			}
			signbit = f1 * f2;
			r1int = Integer.parseInt(r1.toString(),2);
			r2int = Integer.parseInt(r2.toString(),2);
			int value = r1int * r2int;
			String temp = Integer.toBinaryString(value);
			if(value > Math.pow(2,  32) - 1) {
				System.out.println("MLT Overflow!");
				cc[0] = true;
			}
			for(int i = temp.length(); i < 31; i++) {
				temp = '0' + temp;
			}
			if(signbit == 1) {
				temp = '0' + temp;
			} else if (signbit == -1) {
				temp = '1' + temp;
			}
			if (rx == 0) {
				setR0(Short.parseShort(temp.substring(0,16)));
				setR1(Short.parseShort(temp.substring(16)));
			} else if (rx ==2) {
				setR2(Short.parseShort(temp.substring(0,16)));
				setR3(Short.parseShort(temp.substring(0,16)));
			}			
		}
	}
	
	private void dvd(short rx, short ry) {
		if(rx == 1 || rx == 3 || ry == 1 || ry ==3) {
			System.out.println("Rx and Ry must be 0 or 2!");
		} else {
			StringBuffer r1 = new StringBuffer(r[rx]);
			StringBuffer r2 = new StringBuffer(r[ry]);
			int f1 = 1; 
			int f2 = 1;
			int r1int, r2int;
			if (r1.charAt(0) == '1') {
				f1 = -1;
				r1.setCharAt(0, '0');
			}
			if (r2.charAt(0) == '1') {
				f2 = -1;
				r2.setCharAt(0, '0');
			}
			r1int = Integer.parseInt(r1.toString(),2);
			r2int = Integer.parseInt(r2.toString(),2);
			if(r2int == 0) {
				System.out.println("MLT DIVZERO!");
				cc[2] = true;
			}
			int quotient = (r1int*f1)/(r2int*f2);
			int reminder = (r1int*f1)%(r2int*f2);
			String temp1 ="1";
			String temp2 = "";
			if (quotient < 0) {
				temp2 = Integer.toBinaryString((quotient -1)).substring(16);
				for(int i = 1; i < 16; i++) {
					if(temp2.charAt(i) == '0') {
						temp1 = temp1 + '1';
					} else if (temp2.charAt(i) == '1') {
						temp1 = temp1 + '0';
					}
				}
			} else if ( quotient >= 0) {
				temp1 = Integer.toBinaryString(quotient);
				for (int j = temp1.length(); j < 16; j++) {
					temp1 = "0" +temp1;
				}
			}
			temp2 = "";
			String temp3 = "1";
			if(reminder < 0) {
				temp2 = Integer.toBinaryString((reminder - 1)).substring(16);
				for (int k = 1; k < 16; k++) {
					if(temp2.charAt(k) == '0') {
						temp3 = temp3 + '1';
					} else if (temp2.charAt(k) == '1') {
						temp3 = temp3 + '0';
					}
				}
			} else if (reminder >= 0) {
				temp3 = Integer.toBinaryString(reminder);
				for (int l = temp3.length(); l < 16; l++) {
					temp3 = "0" + temp3;
				}
			}
			if (rx == 0) {
				setR0(Short.parseShort(temp1));
				setR1(Short.parseShort(temp3));
			} else if (rx == 2) {
				setR2(Short.parseShort(temp1));
				setR3(Short.parseShort(temp3));
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
		String r1 = Short.toString(r[rx]);
		String r2 = Short.toString(r[ry]);
		String temp = "";
		for (int i = 0; i < 16; i++) {
			int aleft = Integer.parseInt(Character.toString(r1.charAt(i)));
			int aright = Integer.parseInt(Character.toString(r2.charAt(i)));
			if((aleft & aright) == 1) {
				temp = temp + '1';
			} else if ((aleft & aright) == 0) {
				temp = temp + '0';
			}
		}
		setRx(rx,temp);
	}
	
	private void orr(short rx, short ry) {
		String r1 = Short.toString(r[rx]);
		String r2 = Short.toString(r[ry]);
		String temp = "";
		for (int i = 0; i < 16; i++) {
			int aleft = Integer.parseInt(Character.toString(r1.charAt(i)));
			int aright = Integer.parseInt(Character.toString(r2.charAt(i)));
			if((aleft | aright) == 1) {
				temp = temp + '1';
			} else if ((aleft |aright) == 0) {
				temp = temp + '0';
			}
		}
		setRx(rx,temp);
	}
	
	private void not(short rx) {
		String r1 = Short.toString(r[rx]);
		String temp = "";
		for(int i = 0; i < 16; i++) {
			if(r1.charAt(i) == '0') {
				temp = temp + '1';
			} else if (r1.charAt(i) == '1') {
				temp = temp + '0';
			}
		}
		setRx(rx,temp);
	}
	
	private void src(short ri, short count, short lr, short al) {
		String lrtemp = Short.toString(lr);
		String altemp = Short.toString(al);
		String rtemp = Short.toString(r[ri]);
		int []buffer = new int[16];
		String result = "";
		for (int t = 0; t < 16; t++) {
			buffer[t] = Integer.parseInt(Character.toString(rtemp.charAt(t)));
		}
		if (altemp.equals("0")) {
			if(lrtemp.equals("0")) {
				for (int a = count; a > 0; a--) {
					if(buffer[15] == 1) {
						System.out.println("SRC Right Shift Underflow!");
						cc[1] = true;
					}
					for(int b = 15; b > 1; b--) {
						buffer[b] = buffer[b-1];
					}
					buffer[1] = 0;
				}
				for (int c = 0; c < buffer.length; c++) {
					result = result + Integer.toString(buffer[c]);
				}
				setRx(ri,result);
			} else if (lrtemp.equals("1")) {
				for(int d =count; d > 0; d--) {
					if(buffer[1] == 1) {
						System.out.println("SRC Left Shift Overflow!");
						cc[0] = true;
					}
					for (int e = 1; e < 15; e++) {
						buffer[e] = buffer[e+1];
					}
					buffer[15] = 0;
				}
				for (int f = 0; f < buffer.length; f++) {
					result = result + Integer.toString(buffer[f]);
				}
				setRx(ri,result);
			}
		} else if(altemp.equals("1")) {
			if(lrtemp.equals("0")) {
				for (int i = count; i > 0; i--) {
					if(buffer[15] == 1) {
						System.out.println("SRC Right Shift Underflow!");
						cc[1] = true;
					}
					for (int j = 15; j > 0; j--) {
						buffer[j] = buffer[j-1];
					}
					buffer[0] = 0;
				}
				for (int k = 0; k < buffer.length; k++) {
					result = result + Integer.toString(buffer[k]);
				}
				setRx(ri,result);
			} else if(lrtemp.equals("1")) {
				for(int l = count; l > 0; l--) {
					if(buffer[0] == 1) {
						System.out.println("SRC Legt Shift Overflow!");
						cc[0] = true;
					}
					for(int m = 0; m < 15; m++) {
						buffer[m] = buffer[m+1];
					}
					buffer[15] = 0;
				}
				for (int n = 0; n < buffer.length; n++) {
					result = result + Integer.toString(buffer[n]);
				}
				setRx(ri,result);
			}
		}
	}
	
	private void rrc(short ri, short count, short lr, short al) {
		String lrtemp = Short.toString(lr);
		String altemp = Short.toString(al);
		String rtemp = Short.toString(r[ri]);
		int []buffer = new int[16];
		String result = "";
		for (int t = 0; t < 16; t++) {
			buffer[t] = Integer.parseInt(Character.toString(rtemp.charAt(t)));
		}
		if(altemp.equals("0")) {
			if(lrtemp.equals("0")){
				for (int a = count; a > 0; a--) {
					int end = buffer[15];
					for (int b = 15; b > 1; b--) {
						buffer[b] = buffer[b-1];
					}
					buffer[1] = end;
				}
				for (int c = 0; c < buffer.length; c++) {
					result = result + Integer.toString(buffer[c]);
				}
				setRx(ri,result);
			} else if (lrtemp.equals("1")) {
				for (int d = count; d > 0; d--) {
					int start = buffer[1];
					for (int e = 15; e > 1; e--) {
						buffer[e] = buffer[e+1];
					}
					buffer[15] = start;
				}
				for (int f = 0; f < buffer.length; f++) {
					result = result + Integer.toString(buffer[f]);
				}
				setRx(ri,result);
			}
		} else if (altemp.equals("1")) {
			if(lrtemp.equals("0")) {
				for (int i = count; i > 0; i--) {
					int end = buffer[15];
					for (int j = 15; j > 1; j--) {
						buffer[j] = buffer[j-1];
					}
					buffer[0] = end;
				}
				for (int k = 0; k < buffer.length; k++) {
					result = result + Integer.toString(buffer[k]);
				}
				setRx(ri,result);
			} else if (lrtemp.equals("1")) {
				for (int l = count; l > 0; l--) {
					int start = buffer[0];
					for (int m = 15; m > 1; m--) {
						buffer[m] = buffer[m+1];
					}
					buffer[15] = start;
				}
				for (int n = 0; n < buffer.length; n++) {
					result = result + Integer.toString(buffer[n]);
				}
				setRx(ri,result);
			}
		}
	}
	

	private void setRx(short r, String c) {
		switch(r) {
		case 0:
			setR0(Short.parseShort(c));
			break;
		case 1:
			setR1(Short.parseShort(c));
			break;
		case 2:
			setR2(Short.parseShort(c));
			break;
		case 3:
			setR3(Short.parseShort(c));
			break;
		}
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
