package OrderManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
  Map<Integer,Integer> categoryIdsVsCountMap;

  Cart(){
    categoryIdsVsCountMap = new HashMap<>();
  }

  public Map<Integer, Integer> viewCart() {
    return categoryIdsVsCountMap;
  }

  public void addItemToCart(Integer categoryId , Integer count){
    categoryIdsVsCountMap.put(categoryId , categoryIdsVsCountMap.getOrDefault(categoryId , 0) + count);
  }

  public void removeItemFromCart(Integer categoryId, Integer count){
    if(categoryIdsVsCountMap.containsKey(categoryId)){
      int existing = categoryIdsVsCountMap.get(categoryId);

      if(existing - count <= 0){
        categoryIdsVsCountMap.remove(categoryId);
      } else{
        categoryIdsVsCountMap.put(categoryId , existing - count);
      }
    }
  }

  public void emptyCart(){
    categoryIdsVsCountMap = new HashMap<>();
  }


}
