// Title: Lab No 13
// Author: John Aoraha
// Date: May 8, 2018

package com.roshambo;

abstract class Player {
	String name;
	Roshambo roshambo;

	abstract int generateRoshambo();

	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public Roshambo getRoshambo() {
	    return roshambo;
	}
	public void setRoshambo(Roshambo newRoshambo) {
	    roshambo = newRoshambo;
	}
	}