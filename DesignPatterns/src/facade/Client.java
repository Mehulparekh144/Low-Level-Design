package facade;

public class Client {
  public static void main(String[] args) {
    UserDao userDao = new UserDao();
    UserFacade userFacade = new UserFacade(userDao);
    userFacade.createUser("John Doe");
    userFacade.readUser("John Doe");
    userFacade.createUser("Jane Doe");
    userFacade.readUser("Jane Doe");
    userFacade.readUser("Jane De");
  }
}
