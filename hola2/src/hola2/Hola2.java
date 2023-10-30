package hola2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Hola2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hola2 window = new Hola2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hola2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
			}
		});
		btn1.setBounds(64, 84, 50, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2");
			}
		});
		btn2.setBounds(120, 84, 50, 48);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("3");
			}
		});
		btn3.setBounds(180, 84, 50, 48);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("4");
			}
		});
		btn4.setBounds(64, 143, 50, 48);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("7");
			}
		});
		btn7.setBounds(64, 202, 50, 48);
		frame.getContentPane().add(btn7);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("5");
			}
		});
		btn5.setBounds(120, 143, 50, 48);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("6");
			}
		});
		btn6.setBounds(180, 143, 50, 48);
		frame.getContentPane().add(btn6);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("8");
			}
		});
		btn8.setBounds(120, 202, 50, 48);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("9");
			}
		});
		btn9.setBounds(180, 202, 50, 48);
		frame.getContentPane().add(btn9);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("x");
			}
		});
		btnX.setBounds(240, 143, 50, 48);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_2_6 = new JButton("0");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0");
			}
		});
		btnNewButton_2_6.setBounds(240, 84, 50, 48);
		frame.getContentPane().add(btnNewButton_2_6);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("/");
			}
		});
		btnDivision.setBounds(240, 202, 50, 48);
		frame.getContentPane().add(btnDivision);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+");
			}
		});
		btnSuma.setBounds(300, 84, 50, 48);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("-");
			}
		});
		btnResta.setBounds(300, 143, 50, 48);
		frame.getContentPane().add(btnResta);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("=");
			}
		});
		btnIgual.setBounds(300, 202, 50, 48);
		frame.getContentPane().add(btnIgual);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(64, 11, 286, 62);
		frame.getContentPane().add(textArea);
	}
}
