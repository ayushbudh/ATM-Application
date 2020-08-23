package com.ATMApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class PasswordScreen {

	private JFrame frame;
	private JPasswordField passwordField;
	private JButton ClearButton;
	private JButton ButtonOne;
	private JButton ButtonTwo;
	private JButton ButtonThree;
	private JButton ButtonFour;
	private JButton ButtonFive;
	private JButton ButtonSix;
	private JButton ButtonSeven;
	private JButton ButtonEight;
	private JButton ButtonNine;
	private JButton ButtonZero;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordScreen window = new PasswordScreen();
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
	public PasswordScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ArrayList <Integer> list = new ArrayList<Integer>();
	
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 141, 80, 26);
		frame.getContentPane().add(passwordField);
		
	
		
		JButton OkButton = new JButton("Ok");
		OkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				char [] correctPassword = {'H','e','r','o'};
				char [] input = passwordField.getPassword();
				
				char b[] = new char[list.size()];
				for(int i=0; i<b.length; i++)
				{
					//b[i]=list.get(i);
				}
				System.out.println(Arrays.equals(b	, correctPassword));
				
				
				
				if(Arrays.equals(input, correctPassword))
				{
					JOptionPane.showMessageDialog(null,"Correct pass","Access Granted!", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Wrong password!" ,"Access Denied!" ,JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
		OkButton.setBounds(236, 179, 58, 29);
		frame.getContentPane().add(OkButton);
		
		ClearButton = new JButton("Clear");
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ClearButton.setBounds(152, 179, 58, 29);
		frame.getContentPane().add(ClearButton);
		
		ButtonOne = new JButton("1");
		ButtonOne.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonOne.setBackground(UIManager.getColor("Button.select"));
		ButtonOne.setBounds(152, 213, 46, 45);
		frame.getContentPane().add(ButtonOne);
		
		ButtonTwo = new JButton("2");
		ButtonTwo.setForeground(Color.BLACK);
		ButtonTwo.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonTwo.setBackground(Color.WHITE);
		ButtonTwo.setBounds(200, 213, 46, 45);
		frame.getContentPane().add(ButtonTwo);
		
		ButtonThree = new JButton("3");
		ButtonThree.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonThree.setBackground(SystemColor.windowBorder);
		ButtonThree.setBounds(247, 213, 46, 45);
		frame.getContentPane().add(ButtonThree);
		
		ButtonFour = new JButton("4");
		ButtonFour.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonFour.setBackground(SystemColor.windowBorder);
		ButtonFour.setBounds(152, 260, 46, 45);
		frame.getContentPane().add(ButtonFour);
		
		ButtonFive = new JButton("5");
		ButtonFive.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonFive.setBackground(SystemColor.windowBorder);
		ButtonFive.setBounds(200, 260, 46, 45);
		frame.getContentPane().add(ButtonFive);
		
		ButtonSix = new JButton("6");
		ButtonSix.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonSix.setBackground(SystemColor.windowBorder);
		ButtonSix.setBounds(247, 260, 46, 45);
		frame.getContentPane().add(ButtonSix);
		
		ButtonSeven = new JButton("7");
		ButtonSeven.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonSeven.setBackground(SystemColor.windowBorder);
		ButtonSeven.setBounds(152, 309, 46, 45);
		frame.getContentPane().add(ButtonSeven);
		
		ButtonEight = new JButton("8");
		ButtonEight.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonEight.setBackground(SystemColor.windowBorder);
		ButtonEight.setBounds(200, 309, 46, 45);
		frame.getContentPane().add(ButtonEight);
		
		ButtonNine = new JButton("9");
		ButtonNine.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonNine.setBackground(SystemColor.windowBorder);
		ButtonNine.setBounds(247, 309, 46, 45);
		frame.getContentPane().add(ButtonNine);
		
		ButtonZero = new JButton("0");
		ButtonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String previous = passwordField.getText();
				if(list.size()>=1)
				{
					list.add(0);
					passwordField.setText(list.toString());
				}
				
				else
				{
					passwordField.setText("0");
				}
			}
		});
		ButtonZero.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		ButtonZero.setBackground(SystemColor.windowBorder);
		ButtonZero.setBounds(200, 357, 46, 45);
		frame.getContentPane().add(ButtonZero);
	}
}
