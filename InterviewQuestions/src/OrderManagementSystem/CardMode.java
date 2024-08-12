package OrderManagementSystem;

public class CardMode implements PaymentMode{
  @Override
  public boolean pay() {
    System.out.println("Paid via card");
    return true;
  }
}
