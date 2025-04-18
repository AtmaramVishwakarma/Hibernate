package org.techhub;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApp
{
	public static void main(String[] args) 
	{
		try 
		{	
        Configuration cfg=new Configuration();
        cfg.configure("org/techhub/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session s=factory.openSession();
        //by default
        
        Student s1=s.get(Student.class, 3);
        System.out.println(s1);
        
        System.out.println("Working Some");
        
        Student s2=s.get(Student.class, 3);
        System.out.println(s2);
        
        System.out.println(s.contains(s2));
        
        s.close();
        
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
        
        
	}
}
