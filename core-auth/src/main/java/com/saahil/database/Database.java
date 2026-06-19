package com.saahil.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

public class Database{
// private static final String URL = "jdbc:mysql://localhost:3306/authdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

 private static final String URL = "jdbc:mysql://localhost:3306/authdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

  // private static final String USERNAME = "saahilsharma";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "BangBang@123A";
  static Connection conn = null;
 


// CONNECTION ESHTABLISHMENT

public static Connection getConnected() throws SQLException{
  return DriverManager.getConnection(URL,USERNAME,PASSWORD);
}




// CONNECTION CLOSING 

public static void Dbclose(){

  if(conn!=null){
    try{conn.close();}
    catch(Exception e){
    e.printStackTrace();
    }
  }

  
  AbandonedConnectionCleanupThread.checkedShutdown();
  
}
}
