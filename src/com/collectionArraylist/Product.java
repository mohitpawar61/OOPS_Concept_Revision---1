package com.collectionArraylist;

public class Product {

	private String Companyname;
	private int Noofproducts;
	private double price;
	private String flavour;
	private int purchase;
	
	Product(String Companyname , int Noofproducts , double price , String flavour , int purchase){
		
		this.Companyname = Companyname;
		this.Noofproducts = Noofproducts;
		this.price = price ;
		this.flavour = flavour;
		this.purchase = purchase;
		
		
	}
	
	public void setCompanyname(String Companyname) {
		this.Companyname = Companyname;
	}
	
	public String getCompanyname() {
		return Companyname;
	}
	
	public void setNoofproducts(int Noofproducts) {
		this.Noofproducts = Noofproducts;
	}
	
	public int getNoofproducts() {
		return Noofproducts;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setflavour(String flavour) {
		this.flavour = flavour;
	}
	
	public String getflavour() {
		return flavour;
	}
		
	public void setpurchase(int purchase) {
		this.purchase =purchase;
	}
	
	public int getpurchase() {
		return purchase;
	}
		
	public String toString() {
		return "Product[Companyname="+ Companyname +",Noofproducts="+ Noofproducts +",price="+ price + ",flavour="+ flavour +",purchase="+ purchase +"]";
	}
		
	
}
