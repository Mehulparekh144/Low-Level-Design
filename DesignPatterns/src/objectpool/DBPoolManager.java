package objectpool;

import java.util.ArrayList;
import java.util.List;

// We make use of singleton pattern to create a pool manager. Because we want to have only one pool manager.
// Pool Manager
public class DBPoolManager {

  private List<DBConnection> freeConnections = new ArrayList<DBConnection>();
  private List<DBConnection> usedConnections = new ArrayList<DBConnection>();
  private static final int maxPoolSize = 10;
  private static final int currentPoolSize = 3;
  private static DBPoolManager instance = null;

  private DBPoolManager(){
    for(int i = 0; i < currentPoolSize; i++){
      freeConnections.add(new DBConnection());
    }
  }

  public static DBPoolManager getInstance(){
    if(instance == null){
      synchronized (DBPoolManager.class){
        if(instance == null){
          instance = new DBPoolManager();
        }
      }
    }
    return instance;
  }

  public synchronized DBConnection getConnection(){
    if(freeConnections.isEmpty() && usedConnections.size() < maxPoolSize){
      freeConnections.add(new DBConnection());
    }
    else if(freeConnections.isEmpty() && usedConnections.size() == maxPoolSize){
      System.out.println("No more connections available");
      return null;
    }
    DBConnection connection = freeConnections.removeFirst();
    usedConnections.add(connection);
    return connection;
  }

  public synchronized void releaseConnection(DBConnection connection){
    if(connection == null){
      return;
    }
    if(usedConnections.contains(connection)){
      usedConnections.remove(connection);
      freeConnections.add(connection);
    }
  }




}
