package com.jsp.springcore.Assingnment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.springcore.Assingnment.Repository.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	 
	private EmployeeRepository repo;
	
	public void saveEmployeeDetails() {
		repo.save();
	}
	
	

}
