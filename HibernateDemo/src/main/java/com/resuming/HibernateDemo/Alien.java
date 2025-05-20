package com.resuming.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity(name="alien_table")//it will change both entity name as well as table name, to keep entity not changed do not mention any name
//@Table(name="table_name") // it will only affect the table name not the entity name
public class Alien {
	
	
	@Id
	private int aid;
	
	//@Transient // this annotation is used to skip the column mention by transient 
	private AlienName aname;
	//@Column(name="alien_color")//to change the column name in the table for color column
	private String color;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName an) {
		this.aname = an;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
}
