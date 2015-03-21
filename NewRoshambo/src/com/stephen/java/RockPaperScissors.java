package com.stephen.java;

import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class RockPaperScissors {

	static RPSFrame rFrame;
	static RPSPanel rPanel;
	static OptionsPanel op;
	@SuppressWarnings("unused")
	private RockPaperScissors rps;
	Image[] images = new Image[3];
	static Top top;
	static int bestOf;
	static int maxBestOf = 3;
	static GameOver gameOver;

	public static void main(String[] args){
		RockPaperScissors rps = new RockPaperScissors();
		top = new Top();
		rPanel = new RPSPanel(rps);
		op = new OptionsPanel(rps, rPanel);
		rFrame = new RPSFrame(rPanel, op);
		gameOver = new GameOver(rps);

	}

	public RockPaperScissors(){

//		top = new Top();
//		rPanel = new RPSPanel(rps);
//		op = new OptionsPanel(rps, rPanel);
//		rFrame = new RPSFrame(rPanel, op);
//		user = new User();
//		hal = new Computer();
//		gameOver = new GameOver();
	}
	public void endGame(){
		rPanel.setLayout(new GridLayout(1,3));
		rPanel.add(gameOver);
		op.rock.setEnabled(false);
		op.paper.setEnabled(false);
		op.scissors.setEnabled(false);
		op.spock.setEnabled(false);
		op.lizard.setEnabled(false);
		op.bestOfThree.setEnabled(false);
		op.bestOfFive.setEnabled(false);
		op.bestOfSeven.setEnabled(false);
		op.infinity.setEnabled(false);
		op.reset.setEnabled(false);
		if(Integer.parseInt(RPSFrame.top.youScore.getText()) > Integer.parseInt(RPSFrame.top.halScore.getText())){
			gameOver.winLose.setText("You Win!");
			
		}else{
			gameOver.winLose.setText("You Lose!");
		}
//		rFrame.setContentPane(gameOver);

	}
	public void reset(){
		
		rPanel.remove(gameOver);
		rPanel.setLayout(new GridLayout(1,2));
		rFrame.setContentPane(rFrame.container);
		bestOf = 0;
		op.best3 = true;
		op.best5 = false;
		op.best7 = false;
		op.bestOfInfinity = false;
		maxBestOf = 3;
		op.rock.setEnabled(true);
		op.paper.setEnabled(true);
		op.scissors.setEnabled(true);
		op.spock.setEnabled(true);
		op.lizard.setEnabled(true);
		op.bestOfThree.setEnabled(true);
		op.bestOfFive.setEnabled(true);
		op.bestOfSeven.setEnabled(true);
		op.infinity.setEnabled(true);
		op.reset.setEnabled(true);
		RPSFrame.top.halScore.setText("0");
		RPSFrame.top.youScore.setText("0");
		
		op.buttonColors(0);
		rPanel.lp.setIcon(null);
		rPanel.rp.setIcon(null);
//		rPanel.lp.setText("Are You ");
//		rPanel.rp.setText("Ready?");
		rPanel.lp.setIcon(new ImageIcon(OptionsPanel.resize(rPanel.white, rPanel.lp.getWidth(), rPanel.lp.getHeight())));
		rPanel.rp.setIcon(new ImageIcon(OptionsPanel.resize(rPanel.black, rPanel.rp.getWidth(), rPanel.rp.getHeight())));

		
	}




}
