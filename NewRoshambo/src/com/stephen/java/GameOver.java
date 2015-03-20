package com.stephen.java;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GameOver extends JPanel {

	JLabel gameOverLabel;
	JLabel winLose;
	JButton playAgain;
	RockPaperScissors rps;

	public GameOver(final RockPaperScissors rps) {
		this.rps = rps;
		setLayout(new GridLayout(3,1));
		
		gameOverLabel = new JLabel("Game Over!");
		gameOverLabel.setFont(new Font("Verdana", Font.BOLD, 24));
		gameOverLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(gameOverLabel);
		
		winLose = new JLabel("");
		winLose.setFont(new Font("Verdana", Font.BOLD, 24));
		winLose.setHorizontalAlignment(SwingConstants.CENTER);
		add(winLose);
		
		playAgain = new JButton("Play Again?");
		playAgain.setFont(new Font("Verdana", Font.BOLD, 24));
		playAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rps.reset();
			}
		});
		add(playAgain);
		
	}

}
