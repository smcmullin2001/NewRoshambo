package com.stephen.java;

import java.awt.*;

import javax.swing.*;

public class RPSFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel container;
	JPanel buttonPanel;
	JPanel picPanel;
	JPanel leftPanel;
	JPanel rightPanel;
	RPSPanel rPanel;
	OptionsPanel op;
	
	static Top top;
	
	public RPSFrame(RPSPanel rPanel, OptionsPanel op) {
		this.op = op;
		container = new JLabel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		setContentPane(container);
		setTitle("ROSHAMBO");
		
		container.setBackground(Color.BLACK);
		container.setLayout(new BorderLayout());
		container.setVisible(true);
		setVisible(true);
		
//		buttonPanel = new JPanel();
//		buttonPanel.setLayout(new GridLayout(1,3));
		
		container.add(op, BorderLayout.SOUTH);
		container.add(rPanel);
		
		top = new Top();
		

		container.add(top, BorderLayout.NORTH);
		
//		JButton button = new JButton("ROCK");
////		button.setBounds(0, 0, 200, 150);
//		buttonPanel.add(button);
//		
//		JButton button2 = new JButton("PAPER");
////		button.setBounds(0, 200, 200, 150);
//		buttonPanel.add(button2);
//		
//		JButton button3 = new JButton("SCISSORS");
////		button.setBounds(0, 400, 200, 150);
//		buttonPanel.add(button3);
//		
//		picPanel = new JPanel();
//		picPanel.setLayout(new GridLayout(1,2));
//		container.add(picPanel, BorderLayout.NORTH);
//		
//		leftPanel = new JPanel();
//		leftPanel.setBackground(Color.BLACK);
//		leftPanel.setOpaque(true);
//		picPanel.add(leftPanel);
//		
//		rightPanel = new JPanel();
//		rightPanel.setBackground(Color.WHITE);
//		rightPanel.setOpaque(true);
//		picPanel.add(rightPanel);
		
	}

}
