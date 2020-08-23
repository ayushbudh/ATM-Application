package com.ATMApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PinScreen {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PinScreen window = new PinScreen();
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
	public PinScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 800, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(375, 296, 46, 35);
		frame.getContentPane().add(passwordField);
		
		
		JButton ButtonOne = new JButton("1");
		ButtonOne.setBackground(UIManager.getColor("Button.select"));
		ButtonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"1");
				}
				
				else
				{
					passwordField.setText("1");
				}
			}
		});
		ButtonOne.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonOne.setBounds(327, 508, 46, 45);
		frame.getContentPane().add(ButtonOne);
		
		JButton ButtonTwo = new JButton("2");
		ButtonTwo.setForeground(Color.BLACK);
		ButtonTwo.setBackground(SystemColor.menu);
		ButtonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"2");
				}
				
				else
				{
					passwordField.setText("2");
				}
			}
		});
		ButtonTwo.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonTwo.setBounds(375, 508, 46, 45);
		frame.getContentPane().add(ButtonTwo);
		
		JButton ButtonThree = new JButton("3");
		ButtonThree.setBackground(SystemColor.windowBorder);
		ButtonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"3");
				}
				
				else
				{
					passwordField.setText("3");
				}
			}
		});
		ButtonThree.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonThree.setBounds(422, 508, 46, 45);
		frame.getContentPane().add(ButtonThree);
		
		JButton ButtonFour = new JButton("4");
		ButtonFour.setBackground(SystemColor.windowBorder);
		ButtonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"4");
				}
				
				else
				{
					passwordField.setText("4");
				}
			}
		});
		ButtonFour.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonFour.setBounds(327, 555, 46, 45);
		frame.getContentPane().add(ButtonFour);
		
		JButton ButtonFive = new JButton("5");
		ButtonFive.setBackground(SystemColor.windowBorder);
		ButtonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"5");
				}
				
				else
				{
					passwordField.setText("5");
				}
			}
		});
		ButtonFive.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonFive.setBounds(375, 555, 46, 45);
		frame.getContentPane().add(ButtonFive);
		
		JButton ButtonSix = new JButton("6");
		ButtonSix.setBackground(SystemColor.windowBorder);
		ButtonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"6");
				}
				
				else
				{
					passwordField.setText("6");
				}
			}
		});
		ButtonSix.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonSix.setBounds(422, 555, 46, 45);
		frame.getContentPane().add(ButtonSix);
		
		JButton ButtonSeven = new JButton("7");
		ButtonSeven.setBackground(SystemColor.windowBorder);
		ButtonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"7");
				}
				
				else
				{
					passwordField.setText("7");
				}
			}
		});
		ButtonSeven.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonSeven.setBounds(327, 604, 46, 45);
		frame.getContentPane().add(ButtonSeven);
		
		JButton ButtonEight = new JButton("8");
		ButtonEight.setBackground(SystemColor.windowBorder);
		ButtonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"8");
				}
				
				else
				{
					passwordField.setText("8");
				}
			}
		});
		ButtonEight.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonEight.setBounds(375, 604, 46, 45);
		frame.getContentPane().add(ButtonEight);
		
		JButton ButtonNine = new JButton("9");
		ButtonNine.setBackground(SystemColor.windowBorder);
		ButtonNine.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"9");
				}
				
				else
				{
					passwordField.setText("9");
				}
			}
		});
		ButtonNine.setBounds(422, 604, 46, 45);
		frame.getContentPane().add(ButtonNine);
		
		
		
		JLabel PinLabel = new JLabel("ENTER PIN");
		PinLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		PinLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		PinLabel.setBounds(335, 343, 116, 26);
		frame.getContentPane().add(PinLabel);
		
		JLabel lblNewLabel = new JLabel("Welcome to Dash ATM");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 31));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 55, 721, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JButton RedButton = new JButton("");
		RedButton.setBackground(Color.RED);
		RedButton.setIcon(new ImageIcon(getClass().getResource("/resources/iconfinder_delete_227590.png")));
		RedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(passwordField.getText().length()<=0)
				{
					// Do nothing
				}
				else
				{
					String newText = passwordField.getText();
					passwordField.setText(newText.substring(0, passwordField.getText().length()-1));
				}
			}
		});
		RedButton.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		RedButton.setForeground(Color.RED);
		RedButton.setBounds(327, 652, 46, 45);
		frame.getContentPane().add(RedButton);
		
		JButton ButtonZero = new JButton("0");
		ButtonZero.setBackground(SystemColor.windowBorder);
		ButtonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String previous = passwordField.getText();
				if(previous.length()>=1)
				{
					passwordField.setText(previous+"0");
				}
				
				else
				{
					passwordField.setText("0");
				}
			}
		});
		ButtonZero.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonZero.setBounds(375, 652, 46, 45);
		frame.getContentPane().add(ButtonZero);
		
		JButton GreenButton = new JButton("");
		GreenButton.setSelectedIcon(new ImageIcon(getClass().getResource("/resources/iconfinder_button-check_green_68872.png")));
		GreenButton.setIcon(new ImageIcon(getClass().getResource("/resources/iconfinder_reply_2676939.png")));
		GreenButton.setBackground(SystemColor.windowBorder);
		GreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(passwordField.getText().equals("1234"))
				{
					
					
					 frame.dispose();
					 ServicesScreen.main(null);
				}
				else
				{
		
					JOptionPane.showMessageDialog(null, "Incorrect Pin. Please re-enter pin. "," Access Denied!",JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					
				}
			}
		});
		GreenButton.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		GreenButton.setForeground(Color.GREEN);
		GreenButton.setBounds(422, 651, 46, 45);
		frame.getContentPane().add(GreenButton);
		
		JLabel ImageLabel = new JLabel("");
		ImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageLabel.setIcon(new ImageIcon(getClass().getResource("/resources/icons8-atm-40.png")));
		ImageLabel.setBounds(351, 118, 85, 71);
		frame.getContentPane().add(ImageLabel);
		
		
	}
}
