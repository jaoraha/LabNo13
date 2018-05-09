// Title: Lab No 13
// Author: John Aoraha
// Date: May 8, 2018

package com.roshambo;
import java.util.Random;
public class Random1 extends Player {
private Random rand;

public Random1(){
    super();
    rand = new Random();
}

public Roshambo getRoshambo(){
    int shoot = rand.nextInt(3);
    return Roshambo.values()[shoot];
    }

@Override
int generateRoshambo() {
    return 0;
}
}