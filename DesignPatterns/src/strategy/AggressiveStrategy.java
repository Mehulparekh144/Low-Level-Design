package strategy;

public class AggressiveStrategy implements SalesStrategy{
  @Override
  public void sell() {
    System.out.println("Buy now or you will regret it!");
  }
}
