package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
  int diceCount;

  public Dice(int diceCount){
    this.diceCount = diceCount;
  }

  public int rollDice(){
    int dices = 0;
    int total = 0;

    while(dices < diceCount){
      total += ThreadLocalRandom.current().nextInt(1 , 6);
      dices++;
    }

    return total;
  }
}
