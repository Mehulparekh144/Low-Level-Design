package strategy;

public class PersuasiveStrategy implements SalesStrategy{
  @Override
  public void sell() {
    System.out.println("Please buy this product. It is the best!");
  }
}
