package objectpool;

public class Client {
  public static void main(String[] args) {
    DBPoolManager dbPoolManager = DBPoolManager.getInstance();
    DBConnection connection1 = dbPoolManager.getConnection();
    DBConnection connection2 = dbPoolManager.getConnection();
    DBConnection connection3 = dbPoolManager.getConnection();
    DBConnection connection4 = dbPoolManager.getConnection();
    DBConnection connection5 = dbPoolManager.getConnection();
    DBConnection connection6 = dbPoolManager.getConnection();
    DBConnection connection7 = dbPoolManager.getConnection();
    DBConnection connection8 = dbPoolManager.getConnection();
    DBConnection connection9 = dbPoolManager.getConnection();
    DBConnection connection10 = dbPoolManager.getConnection();
    DBConnection connection11 = dbPoolManager.getConnection();
    dbPoolManager.releaseConnection(connection1);
    DBConnection connection12 = dbPoolManager.getConnection();
  }
}
