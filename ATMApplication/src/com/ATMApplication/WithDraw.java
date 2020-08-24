package com.ATMApplication;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class WithDraw extends CheckBalance{

	private JFrame frame;
	private JTextField amountobeWithdrawn;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithDraw window = new WithDraw();
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
	public WithDraw() {
		initialize(balance);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(double bal) {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 21));
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		amountobeWithdrawn = new JTextField();
		amountobeWithdrawn.setColumns(10);
		amountobeWithdrawn.setBounds(413, 357, 72, 33);
		frame.getContentPane().add(amountobeWithdrawn);
		
		JButton button7 = new JButton("7");
		button7.setFont(new Font("Dialog", Font.BOLD, 22));
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"7");
				}
				
				else
				{
					amountobeWithdrawn.setText("7");
				}
			}
		});
		button7.setBounds(303, 561, 46, 45);
		frame.getContentPane().add(button7);
		
		JButton button1 = new JButton("1");
		button1.setFont(new Font("Dialog", Font.BOLD, 22));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"1");
				}
				
				else
				{
					amountobeWithdrawn.setText("1");
				}
			}
		});
		
				JButton button4 = new JButton("4");
				button4.setFont(new Font("Dialog", Font.BOLD, 22));
				button4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						String previous = amountobeWithdrawn.getText();
						if(previous.length()>=1)
						{
							amountobeWithdrawn.setText(previous+"4");
						}
						
						else
						{
							amountobeWithdrawn.setText("4");
						}
					}
				});
				button4.setBounds(303, 519, 46, 45);
				frame.getContentPane().add(button4);
		button1.setBounds(303, 475, 46, 45);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setFont(new Font("Dialog", Font.BOLD, 22));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String previous = amountobeWithdrawn.getText();
				
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"2");
				}
				
				else
				{
					amountobeWithdrawn.setText("2");
				}
				
				
			}
		});
		button2.setBounds(348, 475, 46, 45);
		frame.getContentPane().add(button2);
		
		JButton button5 = new JButton("5");
		button5.setFont(new Font("Dialog", Font.BOLD, 22));
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"5");
				}
				
				else
				{
					amountobeWithdrawn.setText("5");
				}
			}
		});
		button5.setBounds(348, 519, 46, 45);
		frame.getContentPane().add(button5);
		
		JButton button8 = new JButton("8");
		button8.setFont(new Font("Dialog", Font.BOLD, 22));
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"8");
				}
				
				else
				{
					amountobeWithdrawn.setText("8");
				}
			}
		});
		button8.setBounds(348, 561, 46, 45);
		frame.getContentPane().add(button8);
		
		JButton button3 = new JButton("3");
		button3.setFont(new Font("Dialog", Font.BOLD, 22));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"3");
				}
				
				else
				{
					amountobeWithdrawn.setText("3");
				}
			}
		});
		button3.setBounds(393, 475, 46, 45);
		frame.getContentPane().add(button3);
		
		JButton button6 = new JButton("6");
		button6.setFont(new Font("Dialog", Font.BOLD, 22));
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"6");
				}
				
				else
				{
					amountobeWithdrawn.setText("6");
				}
			}
		});
		button6.setBounds(393, 519, 46, 45);
		frame.getContentPane().add(button6);
		
		JButton button9 = new JButton("9");
		button9.setFont(new Font("Dialog", Font.BOLD, 22));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"9");
				}
				
				else
				{
					amountobeWithdrawn.setText("9");
				}
			}
		});
		button9.setBounds(393, 561, 46, 45);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.setFont(new Font("Dialog", Font.BOLD, 22));
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = amountobeWithdrawn.getText();
				if(previous.length()>=1)
				{
					amountobeWithdrawn.setText(previous+"0");
				}
				
				else
				{
					amountobeWithdrawn.setText("0");
				}
			}
		});
		button0.setBounds(348, 604, 46, 45);
		frame.getContentPane().add(button0);
		
		JLabel lblNewLabel = new JLabel("Available balance: $");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(153, 308, 249, 33);
		frame.getContentPane().add(lblNewLabel);
		
		String bal1 = String.valueOf(balance);
		JLabel avBalanceLabel2 = new JLabel(bal1);
		avBalanceLabel2.setForeground(new Color(0, 0, 0));
		avBalanceLabel2.setFont(new Font("Dialog", Font.PLAIN, 21));
		avBalanceLabel2.setBounds(413, 311, 90, 26);
		frame.getContentPane().add(avBalanceLabel2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter amount to be withdrawn: $");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(62, 353, 349, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JButton enterButton = new JButton("");
		enterButton.setIcon(new ImageIcon("/Users/ayushbudhwani/Desktop/Python Programs/iconfinder_reply_2676939.png"));
		enterButton.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		enterButton.setForeground(new Color(0, 255, 0));
		enterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				boolean result =true;		
				String amount = amountobeWithdrawn.getText();
				
				char [] amountinCharArray = amount.toCharArray();
				
				for(char c:amountinCharArray )
				{
					if(Character.isDigit(c)==false)
					{
						result=false;
						break;
					}
				}
				if(result ==true)
				{
				double amo = Double.valueOf(amount);
				if(amo>balance)
				{
					JOptionPane.showMessageDialog(null, "Amount entered is greater then available balance" ,"Withdrawal Unsuccessful!" , JOptionPane.ERROR_MESSAGE);
					amountobeWithdrawn.setText(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "$ "+amountobeWithdrawn.getText()+" WithDrawn" ,"Withdrawal Successful!" , JOptionPane.INFORMATION_MESSAGE);
					balance = balance - amo;
					frame.getContentPane().remove(avBalanceLabel2);
					String avBal = String.valueOf(balance);
					avBalanceLabel2.setText(avBal);
					frame.getContentPane().add(avBalanceLabel2);
					frame.revalidate();								
					frame.repaint();
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please enter numbers from given keypad or computer keyboard", "Invalid Input!", JOptionPane.ERROR_MESSAGE);
					amountobeWithdrawn.setText(null);
				}
								
			}
		});
		enterButton.setBounds(393, 604, 46, 45);
		frame.getContentPane().add(enterButton);
		
		JButton backSpace = new JButton("");
		backSpace.setIcon(new ImageIcon("/Users/ayushbudhwani/Desktop/Python Programs/iconfinder_delete_227590.png"));
		backSpace.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		backSpace.setForeground(new Color(255, 0, 0));
		backSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String afterOp =amountobeWithdrawn.getText();
				int oneStepback= amountobeWithdrawn.getText().length();
				
				if(oneStepback<=0)
				{
					// Do nothing
				}
				else
				{
					amountobeWithdrawn.setText(	afterOp.substring(0, oneStepback-1));
				}
				
				
			}
		});
		backSpace.setBounds(303, 604, 46, 45);
		frame.getContentPane().add(backSpace);
		JButton receiptButton = new JButton("Print Reciept");
		receiptButton.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		receiptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				RecieptScreen.main(null);
				RecieptScreen.getBalance(balance);
				
			}
		});
		receiptButton.setBounds(392, 703, 156, 35);
		frame.getContentPane().add(receiptButton);
		
		JButton Menubutton = new JButton("BackToMenu");
		Menubutton.setFont(new Font("Dialog", Font.PLAIN, 21));
		Menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				ServicesScreen.main(null);
			}
		});
		Menubutton.setBounds(213, 703, 156, 35);
		frame.getContentPane().add(Menubutton);
		
		JLabel lblCustomerInformation = new JLabel("     Customer Information ");
		lblCustomerInformation.setForeground(Color.BLACK);
		lblCustomerInformation.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblCustomerInformation.setBackground(Color.WHITE);
		lblCustomerInformation.setBounds(71, 36, 655, 45);
		frame.getContentPane().add(lblCustomerInformation);
		
		JLabel AccountNumberLabel = new JLabel("Account Number:");
		AccountNumberLabel.setForeground(Color.BLACK);
		AccountNumberLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		AccountNumberLabel.setBounds(62, 222, 198, 25);
		frame.getContentPane().add(AccountNumberLabel);
		
		JLabel customerIDLabel = new JLabel("Customer ID:");
		customerIDLabel.setForeground(Color.BLACK);
		customerIDLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		customerIDLabel.setBounds(62, 173, 200, 25);
		frame.getContentPane().add(customerIDLabel);
		
		JLabel customerNameLabel = new JLabel("Customer Name:");
		customerNameLabel.setForeground(Color.BLACK);
		customerNameLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		customerNameLabel.setBounds(62, 125, 200, 25);
		frame.getContentPane().add(customerNameLabel);
		
		JLabel NameLabel = new JLabel("Anonymous");
		NameLabel.setForeground(Color.BLACK);
		NameLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		NameLabel.setBounds(274, 125, 327, 25);
		frame.getContentPane().add(NameLabel);
		
		JLabel lbluhg = new JLabel("00u26373hg4");
		lbluhg.setForeground(Color.BLACK);
		lbluhg.setFont(new Font("Dialog", Font.BOLD, 21));
		lbluhg.setBounds(272, 173, 337, 25);
		frame.getContentPane().add(lbluhg);
		
		JLabel AccountNumLabel = new JLabel("98220938278238");
		AccountNumLabel.setForeground(Color.BLACK);
		AccountNumLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		AccountNumLabel.setBounds(272, 222, 327, 25);
		frame.getContentPane().add(AccountNumLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/resources/icons8-info-50.png")));
		lblNewLabel_2.setBounds(45, 31, 51, 50);
		frame.getContentPane().add(lblNewLabel_2);
		// Hello there
}
}
