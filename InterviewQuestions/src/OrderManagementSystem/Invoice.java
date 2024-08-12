package OrderManagementSystem;

import java.util.Map;

public class Invoice {
  int totalItemPrice;
  int tax;
  int totalFinalPrice;

  public void generateInvoice(Order order){
    totalItemPrice = 200;
    tax = 20;
    totalFinalPrice = totalItemPrice + tax;
  }
}
