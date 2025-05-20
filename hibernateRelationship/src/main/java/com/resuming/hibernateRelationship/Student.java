package com.resuming.hibernateRelationship;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int roll_no;
	private String name;
	private int marks;
	
	/*
	 * @OneToOne 
	 * private Laptop laptop;
	 * 
	 * public Laptop getLaptop() {
	 * return laptop;}
	 * 
	 * public void setLaptop(Laptop laptop) {this.laptop = laptop;}
	 */
	
	//@ManyToMany(mappedBy="student")
	@OneToMany(mappedBy="student",fetch=FetchType.EAGER)
	private List<Laptop> laptop=new ArrayList<Laptop>();
	
	public List<Laptop> getLaptop() { 
		return laptop;}
	
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;}
	
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + ", laptop=" + laptop + "]";
	}
	
	
}
