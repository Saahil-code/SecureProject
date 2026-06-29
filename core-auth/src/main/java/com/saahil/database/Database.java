package com.saahil.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import io.github.cdimascio.dotenv.Dotenv;

public class Database{

  static Dotenv dotenv = Dotenv.load();

private static final String URL = dotenv.get("DB_URL");
private static final String USERNAME = dotenv.get("DB_USERNAME");
private static final String PASSWORD = dotenv.get("DB_PASSWORD");
static Connection conn = null;
 


// CONNECTION ESHTABLISHMENT

public static Connection getConnected() throws SQLException{
    if (URL == null || USERNAME == null || PASSWORD == null) {
    throw new RuntimeException(
        "Database environment variables are missing."
    );
}
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
