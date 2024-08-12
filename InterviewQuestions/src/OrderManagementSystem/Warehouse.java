package OrderManagementSystem;

import java.util.Map;

public class Warehouse {
  Inventory inventory;
  Address address;

  public void removeItemFromInventory(Map<Integer,Integer> productCategoryVsCountMap){
    inventory.removeItems(productCategoryVsCountMap);
  }

  public void addItemToInventory(Map<Integer, Integer> productCategoryVsCountMap) {
    //Adds it back to inventory
  }
}
