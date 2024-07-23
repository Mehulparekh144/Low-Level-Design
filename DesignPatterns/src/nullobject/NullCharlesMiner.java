package nullobject;

public class NullCharlesMiner implements Boss{

  @Override
  public void callToMeeting() {
    System.out.println("I am null, I can't call a meeting!");
  }
}
