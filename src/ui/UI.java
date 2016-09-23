package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;

import cpu.CPU;

public class UI extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField Data_txt;
	private JTextField Ins_txt;
	

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1125, 829);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton R1_16 = new JRadioButton("");
		R1_16.setAction(action);
		R1_16.setBounds(483, 137, 25, 25);
		contentPane.add(R1_16);
		
		JRadioButton R1_1 = new JRadioButton("");
		R1_1.setBounds(48, 137, 25, 25);
		contentPane.add(R1_1);
		
		JRadioButton R1_2 = new JRadioButton("");
		R1_2.setBounds(77, 137, 25, 25);
		contentPane.add(R1_2);
		
		JRadioButton R1_3 = new JRadioButton("");
		R1_3.setBounds(106, 137, 25, 25);
		contentPane.add(R1_3);
		
		JRadioButton R1_4 = new JRadioButton("");
		R1_4.setBounds(135, 137, 25, 25);
		contentPane.add(R1_4);
		
		JRadioButton R1_5 = new JRadioButton("");
		R1_5.setBounds(164, 137, 25, 25);
		contentPane.add(R1_5);
		
		JRadioButton R1_6 = new JRadioButton("");
		R1_6.setBounds(193, 137, 25, 25);
		contentPane.add(R1_6);
		
		JRadioButton R1_7 = new JRadioButton("");
		R1_7.setBounds(222, 137, 25, 25);
		contentPane.add(R1_7);
		
		JRadioButton R1_8 = new JRadioButton("");
		R1_8.setBounds(251, 137, 25, 25);
		contentPane.add(R1_8);
		
		JRadioButton R1_9 = new JRadioButton("");
		R1_9.setBounds(280, 137, 25, 25);
		contentPane.add(R1_9);
		
		JRadioButton R1_10 = new JRadioButton("");
		R1_10.setBounds(309, 137, 25, 25);
		contentPane.add(R1_10);
		
		JRadioButton R1_11 = new JRadioButton("");
		R1_11.setBounds(338, 137, 25, 25);
		contentPane.add(R1_11);
		
		JRadioButton R1_12 = new JRadioButton("");
		R1_12.setBounds(367, 137, 25, 25);
		contentPane.add(R1_12);
		
		JRadioButton R1_13 = new JRadioButton("");
		R1_13.setBounds(396, 137, 25, 25);
		contentPane.add(R1_13);
		
		JRadioButton R1_14 = new JRadioButton("");
		R1_14.setBounds(425, 137, 25, 25);
		contentPane.add(R1_14);
		
		JRadioButton R1_15 = new JRadioButton("");
		R1_15.setBounds(454, 137, 25, 25);
		contentPane.add(R1_15);
		
		JLabel label = new JLabel("1");
		label.setBounds(12, 141, 56, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(12, 170, 25, 16);
		contentPane.add(label_1);
		
		JRadioButton R2_1 = new JRadioButton("");
		R2_1.setBounds(48, 167, 25, 25);
		contentPane.add(R2_1);
		
		JRadioButton R2_16 = new JRadioButton("");
		R2_16.setBounds(483, 167, 25, 25);
		contentPane.add(R2_16);
		
		JRadioButton R2_2 = new JRadioButton("");
		R2_2.setBounds(77, 167, 25, 25);
		contentPane.add(R2_2);
		
		JRadioButton R2_3 = new JRadioButton("");
		R2_3.setBounds(106, 167, 25, 25);
		contentPane.add(R2_3);
		
		JRadioButton R2_4 = new JRadioButton("");
		R2_4.setBounds(135, 167, 25, 25);
		contentPane.add(R2_4);
		
		JRadioButton R2_5 = new JRadioButton("");
		R2_5.setBounds(164, 167, 25, 25);
		contentPane.add(R2_5);
		
		JRadioButton R2_6 = new JRadioButton("");
		R2_6.setBounds(193, 167, 25, 25);
		contentPane.add(R2_6);
		
		JRadioButton R2_7 = new JRadioButton("");
		R2_7.setBounds(222, 167, 25, 25);
		contentPane.add(R2_7);
		
		JRadioButton R2_8 = new JRadioButton("");
		R2_8.setBounds(251, 167, 25, 25);
		contentPane.add(R2_8);
		
		JRadioButton R2_9 = new JRadioButton("");
		R2_9.setBounds(280, 167, 25, 25);
		contentPane.add(R2_9);
		
		JRadioButton R2_10 = new JRadioButton("");
		R2_10.setBounds(309, 167, 25, 25);
		contentPane.add(R2_10);
		
		JRadioButton R2_11 = new JRadioButton("");
		R2_11.setBounds(338, 167, 25, 25);
		contentPane.add(R2_11);
		
		JRadioButton R2_12 = new JRadioButton("");
		R2_12.setBounds(367, 167, 25, 25);
		contentPane.add(R2_12);
		
		JRadioButton R2_13 = new JRadioButton("");
		R2_13.setBounds(396, 167, 25, 25);
		contentPane.add(R2_13);
		
		JRadioButton R2_14 = new JRadioButton("");
		R2_14.setBounds(425, 167, 25, 25);
		contentPane.add(R2_14);
		
		JRadioButton R2_15 = new JRadioButton("");
		R2_15.setBounds(454, 167, 25, 25);
		contentPane.add(R2_15);
		
		JRadioButton R3_1 = new JRadioButton("");
		R3_1.setBounds(48, 196, 25, 25);
		contentPane.add(R3_1);
		
		JRadioButton R3_16 = new JRadioButton("");
		R3_16.setBounds(483, 196, 25, 25);
		contentPane.add(R3_16);
		
		JRadioButton R3_2 = new JRadioButton("");
		R3_2.setBounds(77, 196, 25, 25);
		contentPane.add(R3_2);
		
		JRadioButton R3_3 = new JRadioButton("");
		R3_3.setBounds(106, 196, 25, 25);
		contentPane.add(R3_3);
		
		JRadioButton R3_4 = new JRadioButton("");
		R3_4.setBounds(135, 196, 25, 25);
		contentPane.add(R3_4);
		
		JRadioButton R3_5 = new JRadioButton("");
		R3_5.setBounds(164, 196, 25, 25);
		contentPane.add(R3_5);
		
		JRadioButton R3_6 = new JRadioButton("");
		R3_6.setBounds(193, 196, 25, 25);
		contentPane.add(R3_6);
		
		JRadioButton R3_7 = new JRadioButton("");
		R3_7.setBounds(222, 196, 25, 25);
		contentPane.add(R3_7);
		
		JRadioButton R3_8 = new JRadioButton("");
		R3_8.setBounds(251, 196, 25, 25);
		contentPane.add(R3_8);
		
		JRadioButton radioButton_41 = new JRadioButton("");
		radioButton_41.setBounds(251, 137, 25, 25);
		contentPane.add(radioButton_41);
		
		JRadioButton R3_10 = new JRadioButton("");
		R3_10.setBounds(309, 196, 25, 25);
		contentPane.add(R3_10);
		
		JRadioButton R3_11 = new JRadioButton("");
		R3_11.setBounds(338, 196, 25, 25);
		contentPane.add(R3_11);
		
		JRadioButton R3_12 = new JRadioButton("");
		R3_12.setBounds(367, 196, 25, 25);
		contentPane.add(R3_12);
		
		JRadioButton R3_13 = new JRadioButton("");
		R3_13.setBounds(396, 196, 25, 25);
		contentPane.add(R3_13);
		
		JRadioButton R3_14 = new JRadioButton("");
		R3_14.setBounds(425, 196, 25, 25);
		contentPane.add(R3_14);
		
		JRadioButton R3_15 = new JRadioButton("");
		R3_15.setBounds(454, 196, 25, 25);
		contentPane.add(R3_15);
		
		JRadioButton R0_1 = new JRadioButton("");
		R0_1.setBounds(48, 107, 25, 25);
		contentPane.add(R0_1);
		
		JRadioButton R0_16 = new JRadioButton("");
		R0_16.setBounds(483, 107, 25, 25);
		contentPane.add(R0_16);
		
		JRadioButton R0_2 = new JRadioButton("");
		R0_2.setBounds(77, 107, 25, 25);
		contentPane.add(R0_2);
		
		JRadioButton R0_3 = new JRadioButton("");
		R0_3.setBounds(106, 107, 25, 25);
		contentPane.add(R0_3);
		
		JRadioButton R0_4 = new JRadioButton("");
		R0_4.setBounds(135, 107, 25, 25);
		contentPane.add(R0_4);
		
		JRadioButton R0_5 = new JRadioButton("");
		R0_5.setBounds(164, 107, 25, 25);
		contentPane.add(R0_5);
		
		JRadioButton R0_6 = new JRadioButton("");
		R0_6.setBounds(193, 107, 25, 25);
		contentPane.add(R0_6);
		
		JRadioButton R0_7 = new JRadioButton("");
		R0_7.setBounds(222, 107, 25, 25);
		contentPane.add(R0_7);
		
		JRadioButton R0_8 = new JRadioButton("");
		R0_8.setBounds(251, 107, 25, 25);
		contentPane.add(R0_8);
		
		JRadioButton R0_9 = new JRadioButton("");
		R0_9.setBounds(280, 107, 25, 25);
		contentPane.add(R0_9);
		
		JRadioButton R0_10 = new JRadioButton("");
		R0_10.setBounds(309, 107, 25, 25);
		contentPane.add(R0_10);
		
		JRadioButton R0_11 = new JRadioButton("");
		R0_11.setBounds(338, 107, 25, 25);
		contentPane.add(R0_11);
		
		JRadioButton R0_12 = new JRadioButton("");
		R0_12.setBounds(367, 107, 25, 25);
		contentPane.add(R0_12);
		
		JRadioButton R0_13 = new JRadioButton("");
		R0_13.setBounds(396, 107, 25, 25);
		contentPane.add(R0_13);
		
		JRadioButton R0_14 = new JRadioButton("");
		R0_14.setBounds(425, 107, 25, 25);
		contentPane.add(R0_14);
		
		JRadioButton R0_15 = new JRadioButton("");
		R0_15.setBounds(454, 107, 25, 25);
		contentPane.add(R0_15);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(12, 112, 56, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("3");
		label_3.setBounds(12, 200, 56, 16);
		contentPane.add(label_3);
		
		JLabel lblGeneralPurposeRegisters = new JLabel("General Purpose Registers (GPRs) ");
		lblGeneralPurposeRegisters.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneralPurposeRegisters.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGeneralPurposeRegisters.setBounds(131, 71, 290, 16);
		contentPane.add(lblGeneralPurposeRegisters);
		
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
		
		JRadioButton radioButton_64 = new JRadioButton("1");
		radioButton_64.setSelected(true);
		radioButton_64.setBounds(4, 9, 35, 25);
		contentPane.add(radioButton_64);
		
		JRadioButton radioButton_65 = new JRadioButton("0");
		radioButton_65.setBounds(48, 9, 35, 25);
		contentPane.add(radioButton_65);
		
		JRadioButton MAR_16 = new JRadioButton("");
		MAR_16.setBounds(1044, 107, 25, 25);
		contentPane.add(MAR_16);
		
		JRadioButton MAR_15 = new JRadioButton("");
		MAR_15.setBounds(1015, 107, 25, 25);
		contentPane.add(MAR_15);
		
		JRadioButton MAR_14 = new JRadioButton("");
		MAR_14.setBounds(986, 107, 25, 25);
		contentPane.add(MAR_14);
		
		JRadioButton MAR_13 = new JRadioButton("");
		MAR_13.setBounds(957, 107, 25, 25);
		contentPane.add(MAR_13);
		
		JRadioButton MAR_12 = new JRadioButton("");
		MAR_12.setBounds(928, 107, 25, 25);
		contentPane.add(MAR_12);
		
		JRadioButton MAR_11 = new JRadioButton("");
		MAR_11.setBounds(899, 107, 25, 25);
		contentPane.add(MAR_11);
		
		JRadioButton MAR_10 = new JRadioButton("");
		MAR_10.setBounds(870, 107, 25, 25);
		contentPane.add(MAR_10);
		
		JRadioButton MAR_9 = new JRadioButton("");
		MAR_9.setBounds(841, 107, 25, 25);
		contentPane.add(MAR_9);
		
		JRadioButton MAR_8 = new JRadioButton("");
		MAR_8.setBounds(812, 107, 25, 25);
		contentPane.add(MAR_8);
		
		JRadioButton MAR_7 = new JRadioButton("");
		MAR_7.setBounds(783, 107, 25, 25);
		contentPane.add(MAR_7);
		
		JRadioButton MAR_6 = new JRadioButton("");
		MAR_6.setBounds(754, 107, 25, 25);
		contentPane.add(MAR_6);
		
		JRadioButton MAR_5 = new JRadioButton("");
		MAR_5.setBounds(725, 107, 25, 25);
		contentPane.add(MAR_5);
		
		JRadioButton MAR_4 = new JRadioButton("");
		MAR_4.setBounds(696, 107, 25, 25);
		contentPane.add(MAR_4);
		
		JRadioButton MAR_3 = new JRadioButton("");
		MAR_3.setBounds(667, 107, 25, 25);
		contentPane.add(MAR_3);
		
		JRadioButton MAR_2 = new JRadioButton("");
		MAR_2.setBounds(638, 107, 25, 25);
		contentPane.add(MAR_2);
		
		JRadioButton MAR_1 = new JRadioButton("");
		MAR_1.setBounds(609, 107, 25, 25);
		contentPane.add(MAR_1);
		
		JRadioButton MBR_16 = new JRadioButton("");
		MBR_16.setBounds(1044, 167, 25, 25);
		contentPane.add(MBR_16);
		
		JRadioButton MBR_15 = new JRadioButton("");
		MBR_15.setBounds(1015, 167, 25, 25);
		contentPane.add(MBR_15);
		
		JRadioButton MBR_14 = new JRadioButton("");
		MBR_14.setBounds(986, 167, 25, 25);
		contentPane.add(MBR_14);
		
		JRadioButton MBR_13 = new JRadioButton("");
		MBR_13.setBounds(957, 167, 25, 25);
		contentPane.add(MBR_13);
		
		JRadioButton MBR_12 = new JRadioButton("");
		MBR_12.setBounds(928, 167, 25, 25);
		contentPane.add(MBR_12);
		
		JRadioButton MBR_11 = new JRadioButton("");
		MBR_11.setBounds(899, 167, 25, 25);
		contentPane.add(MBR_11);
		
		JRadioButton MBR_10 = new JRadioButton("");
		MBR_10.setBounds(870, 167, 25, 25);
		contentPane.add(MBR_10);
		
		JRadioButton MBR_9 = new JRadioButton("");
		MBR_9.setBounds(841, 167, 25, 25);
		contentPane.add(MBR_9);
		
		JRadioButton MBR_8 = new JRadioButton("");
		MBR_8.setBounds(812, 167, 25, 25);
		contentPane.add(MBR_8);
		
		JRadioButton MBR_7 = new JRadioButton("");
		MBR_7.setBounds(783, 167, 25, 25);
		contentPane.add(MBR_7);
		
		JRadioButton MBR_6 = new JRadioButton("");
		MBR_6.setBounds(754, 167, 25, 25);
		contentPane.add(MBR_6);
		
		JRadioButton MBR_5 = new JRadioButton("");
		MBR_5.setBounds(725, 167, 25, 25);
		contentPane.add(MBR_5);
		
		JRadioButton MBR_4 = new JRadioButton("");
		MBR_4.setBounds(696, 167, 25, 25);
		contentPane.add(MBR_4);
		
		JRadioButton MBR_3 = new JRadioButton("");
		MBR_3.setBounds(667, 167, 25, 25);
		contentPane.add(MBR_3);
		
		JRadioButton MBR_2 = new JRadioButton("");
		MBR_2.setBounds(638, 167, 25, 25);
		contentPane.add(MBR_2);
		
		JRadioButton MBR_1 = new JRadioButton("");
		MBR_1.setBounds(609, 167, 25, 25);
		contentPane.add(MBR_1);
		
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
		
		JLabel lblMemoryAddressRegister = new JLabel("Memory Address Register (MAR)");
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
		
		JLabel lblMemoryBufferRegister = new JLabel("Memory Buffer Register (MBR)");
		lblMemoryBufferRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemoryBufferRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMemoryBufferRegister.setBounds(706, 140, 259, 16);
		contentPane.add(lblMemoryBufferRegister);
		
		JRadioButton X2_16 = new JRadioButton("");
		X2_16.setBounds(483, 337, 25, 25);
		contentPane.add(X2_16);
		
		JRadioButton X2_1 = new JRadioButton("");
		X2_1.setBounds(48, 337, 25, 25);
		contentPane.add(X2_1);
		
		JRadioButton X2_2 = new JRadioButton("");
		X2_2.setBounds(77, 337, 25, 25);
		contentPane.add(X2_2);
		
		JRadioButton X2_3 = new JRadioButton("");
		X2_3.setBounds(106, 337, 25, 25);
		contentPane.add(X2_3);
		
		JRadioButton X2_4 = new JRadioButton("");
		X2_4.setBounds(135, 337, 25, 25);
		contentPane.add(X2_4);
		
		JRadioButton X2_5 = new JRadioButton("");
		X2_5.setBounds(164, 337, 25, 25);
		contentPane.add(X2_5);
		
		JRadioButton X2_6 = new JRadioButton("");
		X2_6.setBounds(193, 337, 25, 25);
		contentPane.add(X2_6);
		
		JRadioButton X2_7 = new JRadioButton("");
		X2_7.setBounds(222, 337, 25, 25);
		contentPane.add(X2_7);
		
		JRadioButton X2_8 = new JRadioButton("");
		X2_8.setBounds(251, 337, 25, 25);
		contentPane.add(X2_8);
		
		JRadioButton X2_9 = new JRadioButton("");
		X2_9.setBounds(280, 337, 25, 25);
		contentPane.add(X2_9);
		
		JRadioButton X2_10 = new JRadioButton("");
		X2_10.setBounds(309, 337, 25, 25);
		contentPane.add(X2_10);
		
		JRadioButton X2_11 = new JRadioButton("");
		X2_11.setBounds(338, 337, 25, 25);
		contentPane.add(X2_11);
		
		JRadioButton X2_12 = new JRadioButton("");
		X2_12.setBounds(367, 337, 25, 25);
		contentPane.add(X2_12);
		
		JRadioButton X2_13 = new JRadioButton("");
		X2_13.setBounds(396, 337, 25, 25);
		contentPane.add(X2_13);
		
		JRadioButton X2_14 = new JRadioButton("");
		X2_14.setBounds(425, 337, 25, 25);
		contentPane.add(X2_14);
		
		JRadioButton X2_15 = new JRadioButton("");
		X2_15.setBounds(454, 337, 25, 25);
		contentPane.add(X2_15);
		
		JRadioButton X3_1 = new JRadioButton("");
		X3_1.setBounds(48, 367, 25, 25);
		contentPane.add(X3_1);
		
		JRadioButton X3_16 = new JRadioButton("");
		X3_16.setBounds(483, 367, 25, 25);
		contentPane.add(X3_16);
		
		JRadioButton X3_2 = new JRadioButton("");
		X3_2.setBounds(77, 367, 25, 25);
		contentPane.add(X3_2);
		
		JRadioButton X3_3 = new JRadioButton("");
		X3_3.setBounds(106, 367, 25, 25);
		contentPane.add(X3_3);
		
		JRadioButton X3_4 = new JRadioButton("");
		X3_4.setBounds(135, 367, 25, 25);
		contentPane.add(X3_4);
		
		JRadioButton X3_5 = new JRadioButton("");
		X3_5.setBounds(164, 367, 25, 25);
		contentPane.add(X3_5);
		
		JRadioButton X3_6 = new JRadioButton("");
		X3_6.setBounds(193, 367, 25, 25);
		contentPane.add(X3_6);
		
		JRadioButton X3_7 = new JRadioButton("");
		X3_7.setBounds(222, 367, 25, 25);
		contentPane.add(X3_7);
		
		JRadioButton X3_8 = new JRadioButton("");
		X3_8.setBounds(251, 367, 25, 25);
		contentPane.add(X3_8);
		
		JRadioButton X3_9 = new JRadioButton("");
		X3_9.setBounds(280, 367, 25, 25);
		contentPane.add(X3_9);
		
		JRadioButton X3_10 = new JRadioButton("");
		X3_10.setBounds(309, 367, 25, 25);
		contentPane.add(X3_10);
		
		JRadioButton X3_11 = new JRadioButton("");
		X3_11.setBounds(338, 367, 25, 25);
		contentPane.add(X3_11);
		
		JRadioButton X3_12 = new JRadioButton("");
		X3_12.setBounds(367, 367, 25, 25);
		contentPane.add(X3_12);
		
		JRadioButton X3_13 = new JRadioButton("");
		X3_13.setBounds(396, 367, 25, 25);
		contentPane.add(X3_13);
		
		JRadioButton X3_14 = new JRadioButton("");
		X3_14.setBounds(425, 367, 25, 25);
		contentPane.add(X3_14);
		
		JRadioButton X3_15 = new JRadioButton("");
		X3_15.setBounds(454, 367, 25, 25);
		contentPane.add(X3_15);
		
		JRadioButton X1_1 = new JRadioButton("");
		X1_1.setBounds(48, 307, 25, 25);
		contentPane.add(X1_1);
		
		JRadioButton X1_16 = new JRadioButton("");
		X1_16.setBounds(483, 307, 25, 25);
		contentPane.add(X1_16);
		
		JRadioButton X1_2 = new JRadioButton("");
		X1_2.setBounds(77, 307, 25, 25);
		contentPane.add(X1_2);
		
		JRadioButton X1_3 = new JRadioButton("");
		X1_3.setBounds(106, 307, 25, 25);
		contentPane.add(X1_3);
		
		JRadioButton X1_4 = new JRadioButton("");
		X1_4.setBounds(135, 307, 25, 25);
		contentPane.add(X1_4);
		
		JRadioButton X1_5 = new JRadioButton("");
		X1_5.setBounds(164, 307, 25, 25);
		contentPane.add(X1_5);
		
		JRadioButton X1_6 = new JRadioButton("");
		X1_6.setBounds(193, 307, 25, 25);
		contentPane.add(X1_6);
		
		JRadioButton X1_7 = new JRadioButton("");
		X1_7.setBounds(222, 307, 25, 25);
		contentPane.add(X1_7);
		
		JRadioButton X1_8 = new JRadioButton("");
		X1_8.setBounds(251, 307, 25, 25);
		contentPane.add(X1_8);
		
		JRadioButton X1_9 = new JRadioButton("");
		X1_9.setBounds(280, 307, 25, 25);
		contentPane.add(X1_9);
		
		JRadioButton X1_10 = new JRadioButton("");
		X1_10.setBounds(309, 307, 25, 25);
		contentPane.add(X1_10);
		
		JRadioButton X1_11 = new JRadioButton("");
		X1_11.setBounds(338, 307, 25, 25);
		contentPane.add(X1_11);
		
		JRadioButton X1_12 = new JRadioButton("");
		X1_12.setBounds(367, 307, 25, 25);
		contentPane.add(X1_12);
		
		JRadioButton X1_13 = new JRadioButton("");
		X1_13.setBounds(396, 307, 25, 25);
		contentPane.add(X1_13);
		
		JRadioButton X1_14 = new JRadioButton("");
		X1_14.setBounds(425, 307, 25, 25);
		contentPane.add(X1_14);
		
		JRadioButton X1_15 = new JRadioButton("");
		X1_15.setBounds(454, 307, 25, 25);
		contentPane.add(X1_15);
		
		JLabel lblIx = new JLabel("IX");
		lblIx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIx.setHorizontalAlignment(SwingConstants.CENTER);
		lblIx.setBounds(251, 271, 56, 16);
		contentPane.add(lblIx);
		
		JRadioButton IR_12 = new JRadioButton("");
		IR_12.setBounds(928, 307, 25, 25);
		contentPane.add(IR_12);
		
		JRadioButton IR_11 = new JRadioButton("");
		IR_11.setBounds(899, 307, 25, 25);
		contentPane.add(IR_11);
		
		JRadioButton IR_10 = new JRadioButton("");
		IR_10.setBounds(870, 307, 25, 25);
		contentPane.add(IR_10);
		
		JRadioButton IR_9 = new JRadioButton("");
		IR_9.setBounds(841, 307, 25, 25);
		contentPane.add(IR_9);
		
		JRadioButton IR_8 = new JRadioButton("");
		IR_8.setBounds(812, 307, 25, 25);
		contentPane.add(IR_8);
		
		JRadioButton IR_7 = new JRadioButton("");
		IR_7.setBounds(783, 307, 25, 25);
		contentPane.add(IR_7);
		
		JRadioButton IR_6 = new JRadioButton("");
		IR_6.setBounds(754, 307, 25, 25);
		contentPane.add(IR_6);
		
		JRadioButton IR_5 = new JRadioButton("");
		IR_5.setBounds(725, 307, 25, 25);
		contentPane.add(IR_5);
		
		JRadioButton IR_4 = new JRadioButton("");
		IR_4.setBounds(696, 307, 25, 25);
		contentPane.add(IR_4);
		
		JRadioButton IR_3 = new JRadioButton("");
		IR_3.setBounds(667, 307, 25, 25);
		contentPane.add(IR_3);
		
		JRadioButton IR_2 = new JRadioButton("");
		IR_2.setBounds(638, 307, 25, 25);
		contentPane.add(IR_2);
		
		JRadioButton IR_1 = new JRadioButton("");
		IR_1.setBounds(609, 307, 25, 25);
		contentPane.add(IR_1);
		
		JRadioButton IR_16 = new JRadioButton("");
		IR_16.setBounds(1044, 307, 25, 25);
		contentPane.add(IR_16);
		
		JRadioButton IR_15 = new JRadioButton("");
		IR_15.setBounds(1015, 307, 25, 25);
		contentPane.add(IR_15);
		
		JRadioButton IR_14 = new JRadioButton("");
		IR_14.setBounds(986, 307, 25, 25);
		contentPane.add(IR_14);
		
		JRadioButton IR_13 = new JRadioButton("");
		IR_13.setBounds(957, 307, 25, 25);
		contentPane.add(IR_13);
		
		JRadioButton PC_12 = new JRadioButton("");
		PC_12.setBounds(928, 367, 25, 25);
		contentPane.add(PC_12);
		
		JRadioButton PC_11 = new JRadioButton("");
		PC_11.setBounds(899, 367, 25, 25);
		contentPane.add(PC_11);
		
		JRadioButton PC_10 = new JRadioButton("");
		PC_10.setBounds(870, 367, 25, 25);
		contentPane.add(PC_10);
		
		JRadioButton PC_9 = new JRadioButton("");
		PC_9.setBounds(841, 367, 25, 25);
		contentPane.add(PC_9);
		
		JRadioButton PC_8 = new JRadioButton("");
		PC_8.setBounds(812, 367, 25, 25);
		contentPane.add(PC_8);
		
		JRadioButton PC_7 = new JRadioButton("");
		PC_7.setBounds(783, 367, 25, 25);
		contentPane.add(PC_7);
		
		JRadioButton PC_6 = new JRadioButton("");
		PC_6.setBounds(754, 367, 25, 25);
		contentPane.add(PC_6);
		
		JRadioButton PC_5 = new JRadioButton("");
		PC_5.setBounds(725, 367, 25, 25);
		contentPane.add(PC_5);
		
		JRadioButton PC_4 = new JRadioButton("");
		PC_4.setBounds(696, 367, 25, 25);
		contentPane.add(PC_4);
		
		JRadioButton PC_3 = new JRadioButton("");
		PC_3.setBounds(667, 367, 25, 25);
		contentPane.add(PC_3);
		
		JRadioButton PC_2 = new JRadioButton("");
		PC_2.setBounds(638, 367, 25, 25);
		contentPane.add(PC_2);
		
		JRadioButton PC_1 = new JRadioButton("");
		PC_1.setBounds(609, 367, 25, 25);
		contentPane.add(PC_1);
		
		JLabel label_11 = new JLabel("Program Counter (PC)");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBounds(708, 342, 259, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Instruction Register (IR)");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(708, 278, 259, 16);
		contentPane.add(label_12);
		
		JButton Run = new JButton("Run");
		Run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Run.setBounds(222, 551, 97, 25);
		contentPane.add(Run);
		Run.addActionListener(new RunListener());
		
		JButton SS = new JButton("SS");
		SS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SS.setBounds(367, 551, 97, 25);
		contentPane.add(SS);
		SS.addActionListener(new SSListener());
		
		JRadioButton R3_9 = new JRadioButton("");
		R3_9.setBounds(280, 197, 25, 25);
		contentPane.add(R3_9);
		
		JLabel lblX = new JLabel("X1");
		lblX.setBounds(12, 312, 56, 16);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("X2");
		lblX_1.setBounds(12, 340, 56, 16);
		contentPane.add(lblX_1);
		
		JLabel lblX_2 = new JLabel("X3");
		lblX_2.setBounds(12, 369, 56, 16);
		contentPane.add(lblX_2);
		
		Data_txt = new JTextField();
		Data_txt.setBounds(783, 553, 286, 22);
		contentPane.add(Data_txt);
		Data_txt.setColumns(10);
		
		JLabel label_8 = new JLabel("Memory");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(708, 401, 259, 16);
		contentPane.add(label_8);
		
		JButton Load = new JButton("Load");
		Load.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Load.setBounds(77, 551, 97, 25);
		contentPane.add(Load);
		Load.addActionListener(new LoadListener());
		
		JRadioButton MEM_1 = new JRadioButton("");
		MEM_1.setBounds(609, 426, 25, 25);
		contentPane.add(MEM_1);
		
		JRadioButton MEM_2 = new JRadioButton("");
		MEM_2.setBounds(638, 426, 25, 25);
		contentPane.add(MEM_2);
		
		JRadioButton MEM_3 = new JRadioButton("");
		MEM_3.setBounds(667, 426, 25, 25);
		contentPane.add(MEM_3);
		
		JRadioButton MEM_4 = new JRadioButton("");
		MEM_4.setBounds(696, 426, 25, 25);
		contentPane.add(MEM_4);
		
		JRadioButton MEM_5 = new JRadioButton("");
		MEM_5.setBounds(725, 426, 25, 25);
		contentPane.add(MEM_5);
		
		JRadioButton MEM_6 = new JRadioButton("");
		MEM_6.setBounds(754, 426, 25, 25);
		contentPane.add(MEM_6);
		
		JRadioButton MEM_7 = new JRadioButton("");
		MEM_7.setBounds(783, 426, 25, 25);
		contentPane.add(MEM_7);
		
		JRadioButton MEM_8 = new JRadioButton("");
		MEM_8.setBounds(812, 426, 25, 25);
		contentPane.add(MEM_8);
		
		JRadioButton MEM_9 = new JRadioButton("");
		MEM_9.setBounds(841, 426, 25, 25);
		contentPane.add(MEM_9);
		
		JRadioButton MEM_10 = new JRadioButton("");
		MEM_10.setBounds(870, 426, 25, 25);
		contentPane.add(MEM_10);
		
		JRadioButton MEM_11 = new JRadioButton("");
		MEM_11.setBounds(899, 426, 25, 25);
		contentPane.add(MEM_11);
		
		JRadioButton MEM_12 = new JRadioButton("");
		MEM_12.setBounds(928, 426, 25, 25);
		contentPane.add(MEM_12);
		
		JRadioButton MEM_13 = new JRadioButton("");
		MEM_13.setBounds(957, 426, 25, 25);
		contentPane.add(MEM_13);
		
		JRadioButton MEM_14 = new JRadioButton("");
		MEM_14.setBounds(986, 426, 25, 25);
		contentPane.add(MEM_14);
		
		JRadioButton MEM_15 = new JRadioButton("");
		MEM_15.setBounds(1015, 426, 25, 25);
		contentPane.add(MEM_15);
		
		JRadioButton MEM_16 = new JRadioButton("");
		MEM_16.setBounds(1044, 426, 25, 25);
		contentPane.add(MEM_16);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(23, 501, 1057, 2);
		contentPane.add(separator_8);
		
		JButton Data_run = new JButton("Enter data");
		Data_run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Data_run.setBounds(619, 551, 152, 25);
		contentPane.add(Data_run);
		Data_run.addActionListener(new RunDataListener());
		
		JButton Ins_run = new JButton("Enter instruction");
		Ins_run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Ins_run.setBounds(619, 609, 152, 25);
		contentPane.add(Ins_run);
		Ins_run.addActionListener(new RunInsListener());
		
		Ins_txt = new JTextField();
		Ins_txt.setColumns(10);
		Ins_txt.setBounds(783, 611, 286, 22);
		contentPane.add(Ins_txt);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	public class LoadListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			File f = new File("src/LoadTXT.txt");
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(f));
				String Ins = null;
				int line = 1;
				while ((Ins = reader.readLine()) != null) {
					String[] str = Ins.split(",");
					int index = Integer.parseInt(str[0]);
					
					//Short con = new Short(str[1]);
					//System.out.println(con);					
					
					//CPU.setMem(con, index);					
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
		}
	}
	
	public class SSListener implements ActionListener{
		public void actionPerformed(ActionEvent e){		
		
		}	
	}
	
	public class RunListener implements ActionListener{
		public void actionPerformed(ActionEvent e){		
		
		}	
	}
	
	public class RunDataListener implements ActionListener{
		public void actionPerformed(ActionEvent e){		
		
		}	
	}
	
	public class RunInsListener implements ActionListener{
		public void actionPerformed(ActionEvent e){		
		
		}	
	}
}
