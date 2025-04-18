package org.techhub;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateApp 
{
  public static void main(String[] args)
  {
	try {
	  Configuration cfg=new Configuration();
	  cfg.configure("org/techhub/hibernate.cfg.xml");
	  SessionFactory factory=cfg.buildSessionFactory();
	  
	  Employee e1=new Employee();  // here we creating object 1
	  Employee e2=new Employee(); //  here we creating object 2
	  
	  e1.setEid(101);                     // object 1 set id 
	  e1.setEname("Ramesh");
	  
	  e2.setEid(102);                      //object 2 set id
	  e2.setEname("Mahesh");
	  
	  Project p1=new Project();    //creating object for project 1 & 2
	  Project p2=new Project();
	  
	  p1.setPid(1);
	  p1.setPname("Bank Management");
	  
	  p2.setPid(2);
	  p2.setPname("Online Shopping");
	   
	  List<Employee> list1=new ArrayList<Employee>(); // This list of employee
	  List<Project> list2=new ArrayList<Project>();  // this list of project
	  
	  list1.add(e1);          // adding object 
	  list1.add(e2);
	  
	  list2.add(p1);     // addiing object employee
	  list2.add(p2);
	  
	  e1.setProjects(list2);  //here we adding set project
	  p2.setEmp(list1);        //here we adding set employee
	  
	  
	  Session s=factory.openSession();
	  Transaction tx=s.beginTransaction();
	  
	  s.save(e1); // save 
	  s.save(e2);
	  s.save(p1);
	  s.save(p2);
	  
	  tx.commit();
	  factory.close();
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
}
}
