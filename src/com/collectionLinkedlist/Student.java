package com.collectionLinkedlist;

public class Student {
	
	private String Studentname;
	private int rollno;
	private int attendance;
	private String email;
	private String address;
	public Student(String studentname, int rollno, int attendance, String email, String address) {
		super();
		Studentname = studentname;
		this.rollno = rollno;
		this.attendance = attendance;
		this.email = email;
		this.address = address;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
