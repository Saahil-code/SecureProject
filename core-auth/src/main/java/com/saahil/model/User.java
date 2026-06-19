package com.saahil.model;

public class User{
  private String name;
  private String username;
  private String password;
  private String email;



  // GETTER 

  public String getName(){
    return this.name;
  }

 public String getUserName() {
    return this.username;
  }

public String getPassWord(){
    return this.password;
  }

 public String getEmail(){
    return this.email;
  }




  // SETTER 
  public void setName(String name){
    this.name = name;
  }

  public void setUserName(String username){
    this.username = username;
  }

  public void setPassWord(String password){
    this.password = password;
  }
  
  public void setEmail(String email) {
    this.email=email;
    
  }
}
