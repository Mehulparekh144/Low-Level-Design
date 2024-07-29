package observer.Observable;

import observer.Observer.Boss;

public class Jim implements Employee{

  Boss boss;
  public Jim(Boss boss){
    this.boss = boss;
    boss.add(this);
  }

  @Override
  public void update() {
    System.out.println("Jim: I have received the new policy: " + boss.getPolicy());
  }
}
