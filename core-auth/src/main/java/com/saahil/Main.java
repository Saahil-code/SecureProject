package com.saahil;
import com.saahil.dao.impl.UserDAOImpl;
import com.saahil.dao.UserDAO;
import com.saahil.service.AuthServiceImpl;
import com.saahil.service.AuthService;
import com.saahil.model.User;


class Main{
  public static void main(String [] args ) {
    try{
    UserDAO userdao = new UserDAOImpl();
    userdao.init();
  //  User user = new User();
  //  AuthService authService = new AuthServiceImpl();
    }catch(Exception e){
    e.printStackTrace();
     }


  }
}
