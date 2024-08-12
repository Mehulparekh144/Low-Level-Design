package OrderManagementSystem;

public class Payment {
  PaymentMode paymentMode;

  public Payment(PaymentMode paymentMode){
    this.paymentMode = paymentMode;
  }

  public boolean pay(){
    return paymentMode.pay();
  }
}
