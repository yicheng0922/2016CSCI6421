package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import cpu.CPU;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;

public class UI extends JFrame {
	
	private JPanel contentPane;
	private JTextField Data_txt;
	private JTextField Ins_txt;
	private CPU cpu;
	
	private JRadioButton R0[] = new JRadioButton[16];
	private JRadioButton R1[] = new JRadioButton[16];
	private JRadioButton R2[] = new JRadioButton[16];
	private JRadioButton R3[] = new JRadioButton[16];
	private JRadioButton X1[] = new JRadioButton[16];
	private JRadioButton X2[] = new JRadioButton[16];
	private JRadioButton X3[] = new JRadioButton[16];
	private JRadioButton MAR[] = new JRadioButton[16];
	private JRadioButton MBR[] = new JRadioButton[16];
	private JRadioButton IR[] = new JRadioButton[16];
	private JRadioButton PC[] = new JRadioButton[12];
	//private JRadioButton Mem[] = new JRadioButton[16];
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton Data_R0;
	private JRadioButton Data_R1;
	private JRadioButton Data_R2;
	private JRadioButton Data_R3;
	private JRadioButton Data_Mem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		cpu = new CPU();
		cpu.setPc((short)6);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 950);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JLabel lblGeneralPurposeRegisters = new JLabel("General Purpose Registers (GPRs) "); //GPRs
		lblGeneralPurposeRegisters.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneralPurposeRegisters.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGeneralPurposeRegisters.setBounds(131, 71, 290, 16);
		contentPane.add(lblGeneralPurposeRegisters);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(12, 112, 56, 16);
		contentPane.add(label_2);
		
		R0[0] = new JRadioButton("R0"); //R0 [0]-[15] 16 bits
		R0[0].setEnabled(false);
		R0[0].setBounds(48, 107, 25, 25);
		contentPane.add(R0[0]);
		
		R0[1] = new JRadioButton("R0");
		R0[1].setEnabled(false);
		R0[1].setBounds(77, 107, 25, 25);
		contentPane.add(R0[1]);
		
		R0[2] = new JRadioButton("R0");
		R0[2].setEnabled(false);
		R0[2].setBounds(106, 107, 25, 25);
		contentPane.add(R0[2]);
		
		R0[3] = new JRadioButton("R0");
		R0[3].setEnabled(false);
		R0[3].setBounds(135, 107, 25, 25);
		contentPane.add(R0[3]);
		
		R0[4] = new JRadioButton("R0");
		R0[4].setEnabled(false);
		R0[4].setBounds(164, 107, 25, 25);
		contentPane.add(R0[4]);
		
		R0[5] = new JRadioButton("R0");
		R0[5].setEnabled(false);
		R0[5].setBounds(193, 107, 25, 25);
		contentPane.add(R0[5]);
		
		R0[6] = new JRadioButton("R0");
		R0[6].setEnabled(false);
		R0[6].setBounds(222, 107, 25, 25);
		contentPane.add(R0[6]);
		
		R0[7] = new JRadioButton("R0");
		R0[7].setEnabled(false);
		R0[7].setBounds(251, 107, 25, 25);
		contentPane.add(R0[7]);
		
		R0[8] = new JRadioButton("R0");
		R0[8].setEnabled(false);
		R0[8].setBounds(280, 107, 25, 25);
		contentPane.add(R0[8]);
		
		R0[9] = new JRadioButton("R0");
		R0[9].setEnabled(false);
		R0[9].setBounds(309, 107, 25, 25);
		contentPane.add(R0[9]);
		
		R0[10] = new JRadioButton("R0");
		R0[10].setEnabled(false);
		R0[10].setBounds(338, 107, 25, 25);
		contentPane.add(R0[10]);
		
		R0[11] = new JRadioButton("R0");
		R0[11].setEnabled(false);
		R0[11].setBounds(367, 107, 25, 25);
		contentPane.add(R0[11]);
		
		R0[12] = new JRadioButton("R0");
		R0[12].setEnabled(false);
		R0[12].setBounds(396, 107, 25, 25);
		contentPane.add(R0[12]);
		
		R0[13] = new JRadioButton("R0");
		R0[13].setEnabled(false);
		R0[13].setBounds(425, 107, 25, 25);
		contentPane.add(R0[13]);
		
		R0[14] = new JRadioButton("R0");
		R0[14].setEnabled(false);
		R0[14].setBounds(454, 107, 25, 25);
		contentPane.add(R0[14]);
		
		R0[15] = new JRadioButton("R0");
		R0[15].setEnabled(false);
		R0[15].setBounds(483, 107, 25, 25);
		contentPane.add(R0[15]);
		
		JLabel label = new JLabel("1");
		label.setBounds(12, 141, 56, 16);
		contentPane.add(label);
		
		R1[0] = new JRadioButton("R1");   //R1 [0]-[15] 16 bits
		R1[0].setEnabled(false);
		R1[0].setBounds(48, 137, 25, 25);
		contentPane.add(R1[0]);
		
		R1[1] = new JRadioButton("R1");
		R1[1].setEnabled(false);
		R1[1].setBounds(77, 137, 25, 25);
		contentPane.add(R1[1]);
		
		R1[2] = new JRadioButton("R1");
		R1[2].setEnabled(false);
		R1[2].setBounds(106, 137, 25, 25);
		contentPane.add(R1[2]);
		
		R1[3] = new JRadioButton("R1");
		R1[3].setEnabled(false);
		R1[3].setBounds(135, 137, 25, 25);
		contentPane.add(R1[3]);
		
		R1[4] = new JRadioButton("R1");
		R1[4].setEnabled(false);
		R1[4].setBounds(164, 137, 25, 25);
		contentPane.add(R1[4]);
		
		R1[5] = new JRadioButton("R1");
		R1[5].setEnabled(false);
		R1[5].setBounds(193, 137, 25, 25);
		contentPane.add(R1[5]);
		
		R1[6] = new JRadioButton("R1");
		R1[6].setEnabled(false);
		R1[6].setBounds(222, 137, 25, 25);
		contentPane.add(R1[6]);
		
		R1[7] = new JRadioButton("R1");
		R1[7].setEnabled(false);
		R1[7].setBounds(251, 137, 25, 25);
		contentPane.add(R1[7]);
		
		R1[8] = new JRadioButton("R1");
		R1[8].setEnabled(false);
		R1[8].setBounds(280, 137, 25, 25);
		contentPane.add(R1[8]);
		
		R1[9] = new JRadioButton("R1");
		R1[9].setEnabled(false);
		R1[9].setBounds(309, 137, 25, 25);
		contentPane.add(R1[9]);
		
		R1[10] = new JRadioButton("R1");
		R1[10].setEnabled(false);
		R1[10].setBounds(338, 137, 25, 25);
		contentPane.add(R1[10]);
		
		R1[11] = new JRadioButton("R1");
		R1[11].setEnabled(false);
		R1[11].setBounds(367, 137, 25, 25);
		contentPane.add(R1[11]);
		
		R1[12] = new JRadioButton("R1");
		R1[12].setEnabled(false);
		R1[12].setBounds(396, 137, 25, 25);
		contentPane.add(R1[12]);
		
		R1[13] = new JRadioButton("R1");
		R1[13].setEnabled(false);
		R1[13].setBounds(425, 137, 25, 25);
		contentPane.add(R1[13]);
		
		R1[14] = new JRadioButton("R1");
		R1[14].setEnabled(false);
		R1[14].setBounds(454, 137, 25, 25);
		contentPane.add(R1[14]);
		
		R1[15] = new JRadioButton("R1");
		R1[15].setEnabled(false);
		R1[15].setBounds(483, 137, 25, 25);
		contentPane.add(R1[15]);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(12, 170, 25, 16);
		contentPane.add(label_1);
		
		R2[0] = new JRadioButton("R2");    //R2 [0] -[15] 16 bits
		R2[0].setEnabled(false);
		R2[0].setBounds(48, 167, 25, 25);
		contentPane.add(R2[0]);
		
		R2[1] = new JRadioButton("R2");
		R2[1].setEnabled(false);
		R2[1].setBounds(77, 167, 25, 25);
		contentPane.add(R2[1]);
		
		R2[2] = new JRadioButton("R2");
		R2[2].setEnabled(false);
		R2[2].setBounds(106, 167, 25, 25);
		contentPane.add(R2[2]);
		
		R2[3] = new JRadioButton("R2");
		R2[3].setEnabled(false);
		R2[3].setBounds(135, 167, 25, 25);
		contentPane.add(R2[3]);
		
		R2[4] = new JRadioButton("R2");
		R2[4].setEnabled(false);
		R2[4].setBounds(164, 167, 25, 25);
		contentPane.add(R2[4]);
		
		R2[5] = new JRadioButton("R2");
		R2[5].setEnabled(false);
		R2[5].setBounds(193, 167, 25, 25);
		contentPane.add(R2[5]);
		
		R2[6] = new JRadioButton("R2");
		R2[6].setEnabled(false);
		R2[6].setBounds(222, 167, 25, 25);
		contentPane.add(R2[6]);
		
		R2[7] = new JRadioButton("R2");
		R2[7].setEnabled(false);
		R2[7].setBounds(251, 167, 25, 25);
		contentPane.add(R2[7]);
		
		R2[8] = new JRadioButton("R2");
		R2[8].setEnabled(false);
		R2[8].setBounds(280, 167, 25, 25);
		contentPane.add(R2[8]);
		
		R2[9] = new JRadioButton("R2");
		R2[9].setEnabled(false);
		R2[9].setBounds(309, 167, 25, 25);
		contentPane.add(R2[9]);
		
		R2[10] = new JRadioButton("R2");
		R2[10].setEnabled(false);
		R2[10].setBounds(338, 167, 25, 25);
		contentPane.add(R2[10]);
		
		R2[11] = new JRadioButton("R2");
		R2[11].setEnabled(false);
		R2[11].setBounds(367, 167, 25, 25);
		contentPane.add(R2[11]);
		
		R2[12] = new JRadioButton("R2");
		R2[12].setEnabled(false);
		R2[12].setBounds(396, 167, 25, 25);
		contentPane.add(R2[12]);
		
		R2[13] = new JRadioButton("R2");
		R2[13].setEnabled(false);
		R2[13].setBounds(425, 167, 25, 25);
		contentPane.add(R2[13]);
		
		R2[14] = new JRadioButton("R2");
		R2[14].setEnabled(false);
		R2[14].setBounds(454, 167, 25, 25);
		contentPane.add(R2[14]);		
		
		R2[15] = new JRadioButton("R2");
		R2[15].setEnabled(false);
		R2[15].setBounds(483, 167, 25, 25);
		contentPane.add(R2[15]);
		
		JLabel label_3 = new JLabel("3");
		label_3.setBounds(12, 200, 56, 16);
		contentPane.add(label_3);
		
		R3[0] = new JRadioButton("R3");  //R3 [0]-[15] 16 bits
		R3[0].setEnabled(false);
		R3[0].setBounds(48, 196, 25, 25);
		contentPane.add(R3[0]);
		
		R3[1] = new JRadioButton("R3");
		R3[1].setEnabled(false);
		R3[1].setBounds(77, 196, 25, 25);
		contentPane.add(R3[1]);
		
		R3[2] = new JRadioButton("R3");
		R3[2].setEnabled(false);
		R3[2].setBounds(106, 196, 25, 25);
		contentPane.add(R3[2]);
		
		R3[3] = new JRadioButton("R3");
		R3[3].setEnabled(false);
		R3[3].setBounds(135, 196, 25, 25);
		contentPane.add(R3[3]);
		
		R3[4] = new JRadioButton("R3");
		R3[4].setEnabled(false);
		R3[4].setBounds(164, 196, 25, 25);
		contentPane.add(R3[4]);
		
		R3[5] = new JRadioButton("R3");
		R3[5].setEnabled(false);
		R3[5].setBounds(193, 196, 25, 25);
		contentPane.add(R3[5]);
		
		R3[6] = new JRadioButton("R3");
		R3[6].setEnabled(false);
		R3[6].setBounds(222, 196, 25, 25);
		contentPane.add(R3[6]);
		
		R3[7] = new JRadioButton("R3");
		R3[7].setEnabled(false);
		R3[7].setBounds(251, 196, 25, 25);
		contentPane.add(R3[7]);
		
		R3[8] = new JRadioButton("R3");
		R3[8].setEnabled(false);
		R3[8].setBounds(280, 197, 25, 25);
		contentPane.add(R3[8]);

		R3[9] = new JRadioButton("R3");
		R3[9].setEnabled(false);
		R3[9].setBounds(309, 196, 25, 25);
		contentPane.add(R3[9]);
		
		R3[10] = new JRadioButton("R3");
		R3[10].setEnabled(false);
		R3[10].setBounds(338, 196, 25, 25);
		contentPane.add(R3[10]);
		
		R3[11] = new JRadioButton("R3");
		R3[11].setEnabled(false);
		R3[11].setBounds(367, 196, 25, 25);
		contentPane.add(R3[11]);
		
		R3[12] = new JRadioButton("R3");
		R3[12].setEnabled(false);
		R3[12].setBounds(396, 196, 25, 25);
		contentPane.add(R3[12]);
		
		R3[13] = new JRadioButton("R3");
		R3[13].setEnabled(false);
		R3[13].setBounds(425, 196, 25, 25);
		contentPane.add(R3[13]);
		
		R3[14] = new JRadioButton("R3");
		R3[14].setEnabled(false);
		R3[14].setBounds(454, 196, 25, 25);
		contentPane.add(R3[14]);		
		
		R3[15] = new JRadioButton("R3");
		R3[15].setEnabled(false);
		R3[15].setBounds(483, 196, 25, 25);
		contentPane.add(R3[15]);
		
		JLabel label_4 = new JLabel("1-8");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(135, 230, 54, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("9-16");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(367, 230, 54, 16);
		contentPane.add(label_5);
		
		JRadioButton radioButton_64 = new JRadioButton("1"); // example of bit "1"
		radioButton_64.setEnabled(false);
		radioButton_64.setSelected(true);
		radioButton_64.setBounds(4, 9, 35, 25);
		contentPane.add(radioButton_64);
		
		JRadioButton radioButton_65 = new JRadioButton("0");  // example of bit "0"
		radioButton_65.setEnabled(false);
		radioButton_65.setBounds(48, 9, 35, 25);
		contentPane.add(radioButton_65);
		
		MAR[15] = new JRadioButton("MAR");   //MAR [0] -[15] 16 bits
		MAR[15].setEnabled(false);
		MAR[15].setBounds(1044, 107, 25, 25);
		contentPane.add(MAR[15]);
		
		MAR[14] = new JRadioButton("MAR");
		MAR[14].setEnabled(false);
		MAR[14].setBounds(1015, 107, 25, 25);
		contentPane.add(MAR[14]);
		
		MAR[13] = new JRadioButton("MAR");
		MAR[13].setEnabled(false);
		MAR[13].setBounds(986, 107, 25, 25);
		contentPane.add(MAR[13]);
		
		MAR[12] = new JRadioButton("MAR");
		MAR[12].setEnabled(false);
		MAR[12].setBounds(957, 107, 25, 25);
		contentPane.add(MAR[12]);
		
		MAR[11] = new JRadioButton("MAR");
		MAR[11].setEnabled(false);
		MAR[11].setBounds(928, 107, 25, 25);
		contentPane.add(MAR[11]);
		
		MAR[10] = new JRadioButton("MAR");
		MAR[10].setEnabled(false);
		MAR[10].setBounds(899, 107, 25, 25);
		contentPane.add(MAR[10]);
		
		MAR[9] = new JRadioButton("MAR");
		MAR[9].setEnabled(false);
		MAR[9].setBounds(870, 107, 25, 25);
		contentPane.add(MAR[9]);
		
		MAR[8] = new JRadioButton("MAR");
		MAR[8].setEnabled(false);
		MAR[8].setBounds(841, 107, 25, 25);
		contentPane.add(MAR[8]);
		
		MAR[7] = new JRadioButton("MAR");
		MAR[7].setEnabled(false);
		MAR[7].setBounds(812, 107, 25, 25);
		contentPane.add(MAR[7]);
		
		MAR[6] = new JRadioButton("MAR");
		MAR[6].setEnabled(false);
		MAR[6].setBounds(783, 107, 25, 25);
		contentPane.add(MAR[6]);
		
		MAR[5] = new JRadioButton("MAR");
		MAR[5].setEnabled(false);
		MAR[5].setBounds(754, 107, 25, 25);
		contentPane.add(MAR[5]);
		
		MAR[4] = new JRadioButton("MAR");
		MAR[4].setEnabled(false);
		MAR[4].setBounds(725, 107, 25, 25);
		contentPane.add(MAR[4]);
		
		MAR[3] = new JRadioButton("MAR");
		MAR[3].setEnabled(false);
		MAR[3].setBounds(696, 107, 25, 25);
		contentPane.add(MAR[3]);
		
		MAR[2] = new JRadioButton("MAR");
		MAR[2].setEnabled(false);
		MAR[2].setBounds(667, 107, 25, 25);
		contentPane.add(MAR[2]);
		
		MAR[1] = new JRadioButton("MAR");
		MAR[1].setEnabled(false);
		MAR[1].setBounds(638, 107, 25, 25);
		contentPane.add(MAR[1]);
		
		MAR[0] = new JRadioButton("MAR");
		MAR[0].setEnabled(false);
		MAR[0].setBounds(609, 107, 25, 25);
		contentPane.add(MAR[0]);
		
		MBR[15] = new JRadioButton("MBR");   //MBR [0]-[15] 16 bits
		MBR[15].setEnabled(false);
		MBR[15].setBounds(1044, 167, 25, 25);
		contentPane.add(MBR[15]);
		
		MBR[14] = new JRadioButton("MBR");
		MBR[14].setEnabled(false);
		MBR[14].setBounds(1015, 167, 25, 25);
		contentPane.add(MBR[14]);
		
		MBR[13] = new JRadioButton("MBR");
		MBR[13].setEnabled(false);
		MBR[13].setBounds(986, 167, 25, 25);
		contentPane.add(MBR[13]);
		
		MBR[12] = new JRadioButton("MBR");
		MBR[12].setEnabled(false);
		MBR[12].setBounds(957, 167, 25, 25);
		contentPane.add(MBR[12]);
		
		MBR[11] = new JRadioButton("MBR");
		MBR[11].setEnabled(false);
		MBR[11].setBounds(928, 167, 25, 25);
		contentPane.add(MBR[11]);
		
		MBR[10] = new JRadioButton("MBR");
		MBR[10].setEnabled(false);
		MBR[10].setBounds(899, 167, 25, 25);
		contentPane.add(MBR[10]);
		
		MBR[9] = new JRadioButton("MBR");
		MBR[9].setEnabled(false);
		MBR[9].setBounds(870, 167, 25, 25);
		contentPane.add(MBR[9]);
		
		MBR[8] = new JRadioButton("MBR");
		MBR[8].setEnabled(false);
		MBR[8].setBounds(841, 167, 25, 25);
		contentPane.add(MBR[8]);
		
		MBR[7] = new JRadioButton("MBR");
		MBR[7].setEnabled(false);
		MBR[7].setBounds(812, 167, 25, 25);
		contentPane.add(MBR[7]);
		
		MBR[6] = new JRadioButton("MBR");
		MBR[6].setEnabled(false);
		MBR[6].setBounds(783, 167, 25, 25);
		contentPane.add(MBR[6]);
		
		MBR[5] = new JRadioButton("MBR");
		MBR[5].setEnabled(false);
		MBR[5].setBounds(754, 167, 25, 25);
		contentPane.add(MBR[5]);
		
		MBR[4] = new JRadioButton("MBR");
		MBR[4].setEnabled(false);
		MBR[4].setBounds(725, 167, 25, 25);
		contentPane.add(MBR[4]);
		
		MBR[3] = new JRadioButton("");
		MBR[3].setEnabled(false);
		MBR[3].setBounds(696, 167, 25, 25);
		contentPane.add(MBR[3]);
		
		MBR[2] = new JRadioButton("MBR");
		MBR[2].setEnabled(false);
		MBR[2].setBounds(667, 167, 25, 25);
		contentPane.add(MBR[2]);
		
		MBR[1] = new JRadioButton("MBR");
		MBR[1].setEnabled(false);
		MBR[1].setBounds(638, 167, 25, 25);
		contentPane.add(MBR[1]);
		
		MBR[0] = new JRadioButton("MBR");
		MBR[0].setEnabled(false);
		MBR[0].setBounds(609, 167, 25, 25);
		contentPane.add(MBR[0]);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 240, 74, 16);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(194, 240, 74, 16);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(289, 240, 74, 16);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(434, 240, 74, 16);
		contentPane.add(separator_3);
		
		JLabel lblMemoryAddressRegister = new JLabel("Memory Address Register (MAR)");  //MAR 
		lblMemoryAddressRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemoryAddressRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemoryAddressRegister.setBounds(708, 71, 259, 16);
		contentPane.add(lblMemoryAddressRegister);
		
		JLabel label_6 = new JLabel("1-8");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(696, 230, 54, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("9-16");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(928, 230, 54, 16);
		contentPane.add(label_7);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(619, 240, 74, 16);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(755, 240, 74, 16);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(850, 240, 74, 16);
		contentPane.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(995, 240, 74, 16);
		contentPane.add(separator_7);
		
		JLabel lblMemoryBufferRegister = new JLabel("Memory Buffer Register (MBR)"); //MBR
		lblMemoryBufferRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemoryBufferRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemoryBufferRegister.setBounds(706, 140, 259, 16);
		contentPane.add(lblMemoryBufferRegister);
				
		X2[0] = new JRadioButton("X2");   // X2 [0]-[15] 16 bits
		X2[0].setEnabled(false);
		X2[0].setBounds(48, 337, 25, 25);
		contentPane.add(X2[0]);
		
		X2[1] = new JRadioButton("X2");
		X2[1].setEnabled(false);
		X2[1].setBounds(77, 337, 25, 25);
		contentPane.add(X2[1]);
		
		X2[2] = new JRadioButton("X2");
		X2[2].setEnabled(false);
		X2[2].setBounds(106, 337, 25, 25);
		contentPane.add(X2[2]);
		
		X2[3] = new JRadioButton("X2");
		X2[3].setEnabled(false);
		X2[3].setBounds(135, 337, 25, 25);
		contentPane.add(X2[3]);
		
		X2[4] = new JRadioButton("X2");
		X2[4].setEnabled(false);
		X2[4].setBounds(164, 337, 25, 25);
		contentPane.add(X2[4]);
		
		X2[5] = new JRadioButton("X2");
		X2[5].setEnabled(false);
		X2[5].setBounds(193, 337, 25, 25);
		contentPane.add(X2[5]);
		
		X2[6] = new JRadioButton("X2");
		X2[6].setEnabled(false);
		X2[6].setBounds(222, 337, 25, 25);
		contentPane.add(X2[6]);
		
		X2[7] = new JRadioButton("X2");
		X2[7].setEnabled(false);
		X2[7].setBounds(251, 337, 25, 25);
		contentPane.add(X2[7]);
		
		X2[8] = new JRadioButton("X2");
		X2[8].setEnabled(false);
		X2[8].setBounds(280, 337, 25, 25);
		contentPane.add(X2[8]);
		
		X2[9] = new JRadioButton("X2");
		X2[9].setEnabled(false);
		X2[9].setBounds(309, 337, 25, 25);
		contentPane.add(X2[9]);
		
		X2[10] = new JRadioButton("X2");
		X2[10].setEnabled(false);
		X2[10].setBounds(338, 337, 25, 25);
		contentPane.add(X2[10]);
		
		X2[11] = new JRadioButton("X2");
		X2[11].setEnabled(false);
		X2[11].setBounds(367, 337, 25, 25);
		contentPane.add(X2[11]);
		
		X2[12] = new JRadioButton("X2");
		X2[12].setEnabled(false);
		X2[12].setBounds(396, 337, 25, 25);
		contentPane.add(X2[12]);
		
		X2[13] = new JRadioButton("X2");
		X2[13].setEnabled(false);
		X2[13].setBounds(425, 337, 25, 25);
		contentPane.add(X2[13]);
		
		X2[14] = new JRadioButton("X2");
		X2[14].setEnabled(false);
		X2[14].setBounds(454, 337, 25, 25);
		contentPane.add(X2[14]);
		
		X2[15] = new JRadioButton("X2");
		X2[15].setEnabled(false);
		X2[15].setBounds(483, 337, 25, 25);
		contentPane.add(X2[15]);
		
		X3[0] = new JRadioButton("X2");   //X3 [0]-[15] 16 bits
		X3[0].setEnabled(false);
		X3[0].setBounds(48, 367, 25, 25);
		contentPane.add(X3[0]);
		
		X3[1] = new JRadioButton("X2");
		X3[1].setEnabled(false);
		X3[1].setBounds(77, 367, 25, 25);
		contentPane.add(X3[1]);
		
		X3[2] = new JRadioButton("X2");
		X3[2].setEnabled(false);
		X3[2].setBounds(106, 367, 25, 25);
		contentPane.add(X3[2]);
		
		X3[3] = new JRadioButton("X2");
		X3[3].setEnabled(false);
		X3[3].setBounds(135, 367, 25, 25);
		contentPane.add(X3[3]);
		
		X3[4] = new JRadioButton("X2");
		X3[4].setEnabled(false);
		X3[4].setBounds(164, 367, 25, 25);
		contentPane.add(X3[4]);
		
		X3[5] = new JRadioButton("X2");
		X3[5].setEnabled(false);
		X3[5].setBounds(193, 367, 25, 25);
		contentPane.add(X3[5]);
		
		X3[6] = new JRadioButton("X2");
		X3[6].setEnabled(false);
		X3[6].setBounds(222, 367, 25, 25);
		contentPane.add(X3[6]);
		
		X3[7] = new JRadioButton("X2");
		X3[7].setEnabled(false);
		X3[7].setBounds(251, 367, 25, 25);
		contentPane.add(X3[7]);
		
		X3[8] = new JRadioButton("X2");
		X3[8].setEnabled(false);
		X3[8].setBounds(280, 367, 25, 25);
		contentPane.add(X3[8]);
		
		X3[9] = new JRadioButton("X2");
		X3[9].setEnabled(false);
		X3[9].setBounds(309, 367, 25, 25);
		contentPane.add(X3[9]);
		
		X3[10]= new JRadioButton("X2");
		X3[10].setEnabled(false);
		X3[10].setBounds(338, 367, 25, 25);
		contentPane.add(X3[10]);
		
		X3[11] = new JRadioButton("X2");
		X3[11].setEnabled(false);
		X3[11].setBounds(367, 367, 25, 25);
		contentPane.add(X3[11]);
		
		X3[12] = new JRadioButton("X2");
		X3[12].setEnabled(false);
		X3[12].setBounds(396, 367, 25, 25);
		contentPane.add(X3[12]);
		
		X3[13] = new JRadioButton("X2");
		X3[13].setEnabled(false);
		X3[13].setBounds(425, 367, 25, 25);
		contentPane.add(X3[13]);
		
		X3[14] = new JRadioButton("X2");
		X3[14].setEnabled(false);
		X3[14].setBounds(454, 367, 25, 25);
		contentPane.add(X3[14]);
		
		X3[15] = new JRadioButton("X2");
		X3[15].setEnabled(false);
		X3[15].setBounds(483, 367, 25, 25);
		contentPane.add(X3[15]);
		
		X1[0] = new JRadioButton("X1");  //X1 [0]-[15] 16 bits 
		X1[0].setEnabled(false);
		X1[0].setBounds(48, 307, 25, 25);
		contentPane.add(X1[0]);
		
		X1[1] = new JRadioButton("X1");
		X1[1].setEnabled(false);
		X1[1].setBounds(77, 307, 25, 25);
		contentPane.add(X1[1]);
		
		X1[2] = new JRadioButton("X1");
		X1[2].setEnabled(false);
		X1[2].setBounds(106, 307, 25, 25);
		contentPane.add(X1[2]);
		
		X1[3] = new JRadioButton("X1");
		X1[3].setEnabled(false);
		X1[3].setBounds(135, 307, 25, 25);
		contentPane.add(X1[3]);
		
		X1[4] = new JRadioButton("X1");
		X1[4].setEnabled(false);
		X1[4].setBounds(164, 307, 25, 25);
		contentPane.add(X1[4]);
		
		X1[5] = new JRadioButton("X1");
		X1[5].setEnabled(false);
		X1[5].setBounds(193, 307, 25, 25);
		contentPane.add(X1[5]);
		
		X1[6] = new JRadioButton("X1");
		X1[6].setEnabled(false);
		X1[6].setBounds(222, 307, 25, 25);
		contentPane.add(X1[6]);
		
		X1[7] = new JRadioButton("X1");
		X1[7].setEnabled(false);
		X1[7].setBounds(251, 307, 25, 25);
		contentPane.add(X1[7]);
		
		X1[8] = new JRadioButton("X1");
		X1[8].setEnabled(false);
		X1[8].setBounds(280, 307, 25, 25);
		contentPane.add(X1[8]);
		
		X1[9] = new JRadioButton("X1");
		X1[9].setEnabled(false);
		X1[9].setBounds(309, 307, 25, 25);
		contentPane.add(X1[9]);
		
		X1[10] = new JRadioButton("X1");
		X1[10].setEnabled(false);
		X1[10].setBounds(338, 307, 25, 25);
		contentPane.add(X1[10]);
		
		X1[11] = new JRadioButton("X1");
		X1[11].setEnabled(false);
		X1[11].setBounds(367, 307, 25, 25);
		contentPane.add(X1[11]);
		
		X1[12] = new JRadioButton("X1");
		X1[12].setEnabled(false);
		X1[12].setBounds(396, 307, 25, 25);
		contentPane.add(X1[12]);
		
		X1[13] = new JRadioButton("X1");
		X1[13].setEnabled(false);
		X1[13].setBounds(425, 307, 25, 25);
		contentPane.add(X1[13]);
		
		X1[14] = new JRadioButton("X1");
		X1[14].setEnabled(false);
		X1[14].setBounds(454, 307, 25, 25);
		contentPane.add(X1[14]);
		
		X1[15] = new JRadioButton("X1");
		X1[15].setEnabled(false);
		X1[15].setBounds(483, 307, 25, 25);
		contentPane.add(X1[15]);
		
		JLabel lblIx = new JLabel("IX");                     //Index Register
		lblIx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIx.setHorizontalAlignment(SwingConstants.CENTER);
		lblIx.setBounds(251, 271, 56, 16);
		contentPane.add(lblIx);
		
		IR[11] = new JRadioButton("IR");   //IR [0]-[15] 16 bits
		IR[11].setEnabled(false);
		IR[11].setBounds(928, 307, 25, 25);
		contentPane.add(IR[11]);
		
		IR[10] = new JRadioButton("IR");
		IR[10].setEnabled(false);
		IR[10].setBounds(899, 307, 25, 25);
		contentPane.add(IR[10]);
		
		IR[9] = new JRadioButton("IR");
		IR[9].setEnabled(false);
		IR[9].setBounds(870, 307, 25, 25);
		contentPane.add(IR[9]);
		
		IR[8] = new JRadioButton("IR");
		IR[8].setEnabled(false);
		IR[8].setBounds(841, 307, 25, 25);
		contentPane.add(IR[8]);
		
		IR[7] = new JRadioButton("IR");
		IR[7].setEnabled(false);
		IR[7].setBounds(812, 307, 25, 25);
		contentPane.add(IR[7]);
		
		IR[6] = new JRadioButton("IR");
		IR[6].setEnabled(false);
		IR[6].setBounds(783, 307, 25, 25);
		contentPane.add(IR[6]);
		
		IR[5] = new JRadioButton("IR");
		IR[5].setEnabled(false);
		IR[5].setBounds(754, 307, 25, 25);
		contentPane.add(IR[5]);
		
		IR[4] = new JRadioButton("IR");
		IR[4].setEnabled(false);
		IR[4].setBounds(725, 307, 25, 25);
		contentPane.add(IR[4]);
		
		IR[3] = new JRadioButton("IR");
		IR[3].setEnabled(false);
		IR[3].setBounds(696, 307, 25, 25);
		contentPane.add(IR[3]);
		
		IR[2] = new JRadioButton("IR");
		IR[2].setEnabled(false);
		IR[2].setBounds(667, 307, 25, 25);
		contentPane.add(IR[2]);
		
		IR[1] = new JRadioButton("IR");
		IR[1].setEnabled(false);
		IR[1].setBounds(638, 307, 25, 25);
		contentPane.add(IR[1]);
		
		IR[0] = new JRadioButton("IR");
		IR[0].setEnabled(false);
		IR[0].setBounds(609, 307, 25, 25);
		contentPane.add(IR[0]);
		
		IR[15] = new JRadioButton("IR");
		IR[15].setEnabled(false);
		IR[15].setBounds(1044, 307, 25, 25);
		contentPane.add(IR[15]);
		
		IR[14] = new JRadioButton("IR");
		IR[14].setEnabled(false);
		IR[14].setBounds(1015, 307, 25, 25);
		contentPane.add(IR[14]);
		
		IR[13] = new JRadioButton("IR");
		IR[13].setEnabled(false);
		IR[13].setBounds(986, 307, 25, 25);
		contentPane.add(IR[13]);
		
		IR[12] = new JRadioButton("IR");
		IR[12].setEnabled(false);
		IR[12].setBounds(957, 307, 25, 25);
		contentPane.add(IR[12]);
		
		PC[11] = new JRadioButton("PC");   //PC [0]-[11] 12 bits
		PC[11].setEnabled(false);
		PC[11].setBounds(928, 367, 25, 25);
		contentPane.add(PC[11]);
		
		PC[10] = new JRadioButton("PC");
		PC[10].setEnabled(false);
		PC[10].setBounds(899, 367, 25, 25);
		contentPane.add(PC[10]);
		
		PC[9] = new JRadioButton("PC");
		PC[9].setEnabled(false);
		PC[9].setBounds(870, 367, 25, 25);
		contentPane.add(PC[9]);
		
		PC[8] = new JRadioButton("PC");
		PC[8].setEnabled(false);
		PC[8].setBounds(841, 367, 25, 25);
		contentPane.add(PC[8]);
		
		PC[7] = new JRadioButton("PC");
		PC[7].setEnabled(false);
		PC[7].setBounds(812, 367, 25, 25);
		contentPane.add(PC[7]);
		
		PC[6] = new JRadioButton("PC");
		PC[6].setEnabled(false);
		PC[6].setBounds(783, 367, 25, 25);
		contentPane.add(PC[6]);
		
		PC[5] = new JRadioButton("PC");
		PC[5].setEnabled(false);
		PC[5].setBounds(754, 367, 25, 25);
		contentPane.add(PC[5]);
		
		PC[4] = new JRadioButton("PC");
		PC[4].setEnabled(false);
		PC[4].setBounds(725, 367, 25, 25);
		contentPane.add(PC[4]);
		
		PC[3] = new JRadioButton("PC");
		PC[3].setEnabled(false);
		PC[3].setBounds(696, 367, 25, 25);
		contentPane.add(PC[3]);
		
		PC[2] = new JRadioButton("PC");
		PC[2].setEnabled(false);
		PC[2].setBounds(667, 367, 25, 25);
		contentPane.add(PC[2]);
		
		PC[1] = new JRadioButton("PC");
		PC[1].setEnabled(false);
		PC[1].setBounds(638, 367, 25, 25);
		contentPane.add(PC[1]);
		
		PC[0] = new JRadioButton("PC");
		PC[0].setEnabled(false);
		PC[0].setBounds(609, 367, 25, 25);
		contentPane.add(PC[0]);
		
		JLabel label_11 = new JLabel("Program Counter (PC)");  //PC
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBounds(708, 342, 259, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Instruction Register (IR)"); //IR
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(708, 278, 259, 16);
		contentPane.add(label_12);
		
		JButton Run = new JButton("Run");                    //Run button
		Run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Run.setBounds(222, 667, 97, 25);
		contentPane.add(Run);
		Run.addActionListener(new RunListener());
		
		JButton SS = new JButton("SS");                      //Step by Step button
		SS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SS.setBounds(367, 667, 97, 25);
		contentPane.add(SS);
		SS.addActionListener(new SSListener());
		
		JLabel lblX = new JLabel("X1");
		lblX.setBounds(12, 312, 56, 16);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("X2");
		lblX_1.setBounds(12, 340, 56, 16);
		contentPane.add(lblX_1);
		
		JLabel lblX_2 = new JLabel("X3");
		lblX_2.setBounds(12, 369, 56, 16);
		contentPane.add(lblX_2);
		
		Data_txt = new JTextField();                //enter the data
		Data_txt.setBounds(783, 670, 286, 22);
		contentPane.add(Data_txt);
		Data_txt.setColumns(10);
		
//		JLabel label_8 = new JLabel("Memory");
//		label_8.setHorizontalAlignment(SwingConstants.CENTER);
//		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		label_8.setBounds(708, 401, 259, 16);
//		contentPane.add(label_8);
		
		JButton Load = new JButton("Load");                      //Load button
		Load.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Load.setBounds(77, 667, 97, 25);
		contentPane.add(Load);
		Load.addActionListener(new LoadListener());
		
//		Mem[0] = new JRadioButton("MEM");
//		Mem[0].setEnabled(false);
//		Mem[0].setBounds(609, 426, 25, 25);
//		contentPane.add(Mem[0]);
//		
//		Mem[1] = new JRadioButton("MEM");
//		Mem[1].setEnabled(false);
//		Mem[1].setBounds(638, 426, 25, 25);
//		contentPane.add(Mem[1]);
//		
//		Mem[2] = new JRadioButton("MEM");
//		Mem[2].setEnabled(false);
//		Mem[2].setBounds(667, 426, 25, 25);
//		contentPane.add(Mem[2]);
//		
//		Mem[3] = new JRadioButton("MEM");
//		Mem[3].setEnabled(false);
//		Mem[3].setBounds(696, 426, 25, 25);
//		contentPane.add(Mem[3]);
//		
//		Mem[4] = new JRadioButton("MEM");
//		Mem[4].setEnabled(false);
//		Mem[4].setBounds(725, 426, 25, 25);
//		contentPane.add(Mem[4]);
//		
//		Mem[5] = new JRadioButton("MEM");
//		Mem[5].setEnabled(false);
//		Mem[5].setBounds(754, 426, 25, 25);
//		contentPane.add(Mem[5]);
//		
//		Mem[6] = new JRadioButton("MEM");
//		Mem[6].setEnabled(false);
//		Mem[6].setBounds(783, 426, 25, 25);
//		contentPane.add(Mem[6]);
//		
//		Mem[7] = new JRadioButton("MEM");
//		Mem[7].setEnabled(false);
//		Mem[7].setBounds(812, 426, 25, 25);
//		contentPane.add(Mem[7]);
//		
//		Mem[8] = new JRadioButton("MEM");
//		Mem[8].setEnabled(false);
//		Mem[8].setBounds(841, 426, 25, 25);
//		contentPane.add(Mem[8]);
//		
//		Mem[9] = new JRadioButton("MEM");
//		Mem[9].setEnabled(false);
//		Mem[9].setBounds(870, 426, 25, 25);
//		contentPane.add(Mem[9]);
//		
//		Mem[10] = new JRadioButton("MEM");
//		Mem[10].setEnabled(false);
//		Mem[10].setBounds(899, 426, 25, 25);
//		contentPane.add(Mem[10]);
//		
//		Mem[11] = new JRadioButton("MEM");
//		Mem[11].setEnabled(false);
//		Mem[11].setBounds(928, 426, 25, 25);
//		contentPane.add(Mem[11]);
//		
//		Mem[12] = new JRadioButton("MEM");
//		Mem[12].setEnabled(false);
//		Mem[12].setBounds(957, 426, 25, 25);
//		contentPane.add(Mem[12]);
//		
//		Mem[13] = new JRadioButton("MEM");
//		Mem[13].setEnabled(false);
//		Mem[13].setBounds(986, 426, 25, 25);
//		contentPane.add(Mem[13]);
//		
//		Mem[14] = new JRadioButton("MEM");
//		Mem[14].setEnabled(false);
//		Mem[14].setBounds(1015, 426, 25, 25);
//		contentPane.add(Mem[14]);
//		
//		Mem[15] = new JRadioButton("MEM");
//		Mem[15].setEnabled(false);
//		Mem[15].setBounds(1044, 426, 25, 25);
//		contentPane.add(Mem[15]);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(23, 622, 1057, 2);
		contentPane.add(separator_8);
		
		Ins_txt = new JTextField();                  //enter memory address
		Ins_txt.setColumns(10);
		Ins_txt.setBounds(783, 790, 286, 22);
		contentPane.add(Ins_txt);
		
		JLabel lblEnterData = new JLabel("Enter Data");
		lblEnterData.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterData.setBounds(628, 670, 145, 19);
		contentPane.add(lblEnterData);
		
		JLabel lblEnterIndex = new JLabel("Enter Memory Address");
		lblEnterIndex.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterIndex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterIndex.setBounds(548, 790, 216, 19);
		contentPane.add(lblEnterIndex);
		
		JButton Save = new JButton("Save");         // save button
		Save.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Save.setBounds(783, 841, 93, 32);
		contentPane.add(Save);
		Save.addActionListener(new SaveListener());
		
		Data_R0 = new JRadioButton("R0");           //enter button - R0
		buttonGroup.add(Data_R0);
		Data_R0.setBounds(783, 698, 56, 23);
		contentPane.add(Data_R0);
		
		Data_R1 = new JRadioButton("R1");           //enter button - R1
		buttonGroup.add(Data_R1);
		Data_R1.setBounds(783, 723, 56, 23);
		contentPane.add(Data_R1);
		
		Data_R2 = new JRadioButton("R2");           //enter button - R2
		buttonGroup.add(Data_R2);
		Data_R2.setBounds(876, 699, 62, 23);
		contentPane.add(Data_R2);
		
		Data_R3 = new JRadioButton("R3");           //enter button - R3
		buttonGroup.add(Data_R3);
		Data_R3.setBounds(876, 724, 62, 23);
		contentPane.add(Data_R3);
		
		Data_Mem = new JRadioButton("Memory");      //enter button - memory
		buttonGroup.add(Data_Mem);
		Data_Mem.setBounds(783, 747, 74, 23);
		contentPane.add(Data_Mem);
		
		JButton Clean = new JButton("Clean");           //clean button
		Clean.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Clean.setBounds(928, 841, 93, 32);
		contentPane.add(Clean);
		
		JTextArea textArea = new JTextArea();     //consoles outputs
		textArea.setEnabled(false);
		textArea.setBounds(162, 432, 325, 158);
		contentPane.add(textArea);
		
		JRadioButton rdbtnPc = new JRadioButton("PC");  // pc button
		rdbtnPc.setBounds(876, 747, 62, 23);
		contentPane.add(rdbtnPc);
		
		JRadioButton rdbtnKeyboardInput = new JRadioButton("Keyboard Input"); //keyboard input
		rdbtnKeyboardInput.setBounds(952, 699, 114, 23);
		contentPane.add(rdbtnKeyboardInput);
		
		JLabel lblConso = new JLabel("Consoles Output");  //consoles output text
		lblConso.setHorizontalAlignment(SwingConstants.CENTER);
		lblConso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConso.setBounds(5, 496, 145, 19);
		contentPane.add(lblConso);
		Clean.addActionListener(new CleanListener());
		ShowData();
	}

	//Add load button Listener
	public class LoadListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//Read the file "LoadTXT" which include some instruments
			InputStream f = getClass().getResourceAsStream("/LoadTXT.txt");
			boolean isFirst = true;
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(f));
				String Ins = null;
				int line = 1;
				//Read the file line by line and split the line into two parts by symbol ","
				while ((Ins = reader.readLine()) != null) {
					String[] str = Ins.split(",");
					int index = Integer.parseInt(str[0]);					
					Short con = Integer.valueOf(str[1],2).shortValue();
					if(isFirst){
						cpu.setPc((short) index);
						isFirst=false;
					}
					cpu.setMem(con, index);					
					line++;
				}
				reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e1) {
						
					}
				}
			}
			System.out.println("The PC value is: ");
			System.out.println(cpu.getPc());
			//Call the function to show the data on the screen
			ShowData();
		}
	}
	
	//Add Step by Step button Listener
	public class SSListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//Clean the screen first
			CleanScr();
			//Execute the data which function is in CPU
			cpu.executeNext();
			//Show the data on screen
			ShowData();
		}
	}
	
	//Add Run button Listener
	public class RunListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//Clean the screen first
			CleanScr();		
			
			//When the data is run out, break the execution
			while(true)
			{
				if(cpu.executeNext()==-1)
				{
					break;
				}
			
			}
			//Show the data on screen
			ShowData();
		}	
	}
	
	//Add Save data button Listener
	public class SaveListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Clean the screen first
			CleanScr();
			//Get the data from the textfield
			String Data = Data_txt.getText();
			//Change the data type into short
			Short SData = Integer.valueOf(Data,2).shortValue();
			//Search for which one is changed and clean the screen then show the data
			if (Data_R0.isSelected()) {
				CleanScr();
				cpu.setR0(SData);
				ShowData();
			} else if (Data_R1.isSelected()) {
				CleanScr();
				cpu.setR1(SData);
				ShowData();
			} else if (Data_R2.isSelected()) {
				CleanScr();
				cpu.setR2(SData);
				ShowData();
			} else if (Data_R3.isSelected()) {
				CleanScr();
				cpu.setR3(SData);
				ShowData();
			} else if (Data_Mem.isSelected()) {
				CleanScr();
				String Index = Ins_txt.getText();
				int IIndex = Integer.parseInt(Index);
				cpu.setMem(SData, IIndex);
				ShowData();
			}
		}
	}
	
	//Add Clean button Listener
	public class CleanListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Call for clean the screen function
			CleanScr();
		}
	}
	
	//Set all button to false -- Clean the screen
	public void CleanScr() {
		int a = 0;
		while (a < 16) {
			R0[a].setSelected(false);
			R1[a].setSelected(false);
			R2[a].setSelected(false);
			R3[a].setSelected(false);
			X1[a].setSelected(false);
			X2[a].setSelected(false);
			X3[a].setSelected(false);
			MAR[a].setSelected(false);
			MBR[a].setSelected(false);
			IR[a].setSelected(false);
//			Mem[a].setSelected(false);
			a++;
		}
		int b = 0;
		while (b < 12) {
			PC[b].setSelected(false);
			b++;
		}
	}
	
	//Browse the data and set button to true or false
	public void ShowData() {	
			
			Short SR0= cpu.getR0();
			String strR0 = String.format("%16s",Integer.toBinaryString(SR0.intValue())).replace(' ', '0');
			if(strR0.length()>16){
				strR0=strR0.substring(strR0.length()-16,strR0.length());
			}
			int a = 0;
			while(a < strR0.length()) {
				char[] chara = strR0.toCharArray();
				if (chara[a] == '1') {
					R0[a].setSelected(true);
				} else {
					R0[a].setSelected(false);
				}
				a++;
			}

			Short SR1 = cpu.getR1();
			String strR1 = String.format("%16s",Integer.toBinaryString(SR1.intValue())).replace(' ', '0');
			if(strR1.length()>16){
				strR1=strR1.substring(strR1.length()-16,strR1.length());
			}
			int b = 0;
			while(b < strR1.length()) {
				char[] charb = strR1.toCharArray();
				if (charb[b] == '1') {
					R1[b].setSelected(true);
				} else {
					R1[b].setSelected(false);
				}
				b++;
			}
			
			Short SR2 = cpu.getR2();
			String strR2 = String.format("%16s",Integer.toBinaryString(SR2.intValue())).replace(' ', '0');
			if(strR2.length()>16){
				strR2=strR2.substring(strR2.length()-16,strR2.length());
			}
			int c = 0;
			while(c < strR2.length()) {
				char[] charc = strR2.toCharArray();
				if (charc[c] == '1') {
					R2[c].setSelected(true);
				} else {
					R2[c].setSelected(false);
				}
				c++;
			}
			
			Short SR3 = cpu.getR3();
			String strR3 = String.format("%16s",Integer.toBinaryString(SR3.intValue())).replace(' ', '0');
			if(strR3.length()>16){
				strR3=strR3.substring(strR3.length()-16,strR3.length());
			}
			int d = 0;
			while(d < strR3.length()) {
				char[] chard = strR3.toCharArray();
				if (chard[d] == '1') {
					R3[d].setSelected(true);
				} else {
					R3[d].setSelected(false);
				}
				d++;
			}
			
			Short SX1 = cpu.getX1();
			String strX1 = String.format("%16s",Integer.toBinaryString(SX1.intValue())).replace(' ', '0');
			if(strX1.length()>16){
				strX1=strX1.substring(strX1.length()-16,strX1.length());
			}
			int f = 0;
			while(f < strX1.length()) {
				char[] charf = strX1.toCharArray();
				if (charf[f] == '1') {
					X1[f].setSelected(true);
				} else {
					X1[f].setSelected(false);
				}
				f++;
			}
			
			Short SX2 = cpu.getX2();
			String strX2 = String.format("%16s",Integer.toBinaryString(SX2.intValue())).replace(' ', '0');
			if(strX2.length()>16){
				strX2=strX2.substring(strX2.length()-16,strX2.length());
			}
			int g = 0;
			while(g < strX2.length()) {
				char[] charg = strX2.toCharArray();
				if (charg[g] == '1') {
					X2[g].setSelected(true);
				} else {
					X2[g].setSelected(false);
				}
				g++;
			}
			
			Short SX3 = cpu.getX3();
			String strX3 = String.format("%16s",Integer.toBinaryString(SX3.intValue())).replace(' ', '0');
			if(strX3.length()>16){
				strX3=strX3.substring(strX3.length()-16,strX3.length());
			}
			int h = 0;
			while(h < strX3.length()) {
				char[] charh = strX3.toCharArray();
				if (charh[h] == '1') {
					X3[h].setSelected(true);
				} else {
					X3[h].setSelected(false);
				}
				h++;
			}
			
			Short SMAR = cpu.getMar();
			String strMAR = String.format("%16s",Integer.toBinaryString(SMAR.intValue())).replace(' ', '0');
			if(strX3.length()>16){
				strMAR=strMAR.substring(strMAR.length()-16,strMAR.length());
			}
			int j = 0;
			while(j < strMAR.length()) {
				char[] charj = strMAR.toCharArray();
				if (charj[j] == '1') {
					MAR[j].setSelected(true);
				} else {
					MAR[j].setSelected(false);
				}
				j++;
			}
			
			Short SMBR = cpu.getMbr();
			String strMBR = String.format("%16s",Integer.toBinaryString(SMBR.intValue())).replace(' ', '0');
			if(strMBR.length()>16){
				strMBR=strMBR.substring(strMBR.length()-16,strMBR.length());
			}
			int k = 0;
			while(k < strMBR.length()) {
				char[] chark = strMBR.toCharArray();
				if (chark[k] == '1') {
					MBR[k].setSelected(true);
				} else {
					MBR[k].setSelected(false);
				}
				k++;
			}
			
			Short SIR = cpu.getIr();
			String strIR = String.format("%16s",Integer.toBinaryString(SIR.intValue())).replace(' ', '0');
			if(strIR.length()>12){
				strIR=strIR.substring(strIR.length()-16,strIR.length());
			}
			int l = 0;
			while(l < strIR.length()) {
				char[] charl = strIR.toCharArray();
				if (charl[l] == '1') {
					IR[l].setSelected(true);
				} else {
					IR[l].setSelected(false);
				}
				l++;
			}			
			
			Short SPC = cpu.getPc();
			String strPC = String.format("%12s",Integer.toBinaryString(SPC.intValue())).replace(' ', '0');
			if(strPC.length()>12){
				strPC=strPC.substring(strPC.length()-16,strPC.length());
			}
			int m = 0;
			while(m < strPC.length()) {
				char[] charm = strPC.toCharArray();
				if (charm[m] == '1') {
					PC[m].setSelected(true);
				} else {
					PC[m].setSelected(false);
				}
				m++;
			}			
			
	}
}
