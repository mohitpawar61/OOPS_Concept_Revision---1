package com.collectionArraylist;

public class Student {
	
	private String name;
	private String address;
	private int id;
	
	Student(String name, String address, int id){
		this.name = name;
		this.address = address;
		this.id = id;
	}
		
	public  void setname(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getid() {
		return id;
	}

}
