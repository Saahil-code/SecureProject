package com.saahil.dao;
import com.saahil.model.User;
import java.sql.SQLException;
public interface UserDAO{
void init();
boolean save(String Name, String Username,String Password, String Email);
void readUserName(String Email);
// void readAll();
boolean updateEmail(String Email,String Username);
// String findEmail(string email) throws SQLException;
boolean deleteUser(String Email,String Password);
boolean emailCheck(String Email);
}
