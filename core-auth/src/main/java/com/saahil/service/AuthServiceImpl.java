package com.saahil.service;
import com.saahil.model.User;
import com.saahil.dao.impl.UserDAOImpl;
import com.saahil.dao.UserDAO;


public class AuthServiceImpl implements AuthService{
UserDAO userDao = new UserDAOImpl();

private boolean emailNull(String email){
   return email !=null;
}
private boolean emailFormat(String email){
    String emailRegex ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    return email.matches(emailRegex);
}

private boolean emailPrescence(String email){
    return !userDao.emailCheck(email);
}

@Override
public boolean register(User user){
    if(emailNull(user.getEmail()) && emailFormat(user.getEmail())&& emailPrescence(user.getEmail())){
        return userDao.save(user.getName(),user.getUserName(),user.getPassWord(),user.getEmail());
    }
    return false;
}





}
