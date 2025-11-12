package com.jsp.springcore.Assingnment.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.jsp.springcore.Assingnment.Model.Employee;

@Component
public class EmployeeRepository {
	
public void save() {
		Employee emp = new Employee();
		emp.setEmpId(105);
		emp.setEmpName("KAMAL");
		emp.setEmpSal(28000);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(emp);
		
		trans.commit();
		session.close();
		
		System.out.println("DATA SAVED SUCCESSFULLY");
		
		
	}
}
