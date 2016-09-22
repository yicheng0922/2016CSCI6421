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

public class UI extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField textField;

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
		setBounds(100, 100, 1125, 650);
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
		
		JRadioButton radioButton_66 = new JRadioButton("");
		radioButton_66.setBounds(1044, 107, 25, 25);
		contentPane.add(radioButton_66);
		
		JRadioButton radioButton_67 = new JRadioButton("");
		radioButton_67.setBounds(1015, 107, 25, 25);
		contentPane.add(radioButton_67);
		
		JRadioButton radioButton_68 = new JRadioButton("");
		radioButton_68.setBounds(986, 107, 25, 25);
		contentPane.add(radioButton_68);
		
		JRadioButton radioButton_69 = new JRadioButton("");
		radioButton_69.setBounds(957, 107, 25, 25);
		contentPane.add(radioButton_69);
		
		JRadioButton radioButton_70 = new JRadioButton("");
		radioButton_70.setBounds(928, 107, 25, 25);
		contentPane.add(radioButton_70);
		
		JRadioButton radioButton_71 = new JRadioButton("");
		radioButton_71.setBounds(899, 107, 25, 25);
		contentPane.add(radioButton_71);
		
		JRadioButton radioButton_72 = new JRadioButton("");
		radioButton_72.setBounds(870, 107, 25, 25);
		contentPane.add(radioButton_72);
		
		JRadioButton radioButton_73 = new JRadioButton("");
		radioButton_73.setBounds(841, 107, 25, 25);
		contentPane.add(radioButton_73);
		
		JRadioButton radioButton_74 = new JRadioButton("");
		radioButton_74.setBounds(812, 107, 25, 25);
		contentPane.add(radioButton_74);
		
		JRadioButton radioButton_75 = new JRadioButton("");
		radioButton_75.setBounds(783, 107, 25, 25);
		contentPane.add(radioButton_75);
		
		JRadioButton radioButton_76 = new JRadioButton("");
		radioButton_76.setBounds(754, 107, 25, 25);
		contentPane.add(radioButton_76);
		
		JRadioButton radioButton_77 = new JRadioButton("");
		radioButton_77.setBounds(725, 107, 25, 25);
		contentPane.add(radioButton_77);
		
		JRadioButton radioButton_78 = new JRadioButton("");
		radioButton_78.setBounds(696, 107, 25, 25);
		contentPane.add(radioButton_78);
		
		JRadioButton radioButton_79 = new JRadioButton("");
		radioButton_79.setBounds(667, 107, 25, 25);
		contentPane.add(radioButton_79);
		
		JRadioButton radioButton_80 = new JRadioButton("");
		radioButton_80.setBounds(638, 107, 25, 25);
		contentPane.add(radioButton_80);
		
		JRadioButton radioButton_81 = new JRadioButton("");
		radioButton_81.setBounds(609, 107, 25, 25);
		contentPane.add(radioButton_81);
		
		JRadioButton radioButton_82 = new JRadioButton("");
		radioButton_82.setBounds(1044, 167, 25, 25);
		contentPane.add(radioButton_82);
		
		JRadioButton radioButton_83 = new JRadioButton("");
		radioButton_83.setBounds(1015, 167, 25, 25);
		contentPane.add(radioButton_83);
		
		JRadioButton radioButton_84 = new JRadioButton("");
		radioButton_84.setBounds(986, 167, 25, 25);
		contentPane.add(radioButton_84);
		
		JRadioButton radioButton_85 = new JRadioButton("");
		radioButton_85.setBounds(957, 167, 25, 25);
		contentPane.add(radioButton_85);
		
		JRadioButton radioButton_86 = new JRadioButton("");
		radioButton_86.setBounds(928, 167, 25, 25);
		contentPane.add(radioButton_86);
		
		JRadioButton radioButton_87 = new JRadioButton("");
		radioButton_87.setBounds(899, 167, 25, 25);
		contentPane.add(radioButton_87);
		
		JRadioButton radioButton_88 = new JRadioButton("");
		radioButton_88.setBounds(870, 167, 25, 25);
		contentPane.add(radioButton_88);
		
		JRadioButton radioButton_89 = new JRadioButton("");
		radioButton_89.setBounds(841, 167, 25, 25);
		contentPane.add(radioButton_89);
		
		JRadioButton radioButton_90 = new JRadioButton("");
		radioButton_90.setBounds(812, 167, 25, 25);
		contentPane.add(radioButton_90);
		
		JRadioButton radioButton_91 = new JRadioButton("");
		radioButton_91.setBounds(783, 167, 25, 25);
		contentPane.add(radioButton_91);
		
		JRadioButton radioButton_92 = new JRadioButton("");
		radioButton_92.setBounds(754, 167, 25, 25);
		contentPane.add(radioButton_92);
		
		JRadioButton radioButton_93 = new JRadioButton("");
		radioButton_93.setBounds(725, 167, 25, 25);
		contentPane.add(radioButton_93);
		
		JRadioButton radioButton_94 = new JRadioButton("");
		radioButton_94.setBounds(696, 167, 25, 25);
		contentPane.add(radioButton_94);
		
		JRadioButton radioButton_95 = new JRadioButton("");
		radioButton_95.setBounds(667, 167, 25, 25);
		contentPane.add(radioButton_95);
		
		JRadioButton radioButton_96 = new JRadioButton("");
		radioButton_96.setBounds(638, 167, 25, 25);
		contentPane.add(radioButton_96);
		
		JRadioButton radioButton_97 = new JRadioButton("");
		radioButton_97.setBounds(609, 167, 25, 25);
		contentPane.add(radioButton_97);
		
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
		
		JRadioButton radioButton_98 = new JRadioButton("");
		radioButton_98.setBounds(483, 337, 25, 25);
		contentPane.add(radioButton_98);
		
		JRadioButton radioButton_99 = new JRadioButton("");
		radioButton_99.setBounds(48, 337, 25, 25);
		contentPane.add(radioButton_99);
		
		JRadioButton radioButton_100 = new JRadioButton("");
		radioButton_100.setBounds(77, 337, 25, 25);
		contentPane.add(radioButton_100);
		
		JRadioButton radioButton_101 = new JRadioButton("");
		radioButton_101.setBounds(106, 337, 25, 25);
		contentPane.add(radioButton_101);
		
		JRadioButton radioButton_102 = new JRadioButton("");
		radioButton_102.setBounds(135, 337, 25, 25);
		contentPane.add(radioButton_102);
		
		JRadioButton radioButton_103 = new JRadioButton("");
		radioButton_103.setBounds(164, 337, 25, 25);
		contentPane.add(radioButton_103);
		
		JRadioButton radioButton_104 = new JRadioButton("");
		radioButton_104.setBounds(193, 337, 25, 25);
		contentPane.add(radioButton_104);
		
		JRadioButton radioButton_105 = new JRadioButton("");
		radioButton_105.setBounds(222, 337, 25, 25);
		contentPane.add(radioButton_105);
		
		JRadioButton radioButton_106 = new JRadioButton("");
		radioButton_106.setBounds(251, 337, 25, 25);
		contentPane.add(radioButton_106);
		
		JRadioButton radioButton_107 = new JRadioButton("");
		radioButton_107.setBounds(280, 337, 25, 25);
		contentPane.add(radioButton_107);
		
		JRadioButton radioButton_108 = new JRadioButton("");
		radioButton_108.setBounds(309, 337, 25, 25);
		contentPane.add(radioButton_108);
		
		JRadioButton radioButton_109 = new JRadioButton("");
		radioButton_109.setBounds(338, 337, 25, 25);
		contentPane.add(radioButton_109);
		
		JRadioButton radioButton_110 = new JRadioButton("");
		radioButton_110.setBounds(367, 337, 25, 25);
		contentPane.add(radioButton_110);
		
		JRadioButton radioButton_111 = new JRadioButton("");
		radioButton_111.setBounds(396, 337, 25, 25);
		contentPane.add(radioButton_111);
		
		JRadioButton radioButton_112 = new JRadioButton("");
		radioButton_112.setBounds(425, 337, 25, 25);
		contentPane.add(radioButton_112);
		
		JRadioButton radioButton_113 = new JRadioButton("");
		radioButton_113.setBounds(454, 337, 25, 25);
		contentPane.add(radioButton_113);
		
		JRadioButton radioButton_114 = new JRadioButton("");
		radioButton_114.setBounds(48, 367, 25, 25);
		contentPane.add(radioButton_114);
		
		JRadioButton radioButton_115 = new JRadioButton("");
		radioButton_115.setBounds(483, 367, 25, 25);
		contentPane.add(radioButton_115);
		
		JRadioButton radioButton_116 = new JRadioButton("");
		radioButton_116.setBounds(77, 367, 25, 25);
		contentPane.add(radioButton_116);
		
		JRadioButton radioButton_117 = new JRadioButton("");
		radioButton_117.setBounds(106, 367, 25, 25);
		contentPane.add(radioButton_117);
		
		JRadioButton radioButton_118 = new JRadioButton("");
		radioButton_118.setBounds(135, 367, 25, 25);
		contentPane.add(radioButton_118);
		
		JRadioButton radioButton_119 = new JRadioButton("");
		radioButton_119.setBounds(164, 367, 25, 25);
		contentPane.add(radioButton_119);
		
		JRadioButton radioButton_120 = new JRadioButton("");
		radioButton_120.setBounds(193, 367, 25, 25);
		contentPane.add(radioButton_120);
		
		JRadioButton radioButton_121 = new JRadioButton("");
		radioButton_121.setBounds(222, 367, 25, 25);
		contentPane.add(radioButton_121);
		
		JRadioButton radioButton_122 = new JRadioButton("");
		radioButton_122.setBounds(251, 367, 25, 25);
		contentPane.add(radioButton_122);
		
		JRadioButton radioButton_123 = new JRadioButton("");
		radioButton_123.setBounds(280, 367, 25, 25);
		contentPane.add(radioButton_123);
		
		JRadioButton radioButton_124 = new JRadioButton("");
		radioButton_124.setBounds(309, 367, 25, 25);
		contentPane.add(radioButton_124);
		
		JRadioButton radioButton_125 = new JRadioButton("");
		radioButton_125.setBounds(338, 367, 25, 25);
		contentPane.add(radioButton_125);
		
		JRadioButton radioButton_126 = new JRadioButton("");
		radioButton_126.setBounds(367, 367, 25, 25);
		contentPane.add(radioButton_126);
		
		JRadioButton radioButton_127 = new JRadioButton("");
		radioButton_127.setBounds(396, 367, 25, 25);
		contentPane.add(radioButton_127);
		
		JRadioButton radioButton_128 = new JRadioButton("");
		radioButton_128.setBounds(425, 367, 25, 25);
		contentPane.add(radioButton_128);
		
		JRadioButton radioButton_129 = new JRadioButton("");
		radioButton_129.setBounds(454, 367, 25, 25);
		contentPane.add(radioButton_129);
		
		JRadioButton radioButton_130 = new JRadioButton("");
		radioButton_130.setBounds(48, 307, 25, 25);
		contentPane.add(radioButton_130);
		
		JRadioButton radioButton_131 = new JRadioButton("");
		radioButton_131.setBounds(483, 307, 25, 25);
		contentPane.add(radioButton_131);
		
		JRadioButton radioButton_132 = new JRadioButton("");
		radioButton_132.setBounds(77, 307, 25, 25);
		contentPane.add(radioButton_132);
		
		JRadioButton radioButton_133 = new JRadioButton("");
		radioButton_133.setBounds(106, 307, 25, 25);
		contentPane.add(radioButton_133);
		
		JRadioButton radioButton_134 = new JRadioButton("");
		radioButton_134.setBounds(135, 307, 25, 25);
		contentPane.add(radioButton_134);
		
		JRadioButton radioButton_135 = new JRadioButton("");
		radioButton_135.setBounds(164, 307, 25, 25);
		contentPane.add(radioButton_135);
		
		JRadioButton radioButton_136 = new JRadioButton("");
		radioButton_136.setBounds(193, 307, 25, 25);
		contentPane.add(radioButton_136);
		
		JRadioButton radioButton_137 = new JRadioButton("");
		radioButton_137.setBounds(222, 307, 25, 25);
		contentPane.add(radioButton_137);
		
		JRadioButton radioButton_138 = new JRadioButton("");
		radioButton_138.setBounds(251, 307, 25, 25);
		contentPane.add(radioButton_138);
		
		JRadioButton radioButton_139 = new JRadioButton("");
		radioButton_139.setBounds(280, 307, 25, 25);
		contentPane.add(radioButton_139);
		
		JRadioButton radioButton_140 = new JRadioButton("");
		radioButton_140.setBounds(309, 307, 25, 25);
		contentPane.add(radioButton_140);
		
		JRadioButton radioButton_141 = new JRadioButton("");
		radioButton_141.setBounds(338, 307, 25, 25);
		contentPane.add(radioButton_141);
		
		JRadioButton radioButton_142 = new JRadioButton("");
		radioButton_142.setBounds(367, 307, 25, 25);
		contentPane.add(radioButton_142);
		
		JRadioButton radioButton_143 = new JRadioButton("");
		radioButton_143.setBounds(396, 307, 25, 25);
		contentPane.add(radioButton_143);
		
		JRadioButton radioButton_144 = new JRadioButton("");
		radioButton_144.setBounds(425, 307, 25, 25);
		contentPane.add(radioButton_144);
		
		JRadioButton radioButton_145 = new JRadioButton("");
		radioButton_145.setBounds(454, 307, 25, 25);
		contentPane.add(radioButton_145);
		
		JLabel lblIx = new JLabel("IX");
		lblIx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIx.setHorizontalAlignment(SwingConstants.CENTER);
		lblIx.setBounds(251, 271, 56, 16);
		contentPane.add(lblIx);
		
		JRadioButton radioButton_150 = new JRadioButton("");
		radioButton_150.setBounds(928, 307, 25, 25);
		contentPane.add(radioButton_150);
		
		JRadioButton radioButton_151 = new JRadioButton("");
		radioButton_151.setBounds(899, 307, 25, 25);
		contentPane.add(radioButton_151);
		
		JRadioButton radioButton_152 = new JRadioButton("");
		radioButton_152.setBounds(870, 307, 25, 25);
		contentPane.add(radioButton_152);
		
		JRadioButton radioButton_153 = new JRadioButton("");
		radioButton_153.setBounds(841, 307, 25, 25);
		contentPane.add(radioButton_153);
		
		JRadioButton radioButton_154 = new JRadioButton("");
		radioButton_154.setBounds(812, 307, 25, 25);
		contentPane.add(radioButton_154);
		
		JRadioButton radioButton_155 = new JRadioButton("");
		radioButton_155.setBounds(783, 307, 25, 25);
		contentPane.add(radioButton_155);
		
		JRadioButton radioButton_156 = new JRadioButton("");
		radioButton_156.setBounds(754, 307, 25, 25);
		contentPane.add(radioButton_156);
		
		JRadioButton radioButton_157 = new JRadioButton("");
		radioButton_157.setBounds(725, 307, 25, 25);
		contentPane.add(radioButton_157);
		
		JRadioButton radioButton_158 = new JRadioButton("");
		radioButton_158.setBounds(696, 307, 25, 25);
		contentPane.add(radioButton_158);
		
		JRadioButton radioButton_159 = new JRadioButton("");
		radioButton_159.setBounds(667, 307, 25, 25);
		contentPane.add(radioButton_159);
		
		JRadioButton radioButton_160 = new JRadioButton("");
		radioButton_160.setBounds(638, 307, 25, 25);
		contentPane.add(radioButton_160);
		
		JRadioButton radioButton_161 = new JRadioButton("");
		radioButton_161.setBounds(609, 307, 25, 25);
		contentPane.add(radioButton_161);
		
		JRadioButton radioButton_162 = new JRadioButton("");
		radioButton_162.setBounds(1044, 307, 25, 25);
		contentPane.add(radioButton_162);
		
		JRadioButton radioButton_163 = new JRadioButton("");
		radioButton_163.setBounds(1015, 307, 25, 25);
		contentPane.add(radioButton_163);
		
		JRadioButton radioButton_164 = new JRadioButton("");
		radioButton_164.setBounds(986, 307, 25, 25);
		contentPane.add(radioButton_164);
		
		JRadioButton radioButton_165 = new JRadioButton("");
		radioButton_165.setBounds(957, 307, 25, 25);
		contentPane.add(radioButton_165);
		
		JRadioButton radioButton_166 = new JRadioButton("");
		radioButton_166.setBounds(928, 367, 25, 25);
		contentPane.add(radioButton_166);
		
		JRadioButton radioButton_167 = new JRadioButton("");
		radioButton_167.setBounds(899, 367, 25, 25);
		contentPane.add(radioButton_167);
		
		JRadioButton radioButton_168 = new JRadioButton("");
		radioButton_168.setBounds(870, 367, 25, 25);
		contentPane.add(radioButton_168);
		
		JRadioButton radioButton_169 = new JRadioButton("");
		radioButton_169.setBounds(841, 367, 25, 25);
		contentPane.add(radioButton_169);
		
		JRadioButton radioButton_170 = new JRadioButton("");
		radioButton_170.setBounds(812, 367, 25, 25);
		contentPane.add(radioButton_170);
		
		JRadioButton radioButton_171 = new JRadioButton("");
		radioButton_171.setBounds(783, 367, 25, 25);
		contentPane.add(radioButton_171);
		
		JRadioButton radioButton_172 = new JRadioButton("");
		radioButton_172.setBounds(754, 367, 25, 25);
		contentPane.add(radioButton_172);
		
		JRadioButton radioButton_173 = new JRadioButton("");
		radioButton_173.setBounds(725, 367, 25, 25);
		contentPane.add(radioButton_173);
		
		JRadioButton radioButton_174 = new JRadioButton("");
		radioButton_174.setBounds(696, 367, 25, 25);
		contentPane.add(radioButton_174);
		
		JRadioButton radioButton_175 = new JRadioButton("");
		radioButton_175.setBounds(667, 367, 25, 25);
		contentPane.add(radioButton_175);
		
		JRadioButton radioButton_176 = new JRadioButton("");
		radioButton_176.setBounds(638, 367, 25, 25);
		contentPane.add(radioButton_176);
		
		JRadioButton radioButton_177 = new JRadioButton("");
		radioButton_177.setBounds(609, 367, 25, 25);
		contentPane.add(radioButton_177);
		
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
		
		JButton btnRun = new JButton("Run");
		btnRun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRun.setBounds(222, 456, 97, 25);
		contentPane.add(btnRun);
		btnRun.addActionListener(new RunListener());
		
		JButton button = new JButton("SS");
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBounds(367, 456, 97, 25);
		contentPane.add(button);
		button.addActionListener(new SSListener());
		
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
		
		textField = new JTextField();
		textField.setBounds(663, 546, 348, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_8 = new JLabel("Memory");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(708, 401, 259, 16);
		contentPane.add(label_8);
		
		JButton button_1 = new JButton("Load");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBounds(77, 456, 97, 25);
		contentPane.add(button_1);
		button_1.addActionListener(new LoadListener());
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
}
