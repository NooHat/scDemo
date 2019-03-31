package com.nh.sc.entity;


public class Dept {

  private long deptno;
  private String dname;
  private String db_source;


  public long getDeptno() {
    return deptno;
  }

  public void setDeptno(long deptno) {
    this.deptno = deptno;
  }


  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }


  public String getDb_source() {
    return db_source;
  }

  public void setDb_source(String db_source) {
    this.db_source = db_source;
  }

}
