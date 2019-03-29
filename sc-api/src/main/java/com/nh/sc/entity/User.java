package com.nh.sc.entity;


import java.io.Serializable;

public class User implements Serializable {

  private long id;
  private String nickname;
  private String password;
  private String salt;
  private String head;
  private java.sql.Timestamp registerDate;
  private java.sql.Timestamp lastLoginDate;
  private String loginCount;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }


  public java.sql.Timestamp getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(java.sql.Timestamp registerDate) {
    this.registerDate = registerDate;
  }


  public java.sql.Timestamp getLastLoginDate() {
    return lastLoginDate;
  }

  public void setLastLoginDate(java.sql.Timestamp lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }


  public String getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(String loginCount) {
    this.loginCount = loginCount;
  }

}
