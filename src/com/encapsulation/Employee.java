package com.encapsulation;

public class Employee {

	private String id;
	
	private String name;
	
	private double salary;
	
	private String gender;
	
	private String address;
	
	
	public void setid(String id) {
		
		this.id = id ;
	}
	
	public String getid() {
		
		return id;
	}
	
	public void setname(String name) {
		
		this.name = name;
		
	}
	
	public String getname() {
		
		return name;
	}
	
	public void setsalary(double salary) {
		
		this.salary = salary;
	}
	
	public double getsalary() {
		
		return salary;
	}
	
	public void setgender(String gender) {
		
		this.gender = gender;
	}
	
	public String getgender() {
		
		return gender;
	}
	
	public void setaddress(String address) {
		
		this.address = address;
	}
	
	public String getaddress() {
		
		return address;
	}
	
	
}
