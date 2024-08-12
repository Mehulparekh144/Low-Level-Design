package OrderManagementSystem;

public class UPIMode implements PaymentMode{
  @Override
  public boolean pay() {
    System.out.println("Paid via UPI");
    return true;
  }
}
