package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
  List<ProductCategory> productCategoryList;

  public Inventory(){
    productCategoryList = new ArrayList<>();
  }

  public void addCategory(int id , String name , double price){
    ProductCategory productCategory = new ProductCategory();
    productCategory.categoryId = id;
    productCategory.name = name;
    productCategory.price = price;
    productCategoryList.add(productCategory);
  }

  public void addProduct(Product product , int categoryId){
    for(ProductCategory productCategory : productCategoryList){
      if(productCategory.categoryId == categoryId){
        productCategory.addProduct(product);
      }
    }
  }

  public void removeItems(Map<Integer,Integer> productCategoryVsCount){
    for(Map.Entry<Integer,Integer> entry : productCategoryVsCount.entrySet()){
      ProductCategory productCategory = getProductCategory(entry.getKey());
      if(productCategory == null) continue;
      productCategory.removeProduct(entry.getValue());
    }
  }

  private ProductCategory getProductCategory(int id){
    for(ProductCategory productCategory : productCategoryList){
      if(productCategory.categoryId == id){
        return productCategory;
      }
    }
    return null;
  }
}
