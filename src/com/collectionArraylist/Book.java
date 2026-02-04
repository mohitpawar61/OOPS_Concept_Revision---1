package com.collectionArraylist;

public class Book {
	
	private String Bookname;
	private int id;
	private double price;
	private String author;
	private String syllabus;
	
	Book(String Bookname,int id,double price, String author,String syllabus){
		
		this.Bookname = Bookname;
		this.id = id;
		this.price = price;
		this.author = author;
		this.syllabus = syllabus;
		
	}
	
	public void setBookname(String Bookname) {
		this.Bookname = Bookname;
	}
	
	public String getBookname() {
		return Bookname;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getid() {
		return id;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setauthor() {
		this.author = author;
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setsyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	
	public String getsyllabus() {
		return syllabus;
	}
	
	public String toString() {
		return "Book[Bookname="+Bookname+",id="+id+",price="+price+",author="+author+",syllabus"+syllabus+"]";
	}

}
