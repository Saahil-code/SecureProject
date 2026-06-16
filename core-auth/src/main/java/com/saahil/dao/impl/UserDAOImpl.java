package com.saahil.dao.impl;
import com.saahil.database.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import com.saahil.model.User;
import java.sql.SQLException;
import com.saahil.dao.UserDAO;
public class UserDAOImpl implements UserDAO{

@Override
public void init(){ 
String sql = "CREATE TABLE IF NOT EXISTS users(" + "Id int AUTO_INCREMENT PRIMARY KEY," + "Name VARCHAR(255) NOT NULL," + "Username VARCHAR(255) NOT NULL," + 
    "Password VARCHAR(255) NOT NULL," + 
    "Email VARCHAR(255) UNIQUE NOT NULL" + ")";

    try{
    Connection conn = Database.getConnected();
  PreparedStatement ps = conn.prepareStatement(sql);
    ps.execute();
      System.out.println("Table created");
      Database.Dbclose();
    }
catch(Exception e){
      e.printStackTrace();
    }
}

String create = "INSERT INTO users(Name,Username,Password,Email)VALUE(?,?,?,?)";
String readUserName = "SELECT Name FROM users WHERE Email = ?";
String readAll = "SELECT * FROM users";
// String update = "";
// String delete = "";
public void createUser(User){
    
  }
} 
