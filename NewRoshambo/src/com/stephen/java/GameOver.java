package com.stephen.java;

import java.awt.Color;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.Font;

public class GameOver extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7313314449299530543L;
	JLabel gameOverLabel;
	JLabel winLose;
	JButton playAgain;
	RockPaperScissors rps;
	BufferedImage img;

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
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
//		try{
//		img = ImageIO.read(getClass().getResource("TestBlob.jpg"));
//		}catch(Exception e){
//			
//		}
//		this.setIcon(new ImageIcon(OptionsPanel.resize(img, 100, 100)));
	}

}
