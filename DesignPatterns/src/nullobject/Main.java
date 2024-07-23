package nullobject;

public class Main {
  public static void main(String[] args) {
    BossFactory bossFactory = new BossFactory();
    Boss boss = bossFactory.getBoss("Michael");
    boss.callToMeeting();
    boss = bossFactory.getBoss("null");
    boss.callToMeeting();
  }
}
