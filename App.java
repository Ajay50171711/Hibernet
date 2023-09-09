package com.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("---My Project---");
		Configuration cfg = new Configuration();
		cfg.configure("com/simple/Configure.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Student st=new Student();
		st.setRoll_no(7);
		st.setName("Suman");
		st.setAdress("Malad");
		st.setCourse("java");
		st.setPno(224);
		Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
      System.out.println("Record Saved");
      
  	session.close();
	}
}
