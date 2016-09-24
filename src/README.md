# 2016CSCI6421
Computer simulator
1. In this UI design, each circle indicates 1 bit in GPRs, IX, MAR, MBR, IR, and PC.
The circle with a black spot presents ¡°1¡± in binary system. The hollow circle presents ¡°0¡± in binary system.
2. General Purpose Registers (GPRs) R0-R3. It is a quickly accessible location available to a digital processor¡¯s central processing unit. From left to right is number 1 bit to number 16 bit.
3. Index Register X1, X2, and X3. It contains a base address that supports base register addressing of memory. From left to right is number 1 bit to number 16 bit.
4. Memory Address Register (MAR). It holds the address of the word to be fetched from memory. From left to right is number 1 bit to number 16 bit.
5. Memory Buffer Register (MBR). It holds the word just fetched from or the word to be last stored into memory. From left to right is number 1 bit to number 16 bit.
6. Instruction Register (IR). It holds the instruction to be executed. From left to right is number 1 bit to number 16 bit.
7. Program Counter (PC). It is the address of next instruction to be executed. From left to right is number 1 bit to number 12 bit.
8. Button Load, Run, and SS
Load: This button is used to load an instruction txt file in the src folder, and PC will show user the value when load is done.
Run: This button is used to execute the instruction file. The file will be executed to the end if user use this button.
SS: This button is used to execute the instruction step by step. When user clicks this button, it will run one line in the instruction file.
9. Button Save and Clean. 
Save: This button is used to save and execute what users have put in. There are five choices for users to choose where to store the data: R0, R1, R2, R3 or Memory. Data will be read from the data text field. If users want to save data into memory, they must enter the address of the memory in memory address text field.
Clean: This button is used to set all button in UI to ¡°false¡± for next step.
10. Data text field and Memory Address text field.
Data text field: This field asks users to enter 16-digit binary code for data.
Memory Address text field: This field asks users to enter an integer that among 6 and 2048.