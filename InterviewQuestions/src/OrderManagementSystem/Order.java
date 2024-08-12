package OrderManagementSystem;

import java.util.Map;

public class Order {
  User user;
  Address address;
  Map<Integer,Integer> productCategoryVsCountMap;
  Warehouse warehouse;
  OrderStatus orderStatus;
  Invoice invoice;
  Payment payment;

  public Order(User user, Warehouse warehouse){
    this.user = user;
    this.warehouse = warehouse;
    this.address = user.address;
    this.productCategoryVsCountMap = user.getCart().viewCart();
    invoice = new Invoice();
    invoice.generateInvoice(this);
    payment = new Payment(new UPIMode());
  }

  public void checkOut(){
    warehouse.removeItemFromInventory(productCategoryVsCountMap);

    boolean isPaySuccess = payment.pay();
    if(isPaySuccess){
      user.getCart().emptyCart();
    } else{
      warehouse.addItemToInventory(productCategoryVsCountMap);
    }
  }

  public void generateOrderInvoice(){
    invoice.generateInvoice(this);
  }
}
