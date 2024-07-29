package observer.Observable;

import observer.Observer.Boss;

public class Pam implements Employee{

  Boss boss;
  public Pam(Boss boss){
    this.boss = boss;
    boss.add(this);
  }

  @Override
  public void update() {
    System.out.println("Pam: Michael, this might not be the best policy. " + boss.getPolicy() + " is not the best option.");
  }
}
