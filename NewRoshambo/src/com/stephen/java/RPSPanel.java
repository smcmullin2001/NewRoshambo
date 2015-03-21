package com.stephen.java;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RPSPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8719432678376336276L;
	@SuppressWarnings("unused")
	private RockPaperScissors rps;
	LeftPanel lp;
	LeftPanel rp;
	BufferedImage black;
	BufferedImage white;
	
	public RPSPanel(RockPaperScissors rps) {
		try{
		black = ImageIO.read(getClass().getResource("RPSLSBlack.jpg"));
		white = ImageIO.read(getClass().getResource("RPSLSWhite.jpg"));
		}catch(Exception e){
			
		}
		
		
		setOpaque(true);
		this.rps = rps;
		this.setBounds(0,400,100,500);
		setBackground(Color.BLACK);
		this.setLayout(new GridLayout(1,2));
		
		lp = new LeftPanel();
		lp.setHorizontalAlignment(SwingConstants.RIGHT);
		lp.setBounds(0,0,250,400);
//		lp.setText("Are You ");
		lp.setIcon(new ImageIcon(OptionsPanel.resize(white, lp.getWidth(), lp.getHeight())));
		this.add(lp);
		
		rp = new LeftPanel();
		rp.setHorizontalAlignment(SwingConstants.LEFT);
		rp.setBounds(0,250,250,400);
//		rp.setText("Ready?");
		rp.setIcon(new ImageIcon(OptionsPanel.resize(black, rp.getWidth(), rp.getHeight())));
		this.add(rp);
	}
}
