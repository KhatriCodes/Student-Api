package com.student.api.pro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int RollNo;
	private String Name;
	
	
	
	public Student() {
		
	}
	
	
	public Student(int rollNo, String name) {
		super();
		RollNo = rollNo;
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
}
