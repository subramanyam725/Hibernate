package com.balu.hibernate.DemoHibe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Alien {
	
	@Id
	private int aid;
	//@Transient
	private AlienFullName aname;;
	@Column(name = "Alien_Color")
	private String color;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AlienFullName getAname() {
		return aname;
	}

	public void setAname(AlienFullName aname) {
		this.aname = aname;
	}

}
