// Title: Lab No 13
// Author: John Aoraha
// Date: May 8, 2018

package com.roshambo;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Welcome to Rock Paper Scissors!");
	    System.out.println("Enter your name:");

	    //Create a new player and input name
	    Human human = new Human();
	    String name = sc.nextLine();
	    human.setName(name);

	    String choice = "y";
	    while (choice.equalsIgnoreCase("y")) {
	        System.out.println("Would you like to play against TheJets or TheSharks? (j/s)");
	        String opponent = sc.next();

	            if(opponent.equalsIgnoreCase("J")){
	                //Create a new Rock opponent
	                Rock rock = new Rock();
	                System.out.println(human.getName() + ": " + human.getChoice());
	                System.out.println("TheJets: " + rock.getRoshambo());

	            }
	            else if (opponent.equalsIgnoreCase("S")){
	                //Create a new Random opponent
	                Random1 random = new Random1();
	                System.out.println(human.getName() + ": " + human.getChoice());
	                System.out.println("TheSharks: " + random.getRoshambo());  

	            }
	            
	            

	        // Ask user if they want to continue
	        System.out.print("Continue? (y/n): ");
	        choice = sc.next();
	        System.out.println();
	    }

	    //Close Scanner
	    System.out.println("Goodbye!");
	    sc.close();
	}

	}