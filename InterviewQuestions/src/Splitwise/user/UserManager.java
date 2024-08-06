package Splitwise.user;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
  List<User> users;

  public UserManager() {
    this.users = new ArrayList<>();
  }

  public void createUser(User user){
    users.add(user);
  }

  public User getUser(String id){
    for(User user : users){
      if(user.getId().equals(id)){
        return user;
      }
    }
    return null;
  }

  public List<User> getAllUsers(){
    return users;
  }

  public void removeUser(User user){
    users.remove(user);
  }



}
