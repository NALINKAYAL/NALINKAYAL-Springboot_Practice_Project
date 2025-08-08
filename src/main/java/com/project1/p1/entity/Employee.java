package com.project1.p1.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int eid;
  String ename;
  String epassword;
  int isAdmin;
  int isBlocked;
  int edepartmentId;
  public Employee() {
	super();
	// TODO Auto-generated constructor stub
  }
  @Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", epassword=" + epassword + ", isAdmin=" + isAdmin
			+ ", isBlocked=" + isBlocked + ", edepartmentId=" + edepartmentId + "]";
}
  public Employee(int eid, String ename, String epassword, int isAdmin, int isBlocked, int edepartmentId) {
	  super();
	  this.eid = eid;
	  this.ename = ename;
	  this.epassword = epassword;
	  this.isAdmin = isAdmin;
	  this.isBlocked = isBlocked;
	  this.edepartmentId = edepartmentId;
  }
  public int getEid() {
	return eid;
  }
  public void setEid(int eid) {
	this.eid = eid;
  }
  public String getEname() {
	return ename;
  }
  public void setEname(String ename) {
	this.ename = ename;
  }
  public String getEpassword() {
	return epassword;
  }
  public void setEpassword(String epassword) {
	this.epassword = epassword;
  }
  public int getIsAdmin() {
	return isAdmin;
  }
  public void setIsAdmin(int isAdmin) {
	this.isAdmin = isAdmin;
  }
  public int getIsBlocked() {
	return isBlocked;
  }
  public void setIsBlocked(int isBlocked) {
	this.isBlocked = isBlocked;
  }
  public int getEdepartmentId() {
	return edepartmentId;
  }
  public void setEdepartmentId(int edepartmentId) {
	this.edepartmentId = edepartmentId;
  }
  
  
}
