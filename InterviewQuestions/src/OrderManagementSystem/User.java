package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
  public String name;
  public int id;
  public Cart cart;
  public List<Integer> orderIds;
  public Address address;

  public User(){
    orderIds = new ArrayList<>();
    cart = new Cart();
  }

  public Cart getCart(){
    return cart;
  }
}
