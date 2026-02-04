package com.collectionLinkedlist;

public class Product {
	
	private String name;
	private double price;
	private String details;
	private int ingrediant;
	private String quatity;
	public Product(String name,double price,String details,int ingrediant,String quatity) {
		
		this.name = name;
		this.price = price;
		this.details =details;
		this.ingrediant =  ingrediant;
		this.quatity = quatity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getIngrediant() {
		return ingrediant;
	}
	public void setIngrediant(int ingrediant) {
		this.ingrediant = ingrediant;
	}
	public String getQuatity() {
		return quatity;
	}
	public void setQuatity(String quatity) {
		this.quatity = quatity;
	}
	
	
	

}
