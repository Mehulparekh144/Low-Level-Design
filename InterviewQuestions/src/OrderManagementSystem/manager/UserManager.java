package OrderManagementSystem.manager;

import OrderManagementSystem.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
  List<User> users;

  public UserManager(List<User> users){
    this.users = users;
  }

  public void addUser(User user){
    users.add(user);
  }

  public void removeUser(User user){
    users.remove(user);
  }

  public User getUser(int id){
    for(User user : users){
      if(user.id == id){
        return user;
      }
    }

    return null;
  }
}
