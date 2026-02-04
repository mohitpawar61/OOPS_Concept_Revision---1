package com.collectionArraylist;

public class User {
	
	private String username;
	private String id;
	private String address;
	private double salary;
	private String mobileno;
	
	User(String username , String id , String address , double salary , String mobileno){
		
		this.username = username;
		this.id = id;
		this.address = address;
		this.salary = salary;
		this.mobileno = mobileno;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + ", address=" + address + ", salary=" + salary
				+ ", mobileno=" + mobileno + "]";
	}
	

}
