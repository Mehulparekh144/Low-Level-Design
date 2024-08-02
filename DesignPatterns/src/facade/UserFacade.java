package facade;

public class UserFacade {
  private UserDao userDao;

  public UserFacade(UserDao userDao) {
    this.userDao = userDao;
  }

  public void createUser(String user){
    userDao.create(user);
  }

  public void readUser(String user){
    userDao.find(user);
  }
}
