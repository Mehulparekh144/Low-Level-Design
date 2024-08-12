package OrderManagementSystem;

import OrderManagementSystem.strategy.NearestWarehouseSelectionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Warehouse> warehouseList = new ArrayList<>();
    warehouseList.add(initializeWarehouse());

    List<User> users = new ArrayList<>();
    users.add(initializeUser());

    ProductDeliverySystem productDeliverySystem = new ProductDeliverySystem(users , warehouseList);
    runDeliveryFlow(productDeliverySystem , 1);
  }

  private static void runDeliveryFlow(ProductDeliverySystem productDeliverySystem, int userId) {
    User user = productDeliverySystem.getUser(userId);

    Warehouse warehouse = productDeliverySystem.getWarehouse(new NearestWarehouseSelectionStrategy());

    Inventory inventory = productDeliverySystem.getInventory(warehouse);

    ProductCategory productCategory = null;

    for(ProductCategory productCategory1 : inventory.productCategoryList){
      if(productCategory1.name.equals("Soft Drinks")){
        productCategory = productCategory1;
      }
    }

    if(productCategory == null){
      System.out.println("No such product found");
      return;
    }

    productDeliverySystem.addProductToCart(user , productCategory , 2);

    Order order = productDeliverySystem.placeOrder(user , warehouse);
    productDeliverySystem.checkOut(order);
  }

  private static User initializeUser() {
    User user = new User();
    user.name = "Jim";
    user.id = 1;
    user.address = new Address(1234 , "New Jersey" , "MA");
    return user;
  }

  private static Warehouse initializeWarehouse() {
    Warehouse warehouse = new Warehouse();
    Inventory inventory = new Inventory();

    inventory.addCategory(1 , "Soft Drinks" , 120);
    inventory.addCategory(2 , "Games" , 1000);

    Product product1 = new Product();
    product1.name = "Pepsi";
    product1.id = 1;

    Product product2 = new Product();
    product2.name = "God Of War";
    product2.id = 2;

    for(int i = 0 ; i < 100 ; i++){
      inventory.addProduct(product1 , 1);
      inventory.addProduct(product2 , 2);
    }


    warehouse.inventory = inventory;
    return warehouse;
  }


}
