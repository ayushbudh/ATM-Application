package com.ATMApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CheckBalance extends ServicesScreen {

	

	static double getBalance(double bal)
	{
		balance=bal;
		return bal;
	}
	
	
	
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalance window = new CheckBalance();
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
	
	public CheckBalance() {
		initialize(balance);
	
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(double bal) {
		frame = new JFrame();
		frame.setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Labelavhy = new JLabel("Available Balance:");
		Labelavhy.setForeground(new Color(0, 0, 0));
		Labelavhy.setFont(new Font("Dialog", Font.PLAIN, 21));
		Labelavhy.setBounds(101, 292, 184, 29);
		frame.getContentPane().add(Labelavhy);
		
		JLabel customerNameLabel = new JLabel("Customer Name:");
		customerNameLabel.setForeground(new Color(0, 0, 0));
		customerNameLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		customerNameLabel.setBounds(101, 153, 175, 35);
		frame.getContentPane().add(customerNameLabel);
		
		JLabel customerIDLabel = new JLabel("Customer ID:");
		customerIDLabel.setForeground(new Color(0, 0, 0));
		customerIDLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		customerIDLabel.setBounds(101, 195, 175, 35);
		frame.getContentPane().add(customerIDLabel);
		
		JLabel NameLabel = new JLabel("Anonymous");
		NameLabel.setForeground(new Color(0, 0, 0));
		NameLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		NameLabel.setBounds(300, 158, 210, 25);
		frame.getContentPane().add(NameLabel);
		
		JLabel lbluhg = new JLabel("00u26373hg4");
		lbluhg.setForeground(new Color(0, 0, 0));
		lbluhg.setFont(new Font("Dialog", Font.PLAIN, 21));
		lbluhg.setBounds(300, 200, 210, 25);
		frame.getContentPane().add(lbluhg);
		
		JLabel AccountNumberLabel = new JLabel("Account Number:");
		AccountNumberLabel.setForeground(new Color(0, 0, 0));
		AccountNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		AccountNumberLabel.setBounds(101, 242, 191, 25);
		frame.getContentPane().add(AccountNumberLabel);
		
		JLabel AccountNumLabel = new JLabel("98220938278238");
		AccountNumLabel.setForeground(new Color(0, 0, 0));
		AccountNumLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		AccountNumLabel.setBounds(300, 242, 243, 25);
		frame.getContentPane().add(AccountNumLabel);
		
		String balanceinSTring = String.valueOf(bal);
		JLabel avBalanceLabel = new JLabel("$ "+balanceinSTring);
		avBalanceLabel.setForeground(new Color(0, 0, 0));
		avBalanceLabel.setFont(new Font("Dialog", Font.PLAIN, 21));
		avBalanceLabel.setBounds(300, 294, 243, 25);
		frame.getContentPane().add(avBalanceLabel);
		
		JButton receiptButton = new JButton("Print Reciept");
		receiptButton.setFont(new Font("Dialog", Font.PLAIN, 21));
		receiptButton.setForeground(new Color(0, 0, 0));
		receiptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				RecieptScreen.main(null);
				RecieptScreen.getBalance(bal);
				frame.dispose();
				
			}
		});
		receiptButton.setBounds(232, 467, 156, 35);
		frame.getContentPane().add(receiptButton);
		
		JButton Menubutton = new JButton("BackToMenu");
		Menubutton.setFont(new Font("Dialog", Font.PLAIN, 21));
		Menubutton.setForeground(new Color(0, 0, 0));
		Menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				ServicesScreen.main(null);
			}
		});
		Menubutton.setBounds(400, 467, 147, 35);
		frame.getContentPane().add(Menubutton);
		
		JLabel lblCustomerInformation = new JLabel("      Customer Information");
		lblCustomerInformation.setForeground(Color.BLACK);
		lblCustomerInformation.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblCustomerInformation.setBackground(Color.WHITE);
		lblCustomerInformation.setBounds(59, 71, 664, 50);
		frame.getContentPane().add(lblCustomerInformation);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/resources/icons8-info-50.png")));
		lblNewLabel_2.setBounds(42, 71, 51, 50);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
