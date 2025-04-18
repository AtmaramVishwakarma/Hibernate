package org.techhub;
import org.techhub.Student;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLExample 
{
     public static void main(String[] args) 
     {
    	 try {
		Configuration cfg=new Configuration();
		cfg.configure("org/techhub/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		
		//HQL Syntax:
//		String q1="from Student where address='Dinesh' ";
//		Query q=s.createQuery(q1);
		
		// Single (Unique)
		//multiple-list
//		List <Student> list=q.list(); 
//		
//		for(Student st:list)                  // for each loop 
//		{
//			System.out.println(st.getName()+" "+st.getAddress());
//		}
		//here we use delete query
		Transaction tx=s.beginTransaction(); // here we physically chnages i.e. use Transaction
//		Query q2=s.createQuery("delete from Student as s where s.name=:c"); //here we use alise 's' is reference pass c is as parameter
//		q2.setParameter("c", "chennai");
//		int r=q2.executeUpdate();     // retuen value r in int.
//		System.out.println("Deleted Successfully....");
//		System.out.println(r);
		
		//here we use update query
		
//	Query q3=s.createQuery("update Student set name=:c where address=:a"); // here we pass parameter
//		q3.setParameter("c", "Pune");
//   	    q3.setParameter("a", "Sunil");
//	    int v=q3.executeUpdate();
//		System.out.println("Update Successfully...");
//		System.out.println(v);	
//		
		//after we use join HQL query we have oneTomany realtionship we have answer question Table of oneTo Many Relationship
		
		Query q4=s.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answers as a"); // here we use alise
		List <Object []>list2=q4.getResultList();
		
		for(Object[] arr:list2)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		
		tx.commit(); //changes save 
		s.close();
		factory.close();
    	 }
    	 catch (Exception e)
    	 {
		    System.out.println(e);
		}
	}
}
