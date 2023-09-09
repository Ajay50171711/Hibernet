package com.simple;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Detail")
public class Student {
	
	
	@Id
	private int Roll_no;
	private String Name;
	private String Adress;
	private String Course;
	private int pno;
	public Student(int roll_no, String name, String adress, String course, int pno) {
		super();
		Roll_no = roll_no;
		Name = name;
		Adress = adress;
		Course = course;
		this.pno = pno;
	}
	public Student() {
		super();
		
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}

}
