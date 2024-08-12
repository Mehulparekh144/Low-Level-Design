package OrderManagementSystem.manager;

import OrderManagementSystem.Order;
import OrderManagementSystem.User;
import OrderManagementSystem.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
  List<Order> orderList;
  Map<Integer,List<Order>> userIdVsOrders;

  public OrderManager(){
    orderList = new ArrayList<>();
    userIdVsOrders = new HashMap<>();
  }

  public Order createNewOrder(User user , Warehouse warehouse){
    Order order = new Order(user , warehouse);
    orderList.add(order);

    if(userIdVsOrders.containsKey(user.id)){
      List<Order> orders = userIdVsOrders.get(user.id);
      orders.add(order);
      userIdVsOrders.put(user.id , orders);
    } else{
      List<Order> orders = new ArrayList<>();
      orders.add(order);
      userIdVsOrders.put(user.id , orders);
    }
  return order;
  }

}
