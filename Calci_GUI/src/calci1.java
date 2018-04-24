import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calci1 {

	private JFrame frame;
	private JTextField TextBox1;
	private String s1="",s2="",event="";
	private String s3="",s4="";
	private int l;
	Double num1,num2,num3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci1 window = new calci1();
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
	public calci1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextBox1 = new JTextField();
		TextBox1.setHorizontalAlignment(SwingConstants.RIGHT);
		TextBox1.setBounds(34, 22, 352, 45);
		frame.getContentPane().add(TextBox1);
		TextBox1.setColumns(10);
		
		JButton Button7 = new JButton("7");
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("7");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("7");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button7.setBounds(24, 90, 89, 23);
		frame.getContentPane().add(Button7);
		
		JButton Button4 = new JButton("4");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("4");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("4");
				
				TextBox1.setText(s2);
								}
			}
			
		});
		Button4.setBounds(24, 131, 89, 23);
		frame.getContentPane().add(Button4);
		
		
		
		JButton Button8 = new JButton("8");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("8");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("8");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button8.setBounds(123, 90, 89, 23);
		frame.getContentPane().add(Button8);
		
		JButton Button5 = new JButton("5");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("5");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("5");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button5.setBounds(123, 131, 89, 23);
		frame.getContentPane().add(Button5);
		
		JButton Button2 = new JButton("2");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("2");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("2");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button2.setBounds(123, 173, 89, 23);
		frame.getContentPane().add(Button2);
		
		JButton Button9 = new JButton("9");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("9");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("9");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button9.setBounds(222, 90, 89, 23);
		frame.getContentPane().add(Button9);
		
		JButton Button6 = new JButton("6");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("6");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("6");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button6.setBounds(222, 131, 89, 23);
		frame.getContentPane().add(Button6);
		
		JButton Button3 = new JButton("3");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("3");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("3");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button3.setBounds(222, 173, 89, 23);
		frame.getContentPane().add(Button3);
		
		JButton ButtonDot = new JButton(".");
		ButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{s1="0";
					s4=s1.concat(".");
				TextBox1.setText(s4);
				
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat(".");
				
				TextBox1.setText(s2);
								}
			}
		});
		ButtonDot.setBounds(24, 207, 89, 23);
		frame.getContentPane().add(ButtonDot);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("0");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("0");
				
				TextBox1.setText(s2);
								}
			}
		});
		button0.setBounds(123, 207, 89, 23);
		frame.getContentPane().add(button0);
		
		JButton ButtonDel = new JButton("Del");
		ButtonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s3="";
				s4=TextBox1.getText();
				l=s4.length();
				for(int i=0;i<=l-2;i++)
				{
					s3=s3+s4.charAt(i);
				}
				TextBox1.setText(s3);
				
				
			}
			
			
		});
		ButtonDel.setBounds(222, 207, 89, 23);
		frame.getContentPane().add(ButtonDel);
		
		JButton ButtonPlus = new JButton("+");
		ButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			event="+";
			s1=TextBox1.getText();
			TextBox1.setText("");
				
			}
		});
		ButtonPlus.setBounds(321, 90, 89, 23);
		frame.getContentPane().add(ButtonPlus);
		
		JButton ButtonMinus = new JButton("-");
		ButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				event="-";
				s1=TextBox1.getText();
				TextBox1.setText("");
			}
		});
		ButtonMinus.setBounds(321, 131, 89, 23);
		frame.getContentPane().add(ButtonMinus);
		
		JButton ButtonMultiply = new JButton("X");
		ButtonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				event="X";
				s1=TextBox1.getText();
				TextBox1.setText("");
			}
		});
		ButtonMultiply.setBounds(321, 173, 89, 23);
		frame.getContentPane().add(ButtonMultiply);
		
		JButton ButtonDivide = new JButton("/");
		ButtonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				event="/";
				s1=TextBox1.getText();
				TextBox1.setText("");
			}
		});
		ButtonDivide.setBounds(321, 207, 89, 23);
		frame.getContentPane().add(ButtonDivide);
		
		JButton Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TextBox1.getText().equals(""))
				{
					TextBox1.setText("1");
				}
				else
				{
				s1=TextBox1.getText();
				s2=s1.concat("1");
				
				TextBox1.setText(s2);
								}
			}
		});
		Button1.setBounds(24, 173, 89, 23);
		frame.getContentPane().add(Button1);
		
		JButton ButtonEqualTo = new JButton("=");
		ButtonEqualTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s2=TextBox1.getText();
				num1=Double.parseDouble(s1);
				num2=Double.parseDouble(s2);
				if(event.equals("+"))
				{
					num3=num1+num2;
					s3=num3.toString();
					TextBox1.setText(s3);
					
				}
				if(event.equals("-"))
				{
					num3=num1-num2;
					s3=num3.toString();
					TextBox1.setText(s3);
					
				}
				if(event.equals("X"))
				{
					num3=num1*num2;
					s3=num3.toString();
					TextBox1.setText(s3);
					
				}
				if(event.equals("/"))
				{
					if(num2==0)
					{
					JOptionPane.showMessageDialog(null,"Incorrect Input  bro");
					}
					else
					{
					num3=num1/num2;
				s3=num3.toString();	
					TextBox1.setText(s3);
					}
				}
			}
		});
		ButtonEqualTo.setBounds(321, 248, 89, 23);
		frame.getContentPane().add(ButtonEqualTo);
	}
}
