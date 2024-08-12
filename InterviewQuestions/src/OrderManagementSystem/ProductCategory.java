package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
  int categoryId;
  String name;
  List<Product> products;
  double price;

  ProductCategory(){
    products = new ArrayList<>();
  }

  public void addProduct(Product product){
    products.add(product);
  }

  public void removeProduct(int count){
    for (int i = 0; i < count; i++) {
      products.removeFirst();
    }
  }
}
