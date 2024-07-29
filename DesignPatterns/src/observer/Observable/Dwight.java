package observer.Observable;

import observer.Observer.Boss;

public class Dwight implements Employee{

  Boss boss;
  public Dwight(Boss boss){
    this.boss = boss;
    boss.add(this);
  }

  @Override
  public void update() {
    System.out.println("Dwight: Michael, what should I do regarding " + boss.getPolicy() + "?");
  }
}
