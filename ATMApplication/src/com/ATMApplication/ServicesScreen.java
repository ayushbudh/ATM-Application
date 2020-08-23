package com.ATMApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ServicesScreen {

	private JFrame frame;
	static double balance = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicesScreen window = new ServicesScreen();
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
	public ServicesScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setForeground(Color.YELLOW);
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(0, 0, 800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel customerNameLabel = new JLabel("Customer Name:");
		customerNameLabel.setForeground(new Color(0, 0, 0));
		customerNameLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		customerNameLabel.setBounds(82, 237, 191, 25);
		frame.getContentPane().add(customerNameLabel);
		
		JLabel NameLabel = new JLabel("Anonymous");
		NameLabel.setForeground(new Color(0, 0, 0));
		NameLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		NameLabel.setBounds(285, 237, 327, 25);
		frame.getContentPane().add(NameLabel);
		
		JLabel customerIDLabel = new JLabel("Customer ID:");
		customerIDLabel.setForeground(new Color(0, 0, 0));
		customerIDLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		customerIDLabel.setBounds(82, 288, 191, 25);
		frame.getContentPane().add(customerIDLabel);
		
		JLabel WelcomeMessage = new JLabel("Welcome back to Any Bank !");
		WelcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeMessage.setForeground(new Color(0, 0, 0));
		WelcomeMessage.setBackground(Color.WHITE);
		WelcomeMessage.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		WelcomeMessage.setBounds(63, 45, 664, 40);
		frame.getContentPane().add(WelcomeMessage);
		
		JLabel lbluhg = new JLabel("00u26373hg4");
		lbluhg.setForeground(new Color(0, 0, 0));
		lbluhg.setFont(new Font("Dialog", Font.BOLD, 21));
		lbluhg.setBounds(285, 288, 337, 25);
		frame.getContentPane().add(lbluhg);
		
		JLabel AccountNumberLabel = new JLabel("Account Number:");
		AccountNumberLabel.setForeground(new Color(0, 0, 0));
		AccountNumberLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		AccountNumberLabel.setBounds(84, 334, 189, 25);
		frame.getContentPane().add(AccountNumberLabel);
		
		JLabel AccountNumLabel = new JLabel("98220938278238");
		AccountNumLabel.setForeground(new Color(0, 0, 0));
		AccountNumLabel.setFont(new Font("Dialog", Font.BOLD, 21));
		AccountNumLabel.setBounds(285, 334, 327, 25);
		frame.getContentPane().add(AccountNumLabel);
		
		JLabel CheckBalanceLabel = new JLabel("CheckBalance");
		CheckBalanceLabel.setForeground(new Color(0, 0, 0));
		CheckBalanceLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		CheckBalanceLabel.setBounds(398, 522, 149, 40);
		frame.getContentPane().add(CheckBalanceLabel);
		
		JLabel Withdrawlabel = new JLabel("Withdraw");
		Withdrawlabel.setForeground(new Color(0, 0, 0));
		Withdrawlabel.setFont(new Font("Dialog", Font.PLAIN, 22));
		Withdrawlabel.setBounds(398, 655, 125, 40);
		frame.getContentPane().add(Withdrawlabel);
		
		JLabel DepositLabel = new JLabel("Deposit");
		DepositLabel.setForeground(new Color(0, 0, 0));
		DepositLabel.setFont(new Font("Dialog", Font.PLAIN, 22));
		DepositLabel.setBounds(398, 588, 176, 40);
		frame.getContentPane().add(DepositLabel);
		
		JButton CheckBalanceButton = new JButton(">>");
		CheckBalanceButton.setFont(new Font("Dialog", Font.BOLD, 21));
		CheckBalanceButton.setForeground(new Color(0, 0, 0));
		CheckBalanceButton.setBackground(Color.WHITE);
		CheckBalanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				CheckBalance.main(null);
				CheckBalance.getBalance(balance);
				  

			}
		});
		CheckBalanceButton.setBounds(275, 525, 117, 39);
		frame.getContentPane().add(CheckBalanceButton);
		
		JButton WithdrawButton = new JButton(">>");
		WithdrawButton.setFont(new Font("Dialog", Font.BOLD, 21));
		WithdrawButton.setForeground(new Color(0, 0, 0));
		WithdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				WithDraw.main(null);
			}
		});
		WithdrawButton.setBounds(275, 658, 117, 39);
		frame.getContentPane().add(WithdrawButton);
		
		JButton DepositButton = new JButton(">>");
		DepositButton.setFont(new Font("Dialog", Font.BOLD, 21));
		DepositButton.setForeground(new Color(0, 0, 0));
		DepositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				frame.dispose();
				Deposit.main(null);
				Deposit.getBalance(balance);
			}
		});
		DepositButton.setBounds(275, 589, 117, 39);
		frame.getContentPane().add(DepositButton);
		
		JLabel lblCustomerInformation = new JLabel("        Customer Information ");
		lblCustomerInformation.setForeground(Color.BLACK);
		lblCustomerInformation.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblCustomerInformation.setBackground(Color.WHITE);
		lblCustomerInformation.setBounds(63, 150, 690, 50);
		frame.getContentPane().add(lblCustomerInformation);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/resources/icons8-info-50.png")));
		lblNewLabel.setBounds(63, 150, 50, 50);
		frame.getContentPane().add(lblNewLabel);
		
		String balinacc = String.valueOf(balance);
	}
}
