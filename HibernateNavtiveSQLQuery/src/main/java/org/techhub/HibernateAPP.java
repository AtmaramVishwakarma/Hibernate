package org.techhub;

import java.util.Arrays;
import java.util.List;
import java.sql.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.sql.Select;

public class HibernateAPP 
{

	public static void main(String[] args)
	{
		try {
			
	      Configuration cfg=new Configuration();
	     cfg.configure("org/techhub/hibernate.cfg.xml");
	     SessionFactory  factory=cfg.buildSessionFactory();
	     
	     Session s= factory.openSession();
	     
	     String q1= "select *from Student"; // this is SQL Query
	     
	   NativeQuery nq=s.createSQLQuery(q1);
	   
	   List<Object [] > list=nq.list();  // here we take a Object Array here Object of Array in array is present  2 d array
	   for(Object[] st:list)      //one array element store list into st object 
	   {
		   System.out.println(Arrays.deepToString(st));
	   }
	   
	   s.close();
	   factory.close();   
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}     
	}
}
