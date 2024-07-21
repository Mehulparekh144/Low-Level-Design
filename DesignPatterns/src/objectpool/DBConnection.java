package objectpool;

import java.sql.Connection;
import java.sql.DriverManager;

// Resource
public class DBConnection {

  Connection mySqlConnection;

  public DBConnection(){
    try{
      mySqlConnection = DriverManager.getConnection("url" , "username" , "password");
    } catch (Exception e){
      System.out.println("Error while creating connection");
    }
  }

}
