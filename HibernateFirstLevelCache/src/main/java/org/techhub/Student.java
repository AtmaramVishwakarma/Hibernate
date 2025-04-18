package org.techhub;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int sid;
   private String name;
   private String address;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int sid, String name, String address) {
	super();
	this.sid = sid;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
}

   
}
