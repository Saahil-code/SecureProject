package com.saahil;
import java.sql.Connection;
import java.sql.DriverManager;
import com.saahil.database.Database;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

class Main{
  public static void main(String [] args ) {
    try{
    Connection conn = Database.getConnected();
    System.out.println("CONNECTION ESHTABLISHED");
    Database.Dbclose();
    }catch(Exception e){
      e.printStackTrace();
    }

  }
}
