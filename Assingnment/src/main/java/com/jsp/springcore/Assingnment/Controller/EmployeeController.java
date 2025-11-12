package com.jsp.springcore.Assingnment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.springcore.Assingnment.Service.EmployeeService;

@Component
public class EmployeeController {
	@Autowired
	 
	private EmployeeService empS;
	
	public void saveEmployee() {
	empS.saveEmployeeDetails();
	}
}
