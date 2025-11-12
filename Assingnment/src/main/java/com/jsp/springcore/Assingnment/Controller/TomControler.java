package com.jsp.springcore.Assingnment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.springcore.Assingnment.Service.TomService;
@Component
public class TomControler {
	@Autowired
private TomService ts;
	
	public void saveTom() {
		ts.saveTomDetails();
	}

}
