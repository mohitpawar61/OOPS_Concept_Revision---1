package com.collectionLinkedlist;

public class Book {

	private String Name;
	private String writer;
	private double price;
	private int pages;
	private String content;
	
  public Book(String Name,String writer,double price,int pages,String content){
		
		this.Name = Name;
		this.writer = writer;
		this.price =price;
		this.pages = pages;
		this.content = content;
	}
	
//	public String toString() {
//		return "Book[Name="+Name+",writer"+writer+",price"+price+",pages"+pages+",content"+content+"]";
//	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
