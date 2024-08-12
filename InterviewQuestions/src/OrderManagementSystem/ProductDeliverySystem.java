package OrderManagementSystem;

import OrderManagementSystem.manager.OrderManager;
import OrderManagementSystem.manager.UserManager;
import OrderManagementSystem.manager.WarehouseManager;
import OrderManagementSystem.strategy.NearestWarehouseSelectionStrategy;
import OrderManagementSystem.strategy.WarehouseSelectionStrategy;

import java.util.List;

public class ProductDeliverySystem {
  UserManager userManager;
  WarehouseManager warehouseManager;
  OrderManager orderManager;

  public ProductDeliverySystem(List<User> users , List<Warehouse> warehouseList){
    userManager = new UserManager(users);
    warehouseManager = new WarehouseManager(warehouseList , null);
    orderManager = new OrderManager();
  }

  public User getUser(int id){
    return userManager.getUser(id);
  }

  public Inventory getInventory(Warehouse warehouse){
    return warehouse.inventory;
  }

  public void addProductToCart(User user , ProductCategory productCategory , int count){
    Cart cart = user.getCart();
    cart.addItemToCart(productCategory.categoryId , count);
  }

  public Order placeOrder(User user , Warehouse warehouse){
    return orderManager.createNewOrder(user , warehouse);
  }

  public void checkOut(Order order){
    order.checkOut();
  }

  public Warehouse getWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy) {
    return warehouseManager.selectWarehouse(warehouseSelectionStrategy);
  }
}
