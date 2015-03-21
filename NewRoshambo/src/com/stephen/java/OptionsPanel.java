//TODO: Set Win/Lose/Draw commentaries
//		New method to set bestOf values to false
//		Create method to do random image selection

package com.stephen.java;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class OptionsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private RockPaperScissors rps;
	JButton rock;
	JButton paper;
	JButton scissors;
	JButton spock;
	JButton lizard;
	JButton bestOfThree;
	JButton bestOfFive;
	JButton bestOfSeven;
	JButton infinity;
	JButton reset;
	boolean best3 = true;
	boolean best5;
	boolean best7;
	boolean bestOfInfinity;
	RPSPanel rPanel;
	Random random;
	int index;
	BufferedImage[] imagesLeft = new BufferedImage[5];
	BufferedImage[] imagesRight = new BufferedImage[5];
	int you;
	int hal;
	

	public OptionsPanel(final RockPaperScissors rps, final RPSPanel rPanel){
		
		this.rps = rps; 
		this.rPanel = rPanel;
		try {
			imagesLeft[0] = ImageIO.read(getClass().getResource("RockLeft.jpg"));
			imagesLeft[1] = ImageIO.read(getClass().getResource("PaperLeft.jpg"));
			imagesLeft[2] = ImageIO.read(getClass().getResource("ScissorsLeft.jpg"));
			imagesLeft[3] = ImageIO.read(getClass().getResource("SpockLeft.jpg"));
			imagesLeft[4] = ImageIO.read(getClass().getResource("LizardLeft.jpg"));
			
			imagesRight[0] = ImageIO.read(getClass().getResource("RockRight.jpg"));
			imagesRight[1] = ImageIO.read(getClass().getResource("PaperRight.jpg"));
			imagesRight[2] = ImageIO.read(getClass().getResource("ScissorsRight.jpg"));
			imagesRight[3] = ImageIO.read(getClass().getResource("SpockRight.jpg"));
			imagesRight[4] = ImageIO.read(getClass().getResource("LizardRight.jpg"));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		setBounds(new Rectangle(0, 0, 500, 100));
		setOpaque(true);
		setBackground(UIManager.getColor("Button.shadow"));
		setLayout(new GridLayout(2,3));
		
		rock = new JButton("ROCK");
		rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('r');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					BufferedImage img = resize(imagesLeft[0], rPanel.lp.getWidth(), rPanel.lp.getHeight());
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(imagesRight.length);
					calculateScore(0, index);
//					you = Integer.parseInt(RPSFrame.top.youScore.getText());
//					hal = Integer.parseInt(RPSFrame.top.halScore.getText());
//					rPanel.rp.setIcon(new ImageIcon(images[index]));
					rPanel.rp.setIcon(new ImageIcon(resize(imagesRight[index], rPanel.rp.getWidth(), rPanel.rp.getHeight())));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(rock);
		
		paper = new JButton("PAPER");
		paper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('p');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					BufferedImage img = resize(imagesLeft[1], rPanel.lp.getWidth(), rPanel.lp.getHeight());
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(imagesRight.length);
					calculateScore(1, index);

					rPanel.rp.setIcon(new ImageIcon(resize(imagesRight[index], rPanel.rp.getWidth(), rPanel.rp.getHeight())));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(paper);
		
		scissors = new JButton("SCISSORS");
		scissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('s');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					BufferedImage img = resize(imagesLeft[2], rPanel.lp.getWidth(), rPanel.lp.getHeight());
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(imagesRight.length);
					calculateScore(2, index);

					rPanel.rp.setIcon(new ImageIcon(resize(imagesRight[index], rPanel.rp.getWidth(), rPanel.rp.getHeight())));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(scissors);
		
		spock = new JButton("SPOCK");
		spock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('v');//for Vulcan
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					BufferedImage img = resize(imagesLeft[3], rPanel.lp.getWidth(), rPanel.lp.getHeight());
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(imagesRight.length);
					calculateScore(3, index);

					rPanel.rp.setIcon(new ImageIcon(resize(imagesRight[index], rPanel.rp.getWidth(), rPanel.rp.getHeight())));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(spock);
		
		lizard = new JButton("LIZARD");
		lizard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('l');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					BufferedImage img = resize(imagesLeft[4], rPanel.lp.getWidth(), rPanel.lp.getHeight());
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(imagesRight.length);
					calculateScore(4, index);

					rPanel.rp.setIcon(new ImageIcon(resize(imagesRight[index], rPanel.rp.getWidth(), rPanel.rp.getHeight())));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(lizard);
		
		bestOfThree = new JButton("Best of 3");
		bestOfThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = true;
				best5 = false;
				best7 = false;
				bestOfInfinity = false;
				buttonColors(3);
				RockPaperScissors.maxBestOf = 3;
			}
		});
		this.add(bestOfThree);
		
		bestOfFive = new JButton("Best of 5");
		bestOfFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = false;
				best5 = true;
				best7 = false;
				bestOfInfinity = false;
				buttonColors(5);
				RockPaperScissors.maxBestOf = 5;
			}
		});
		this.add(bestOfFive);
		
		bestOfSeven = new JButton("Best of 7");
		bestOfSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = false;
				best5 = false;
				best7 = true;
				bestOfInfinity = false;
				buttonColors(7);
				RockPaperScissors.maxBestOf = 7;
			}
		});
		this.add(bestOfSeven);
		
		infinity = new JButton("Best of Infinity");
		infinity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = false;
				best5 = false;
				best7 = false;
				bestOfInfinity = true;
				buttonColors('i');
				RockPaperScissors.maxBestOf = Integer.MAX_VALUE;
			}
		});
		this.add(infinity);
		
		reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rps.reset();
			}
		});
		this.add(reset);
		
		
	}

	public void buttonColors(int i){
		switch(i){
		case 'r':{
			setNullBackground(1);
			rock.setBackground(new Color(176,196,222, 240));
			break;
		}
		case 'p':{
			setNullBackground(1);
			paper.setBackground(new Color(176,196,222, 240));
			break;
		}
		case 's':{
			setNullBackground(1);
			scissors.setBackground(new Color(176,196,222, 240));
			break;
		}case 'l':{
			setNullBackground(1);
			lizard.setBackground(new Color(176,196,222, 240));
			break;
		}
		case 'v':{
			setNullBackground(1);
			spock.setBackground(new Color(176,196,222, 240));
			break;
		}
		case 3: {
			setNullBackground(2);
			bestOfThree.setBackground(new Color(135,206,235, 240));
			break;
		}
		case 5:{
			setNullBackground(2);
			bestOfFive.setBackground(new Color(135,206,235, 240));
			break;
		}
		case 7:{
			setNullBackground(2);
			bestOfSeven.setBackground(new Color(135,206,235, 240));
			break;
		}
		case 'i':{
			setNullBackground(2);
			infinity.setBackground(new Color(135,206,235, 240));
			break;
		}
		default:{
			setNullBackground(1);
			setNullBackground(2);
			break;
		}
		}
	}
	
public void calculateScore(int youScore, int index){
		
		switch(youScore){
		case 0:{//rock
			if(index == 0){
				setDraw(0);
			}
			if(index == 1 || index == 3){
				setHalScore(0);

			}
			if(index == 2 || index == 4){
				setYouScore(0);
			}
			break;
		}
		case 1:{//paper
			if(index == 0 || index == 3){
				setYouScore(1);
			}
			if(index == 1){
				setDraw(1);
			}
			if(index == 2 || index == 4){
				setHalScore(1);

			}
			
			break;
		}
		case 2:{//scissors
			if(index == 0 || index == 3){
				setHalScore(2);
			}
			if(index == 1 || index == 4){
				setYouScore(2);
			}
			if(index == 2){
				setDraw(2);
			}
			
			break;
		}
		case 3:{//spock
			if(index == 0 || index == 2){
				setYouScore(3);
			}
			if(index == 1 || index == 4){
				setHalScore(3);

			}
			
			if(index == 3){
				setDraw(3);
			}
			
			break;
		}
		case 4:{//lizard
			if(index == 0 || index == 2){
				setHalScore(4);
			}
			if(index == 1 || index == 3){
				setYouScore(4);
			}
			
			if(index == 4){
				setDraw(4);
			}
			break;
		}
		}
	}
public void setYouScore(int move){
	RPSFrame.top.youScore.setText("" + (Integer.parseInt(RPSFrame.top.youScore.getText()) + 1));

}
public void setHalScore(int move){
	RPSFrame.top.halScore.setText("" + (Integer.parseInt(RPSFrame.top.halScore.getText()) + 1));
	
}
public void setDraw(int move){
	RPSFrame.top.commentary1.setText("************");
	RPSFrame.top.commentary2.setText("It's a draw,");
	RPSFrame.top.commentary3.setText("  go again!");
	RPSFrame.top.commentary4.setText("************");

}
public void setNullBackground(int type){
	//type == 1 for top layer buttons
	//type == 2 for bottom layer buttons
	if(type == 1){
		rock.setBackground(null);
		paper.setBackground(null);
		scissors.setBackground(null);
		lizard.setBackground(null);
		spock.setBackground(null);
	}
	if(type == 2){
		bestOfThree.setBackground(null);
		bestOfFive.setBackground(null);
		bestOfSeven.setBackground(null);
		infinity.setBackground(null);
		reset.setBackground(null);
	}
}

public static BufferedImage resize(BufferedImage image, int width, int height) {
    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
    Graphics2D g2d = (Graphics2D) bi.createGraphics();
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(image, 0, 0, width, height, null);
    g2d.dispose();
    return bi;
}//http://stackoverflow.com/a/14550112 - Thanks to David Kroukamp for this custom method

}
