package com.stephen.java;

import java.awt.*;

import javax.swing.*;

public class Top extends JPanel {

	JLabel you;
	JLabel youScore;
	JLabel hal;
	JLabel halScore;
	
	public Top() {

		setLayout(new GridLayout(1, 4));
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
	}

}
