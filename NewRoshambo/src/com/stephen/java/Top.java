package com.stephen.java;

import java.awt.*;

import javax.swing.*;

public class Top extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7409649254708925958L;
	JLabel you;
	JLabel youScore;
	JLabel hal;
	JLabel halScore;
	JLabel commentary1;
	JLabel commentary2;
	JLabel commentary3;
	JLabel commentary4;
	
	public Top() {

		setLayout(new GridLayout(2, 4));
		setVisible(true);
		
		you = new JLabel("You: ");
		you.setHorizontalAlignment(SwingConstants.CENTER);
		add(you);
		
		youScore = new JLabel("0");
		youScore.setHorizontalAlignment(SwingConstants.CENTER);
		add(youScore);
		
		hal = new JLabel("Hal: ");
		hal.setHorizontalAlignment(SwingConstants.CENTER);
		add(hal);
		
		halScore = new JLabel("0");
		halScore.setHorizontalAlignment(SwingConstants.CENTER);
		add(halScore);
		
		commentary1 = new JLabel("");
		commentary1.setHorizontalAlignment(SwingConstants.CENTER);
		add(commentary1);
		
		commentary2 = new JLabel("");
		commentary2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(commentary2);
		
		commentary3 = new JLabel("");
		commentary3.setHorizontalAlignment(SwingConstants.LEFT);
		add(commentary3);
		
		commentary4 = new JLabel("");
		commentary4.setHorizontalAlignment(SwingConstants.CENTER);
		add(commentary4);
	}

}
