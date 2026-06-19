package com.saahil.service;
import com.saahil.model.User;
import java.sql.SQLException;

public interface AuthService{
    boolean register(User user);
    // boolean userLogin(User user);
    // boolean userDelete(User user);
    // boolean userEmailUpdate(User user);
    // boolean userPasswordUpdate(User user);
}