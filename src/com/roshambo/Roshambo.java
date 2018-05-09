// Title: Lab No 13
// Author: John Aoraha
// Date: May 8, 2018

package com.roshambo;

public enum Roshambo {

ROCK,PAPER,SCISSORS;

public String toString() {
    switch(this) {
      case ROCK: return "Rock";
      case PAPER: return "Paper";
      case SCISSORS: return "Scissors";
      default: 
    	  return null;
    }
}}