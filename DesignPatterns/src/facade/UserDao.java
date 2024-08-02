package facade;

public class UserDao {
  String user;

  public void create(String user){
    this.user = user;
    System.out.println("User " + user + " created");
  }

  public void delete(){
    this.user = null;
    System.out.println("User deleted");
  }

  public void update(String user){
    this.user = user;
    System.out.println("User " + user + " updated");
  }

  public void find(String user){
    if(this.user == null) {
      System.out.println("User " + user + " not found");
    }else if(this.user.equals(user)){
      System.out.println("User " + user + " found");
    } else{
      System.out.println("User " + user + " not found");
    }
  }

}
