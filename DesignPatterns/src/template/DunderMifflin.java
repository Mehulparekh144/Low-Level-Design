package template;

public class DunderMifflin extends SaleFlow{
  @Override
  void visit() {
    System.out.println("Welcome to Dunder Mifflin!");
  }

  @Override
  void selectQuantity() {
    System.out.println("Selecting 10ream of paper...");
  }

  @Override
  void pay() {
    System.out.println("Paying with 10% discount...");
  }

  @Override
  void confirm() {
    System.out.println("Order confirmed!");
  }
}
