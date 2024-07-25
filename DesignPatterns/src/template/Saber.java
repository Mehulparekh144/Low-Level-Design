package template;

public class Saber extends SaleFlow{
  @Override
  void visit() {
    System.out.println("Welcome to Saber's shop!");
  }

  @Override
  void selectQuantity() {
    System.out.println("Selecting 1ream of paper...");
  }

  @Override
  void pay() {
    System.out.println("Paying with 2% discount...");
  }

  @Override
  void confirm() {
    System.out.println("Order confirmed!");
  }
}
