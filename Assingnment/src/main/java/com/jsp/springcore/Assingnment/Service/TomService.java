package com.jsp.springcore.Assingnment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.springcore.Assingnment.Repository.TomRepository;

@Component
public class TomService {
	@Autowired
	  private TomRepository tr;
	 public void saveTomDetails() {
		 tr.save();
	 }

}
