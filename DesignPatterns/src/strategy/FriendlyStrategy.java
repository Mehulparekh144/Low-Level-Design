package strategy;

public class FriendlyStrategy implements SalesStrategy{
  @Override
  public void sell() {
    System.out.println("Hello! How can I help you today?");
  }
}
