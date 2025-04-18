package org.techhub;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class HibernateApp 
{

	public static void main(String[] args)
	{
      try 
      {
		Configuration cfg=new Configuration();
		cfg.configure("org/techhub/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		//creating object here for Question 
		Question qs=new Question();
		qs.setQuestionId(111);
		qs.setQuestion("What is java ");
		
		//creating object for Answer
		
		Answer an=new Answer();
		an.setAnswerId(222);
		an.setAnswer("Java is a programming Lang.");
		an.setQuestion(qs);
		qs.setAnswer(an);
		
		//creating object here for Question 
				Question qs1=new Question();
				qs1.setQuestionId(177);
				qs1.setQuestion("What is Mysql ?");
				
				//creating object for Answer
				
				Answer an1=new Answer();
				an1.setAnswerId(277);
				an1.setAnswer("Mysql is Database");
				an1.setQuestion(qs1);
				qs1.setAnswer(an1);
		
		// Session for saving because session has save mehod
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(qs);   //saving for 1st object  Question
		s.save(qs1); //saving for 2nd object Question
		
		s.save(an);  // saving for 1st object for Answer
		s.save(an1);// saving for 2nd object for Answer
		
		
		tx.commit();//physically database changes
		
		
	
		s.close();  //close session 
		sf.close(); //close sessionfactory
		
		
	  } 
      catch (Exception e)
      
      {
           System.out.println(e);
	 }

	}

}
