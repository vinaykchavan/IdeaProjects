package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Rectangle;

public class calculat {
	private JFrame frmBasicCalculator;
	private JTextField textField;
	String EnterNum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculat window = new calculat();
					window.frmBasicCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBasicCalculator = new JFrame();
		frmBasicCalculator.setBounds(new Rectangle(0, 0, 279, 370));
		frmBasicCalculator.setAlwaysOnTop(true);
		frmBasicCalculator.setTitle("Basic Calculator");
		frmBasicCalculator.setType(Type.POPUP);
		frmBasicCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(7, 11, 239, 62);
		frmBasicCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnterNum= textField.getText() + btn7.getText();
				textField.setText(EnterNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 91, 50, 50);
		frmBasicCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 91, 50, 50);
		frmBasicCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 91, 50, 50);
		frmBasicCalculator.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(7, 152, 50, 50);
		frmBasicCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 152, 50, 50);
		frmBasicCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 152, 50, 50);
		frmBasicCalculator.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 213, 50, 50);
		frmBasicCalculator.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 274, 50, 50);
		frmBasicCalculator.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 213, 50, 50);
		frmBasicCalculator.getContentPane().add(btn2);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				EnterNum="";
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(70, 274, 50, 50);
		frmBasicCalculator.getContentPane().add(btnC);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 213, 50, 50);
		frmBasicCalculator.getContentPane().add(btn3);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicCalculator cal1=new BasicCalculator();
				double temp=cal1.calculate1(EnterNum);
				System.out.println(temp);
				Integer temp1=(int)temp;
				String temp2=String.valueOf(temp1);
				textField.setText(temp2);
				EnterNum="";
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(130, 274, 50, 50);
		frmBasicCalculator.getContentPane().add(btnequal);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum= textField.getText() + btnplus.getText();
				textField.setText(EnterNum);
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(190, 91, 50, 50);
		frmBasicCalculator.getContentPane().add(btnplus);
		
		JButton btnmin = new JButton("-");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum= textField.getText() + btnmin.getText();
				textField.setText(EnterNum);
			}
		});
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmin.setBounds(190, 152, 50, 50);
		frmBasicCalculator.getContentPane().add(btnmin);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum= textField.getText() + btnmul.getText();
				textField.setText(EnterNum);
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBounds(190, 213, 50, 50);
		frmBasicCalculator.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum= textField.getText() + btndiv.getText();
				textField.setText(EnterNum);
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(190, 274, 50, 50);
		frmBasicCalculator.getContentPane().add(btndiv);
	}
}
