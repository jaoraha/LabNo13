// Title: Lab No 13
// Author: John Aoraha
// Date: May 8, 2018

package com.roshambo;

import java.util.Scanner;

public class Human extends Player {
	String player1 = "";

	public Human(){
	    super();
	    }

	Scanner scan = new Scanner(System.in);

	public Roshambo getChoice(){
	    System.out.println("Enter Choice: Paper, Rock, Scissors (r/p/s): ");
	    char playerChoice = scan.nextLine().toUpperCase().charAt(0);

	    switch (playerChoice){
	        case 'R':
	            return Roshambo.ROCK;
	        case 'P':
	            return Roshambo.PAPER;
	        case 'S':
	            return Roshambo.SCISSORS;
	        }
	    System.out.println("Invalid input!");
	return getChoice();
	}

	public String getPlayer1() {
	    return player1;
	}

	public void setPlayer1(String player1) {
	    this.player1 = player1;
	}

	@Override
	int generateRoshambo() {
	    // TODO Auto-generated method stub
	    return 0;
	}
	}