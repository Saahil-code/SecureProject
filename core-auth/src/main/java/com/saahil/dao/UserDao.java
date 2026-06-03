package com.saahil.dao;
import com.saahil.model.User;
import java.sql.SQLException;
public interface UserDao{
void save(User user);
// String findEmail(string email) throws SQLException;
}
