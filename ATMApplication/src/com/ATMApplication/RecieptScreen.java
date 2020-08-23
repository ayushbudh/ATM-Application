package com.ATMApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class RecieptScreen extends CheckBalance {

	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecieptScreen window = new RecieptScreen();
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
	public RecieptScreen() {
		initialize(balance);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(double bal) {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 450, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("**********************************************************************");
		lblNewLabel.setBounds(17, 80, 426, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("**********************************************************************");
		lblNewLabel_1.setBounds(16, 131, 426, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Any Bank!");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(115, 91, 217, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel customerNameLabel = new JLabel("Customer Name:");
		customerNameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		customerNameLabel.setBounds(17, 159, 126, 25);
		frame.getContentPane().add(customerNameLabel);
		
		JLabel NameLabel = new JLabel("Anonymous");
		NameLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		NameLabel.setBounds(155, 159, 210, 25);
		frame.getContentPane().add(NameLabel);
		
		JLabel customerIDLabel = new JLabel("Customer ID:");
		customerIDLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		customerIDLabel.setBounds(17, 188, 119, 25);
		frame.getContentPane().add(customerIDLabel);
		
		JLabel lbluhg = new JLabel("00u26373hg4");
		lbluhg.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lbluhg.setBounds(155, 188, 210, 25);
		frame.getContentPane().add(lbluhg);
		
		JLabel AccountNumberLabel = new JLabel("Account Number:");
		AccountNumberLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		AccountNumberLabel.setBounds(17, 225, 142, 25);
		frame.getContentPane().add(AccountNumberLabel);
		
		JLabel AccountNumLabel = new JLabel("98220938278238");
		AccountNumLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		AccountNumLabel.setBounds(155, 225, 243, 25);
		frame.getContentPane().add(AccountNumLabel);
		
		JLabel Labelavhy = new JLabel("Available Balance:");
		Labelavhy.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Labelavhy.setBounds(17, 264, 142, 16);
		frame.getContentPane().add(Labelavhy);
		
		JLabel avBalanceLabel = new JLabel("$ "+bal);
		avBalanceLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		avBalanceLabel.setBounds(155, 262, 243, 25);
		frame.getContentPane().add(avBalanceLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("**********************************************************************");
		lblNewLabel_1_1.setBounds(17, 362, 426, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblThankYouFor = new JLabel("Thank you for banking with us! Have a nice Day.");
		lblThankYouFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYouFor.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblThankYouFor.setBounds(17, 383, 426, 25);
		frame.getContentPane().add(lblThankYouFor);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDate.setBounds(17, 292, 136, 16);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTime.setBounds(17, 320, 136, 16);
		frame.getContentPane().add(lblTime);
		
	
		DateFormat df1 = new SimpleDateFormat("HH:mm:ss ");
	    Date dateobj1 = new Date();
	    
	    DateFormat df = new SimpleDateFormat("MM/dd/yy ");
	    Date dateobj = new Date();		
		
		JLabel DateLabel = new JLabel(df.format(dateobj));
		DateLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		DateLabel.setBounds(155, 292, 243, 16);
		frame.getContentPane().add(DateLabel);
			
		JLabel TimeLabel = new JLabel(df1.format(dateobj1));
		TimeLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		TimeLabel.setBounds(155, 321, 243, 16);
		frame.getContentPane().add(TimeLabel);
		
		JButton ExitButton = new JButton("");
		ExitButton.setIcon(new ImageIcon(getClass().getResource("/resources/close.png")));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				
			}
		});
		ExitButton.setBounds(201, 420, 27, 28);
		frame.getContentPane().add(ExitButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/resources/icons8-bank-building-48.png")));
		lblNewLabel_3.setBounds(188, 6, 55, 62);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
