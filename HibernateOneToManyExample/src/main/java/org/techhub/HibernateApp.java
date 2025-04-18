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
			
			
			Answer an1=new Answer();
			an1.setAnswerId(223);
			an1.setAnswer("java is secure langauge");
			an1.setQuestion(qs);
			
			
			Answer an2=new Answer();
			an2.setAnswerId(224);
			an2.setAnswer("Java is Platform independent Langauge");
			an2.setQuestion(qs);
			
			Answer an3=new Answer();
			an3.setAnswerId(225);
			an3.setAnswer("The help of java we can create web devlopment");
			an3.setQuestion(qs);
			
			List<Answer> list=new ArrayList<Answer>();
			
			list.add(an);    //adding answer
			list.add(an1);
			list.add(an2);
			list.add(an3);
			
			qs.setAnswers(list);
			
			// Session for saving because session has save mehod
			Session s=sf.openSession();
			
			Transaction tx=s.beginTransaction();
			
			s.save(qs);
			s.save(an);
			s.save(an1);
			s.save(an2);
			s.save(an3);
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
