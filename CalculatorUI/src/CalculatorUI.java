import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CalculatorUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	CalculatorEngine engine = new CalculatorEngine();

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI frame = new CalculatorUI();
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
	public CalculatorUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.clear();
				display();
				
			}
		});
		btnClear.setBounds(20, 53, 89, 23);
		contentPane.add(btnClear);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('8' - '0');
				display();
			}
		});
		button_2.setBounds(128, 103, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('5' - '0');
				display();
			}
		});
		button_3.setBounds(128, 148, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('2' - '0');
				display();
			}
		});
		button_4.setBounds(128, 194, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('9' - '0');
				display ();
			}
		});
		button_5.setBounds(239, 103, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('6' - '0');
				display();
			}
		});
		button_6.setBounds(239, 148, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('3' - '0');
				display();
			}
		});
		button_7.setBounds(239, 194, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('0' - '0');
				display();
			}
		});
		button_8.setBounds(128, 228, 89, 23);
		contentPane.add(button_8);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('7' - '0');
				display();				
			}
		});
		button.setBounds(20, 103, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('4' - '0');
				display();
			}
		});
		button_1.setBounds(20, 148, 89, 23);
		contentPane.add(button_1);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.digit('1' - '0');
				display();
			}
		});
		button_9.setBounds(20, 194, 89, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.add();
			}
		});
		button_10.setBounds(338, 103, 89, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.subtract();
			}
		});
		button_11.setBounds(338, 148, 89, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.multiply();
			}
		});
		button_12.setBounds(338, 194, 89, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.divide();
			}
		});
		button_13.setBounds(338, 228, 89, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				engine.compute();
				display();
			}
		});
		button_14.setBounds(338, 53, 89, 23);
		contentPane.add(button_14);
		
		textField = new JTextField();
		textField.setBounds(139, 11, 164, 65);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
	public void display(){
		textField.setText("" + engine.display());
		
	}
}
