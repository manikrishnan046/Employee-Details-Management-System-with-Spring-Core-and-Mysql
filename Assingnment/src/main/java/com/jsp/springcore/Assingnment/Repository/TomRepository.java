package com.jsp.springcore.Assingnment.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.jsp.springcore.Assingnment.Model.Tom;

@Component
public class TomRepository {
	
	public void save() {
		
		Tom t = new Tom();
		t.settName("mk");
		t.settAge(102);
		
		Configuration cfg = new Configuration();
		 cfg.configure();
		 cfg.addAnnotatedClass(Tom.class);
		  SessionFactory sf = cfg.buildSessionFactory();
		  Session session = sf.openSession();
		   Transaction trans = session.beginTransaction();
		     
		   session.save(t);
		   trans.commit();
		   session.close();
		
		
		System.out.println("DATA SAVED ");
	}

}
