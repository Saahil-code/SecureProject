package com.saahil.dao.impl;
import com.saahil.database.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import com.saahil.model.User;
import java.sql.SQLException;
import com.saahil.dao.UserDAO;

public class UserDAOImpl implements UserDAO{

  // QUERIES
String sql = "CREATE TABLE IF NOT EXISTS users(" + 
"Id int AUTO_INCREMENT PRIMARY KEY," + 
"Name VARCHAR(255) NOT NULL," + 
"Username VARCHAR(255) NOT NULL," + 
"Password VARCHAR(255) NOT NULL," + 
"Email VARCHAR(255) UNIQUE NOT NULL" + ")"; //done 

String create = "INSERT INTO users(Name,Username,Password,Email)VALUES(?,?,?,?);"; 
String EmailCheck = "SELECT EXISTS(" + "SELECT 1 FROM users WHERE email = ?" + ")";
String readUserName = "SELECT Name FROM users WHERE Email = ?;"; 
// String readAll = "SELECT * FROM users"; 
String updateEmail = "UPDATE users SET Email = ? WHERE username = ?;"; 
String deleteUser = "DELETE FROM users WHERE email = ? AND password = ?;";


@Override
public void init(){ 

    try(Connection conn = Database.getConnected();
  PreparedStatement ps = conn.prepareStatement(sql)

){
    ps.execute();
    System.out.println("TABLE QUERY EXECUTED");
      // Database.Dbclose();
    }
catch(Exception e){
      e.printStackTrace();
    }
}


@Override
public boolean save(String Name, String Username,String Password, String Email){
  try(Connection conn = Database.getConnected();
    PreparedStatement ps = conn.prepareStatement(create)){
    ps.setString(1,Name);
    ps.setString(2,Username);
    ps.setString(3,Password);
    ps.setString(4,Email);
    int rows = ps.executeUpdate();
    // Database.Dbclose();
    return rows>0;
  }
  catch(Exception e){
    e.printStackTrace();
  }
  return false;
}

@Override
public void readUserName(String Email){
   try( Connection conn = Database.getConnected();
    PreparedStatement ps = conn.prepareStatement(readUserName)){
    ps.setString(1,Email);
    ResultSet name  = ps.executeQuery();
    if(name.next()){
    System.out.println(name.getString("Name"));
  }
    // Database.Dbclose();
  }
  catch(Exception e){
    e.printStackTrace();
  }
}


@Override
public boolean deleteUser(String Email,String Password){
  try(Connection conn = Database.getConnected();  
    PreparedStatement ps = conn.prepareStatement(deleteUser)){
    ps.setString(1,Email);
    ps.setString(2,Password);
    int rows = ps.executeUpdate();
    // Database.Dbclose();
    return rows>0;
  }catch(Exception e){
    e.printStackTrace();
  }
  return false;
}


@Override
public boolean updateEmail(String Email,String Username){
  try(Connection conn = Database.getConnected();
    PreparedStatement ps = conn.prepareStatement(updateEmail)){
    ps.setString(1,Email);
    ps.setString(2,Username);
    int rows  = ps.executeUpdate();
    // Database.Dbclose();
    return rows>0;
  }
  catch(Exception e){
    e.printStackTrace();
  }
  return false;
}

@Override
public boolean emailCheck(String Email){
  try(Connection conn = Database.getConnected();
PreparedStatement ps = conn.prepareStatement(EmailCheck)){
ps.setString(1,Email);
ResultSet rs=ps.executeQuery();
if(rs.next()){
  return rs.getBoolean(1);
}}catch(Exception e){
  e.printStackTrace();
}
return false;
}

} 
