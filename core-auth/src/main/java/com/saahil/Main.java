package com.saahil;
import java.sql.Connection;
import java.sql.DriverManager;
import com.saahil.database.Database;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import com.saahil.dao.impl.UserDAOImpl;
import com.saahil.dao.UserDAO;
class Main{
  public static void main(String [] args ) {
    try{

    // Database.Dbclose();
    UserDAO userdao = new UserDAOImpl();
    userdao.init();

    }catch(Exception e){
    e.printStackTrace();
     }
  }
}
