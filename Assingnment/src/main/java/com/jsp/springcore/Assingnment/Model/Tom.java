package com.jsp.springcore.Assingnment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Tom {
	@Id
	private int tAge;
	private String tName;
	public int gettAge() {
		return tAge;
	}
	public void settAge(int tAge) {
		this.tAge = tAge;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Tom [tAge=" + tAge + ", tName=" + tName + "]";
	}
	

}
