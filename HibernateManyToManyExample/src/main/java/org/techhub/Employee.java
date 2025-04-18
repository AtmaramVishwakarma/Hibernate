package org.techhub;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee 
{
	@Id
   private int eid;
   private String ename;
   @OneToMany                             // here it means one empolyee having many projects
   private List<Project> projects;   //mappedBy ="projects"
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
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
public Employee(int eid, String ename, List<Project> projects) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.projects = projects;
}
public Employee() {
	super();
	
}
   

   
   
}
