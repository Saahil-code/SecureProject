package com.saahil.model;

public class User{
  private String name;
  private String username;
  private String password;
  private String email;

  // NAME

  // GETTER 
  public String getName(){
    return this.name;
  }
  // SETTER 
  public void setName(String name){
    this.name = name;
  }

  // USERNAME 

  //GETTER 
  public String getUserName() {
    return this.username;
  }

  //SETTER 
  public void setUserName(String username){
    this.username = username;
  }

  // PASSWORD

  // GETTER 
  public String getPassWord(){
    return this.password;
  }

  //SETTER 
  public void setPassWord(String password){
    this.password = password;
  }

  // EMAIL 

  // GETTER 
  public String getEmail(){
    return this.email;
  }

  // SETTER 
  public void setEmail(String email) {
    this.email=email;
    
  }
}
