package com.basic;

public class Class_Book {

	int bookid;
	String name;
	double price;
	String author;
	
	public static void main(String[] args) {
	
		Class_Book b1 = new Class_Book();
		b1.name="Mohit";
		b1.bookid=123;
		b1.author="Mahi";
		b1.price=500.00;
		System.out.println(b1.name);
		System.out.println(b1.bookid);
		System.out.println(b1.author);
		System.out.println(b1.price);
		
		Class_Book b2 = new Class_Book();
		b2.name="MohitRio";
		b2.bookid=12321;
		b2.author="MahiRoi";
		b2.price=5204.00;
		System.out.println(b2.name);
		System.out.println(b2.bookid);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		Class_Book b3 = new Class_Book();
		b3.name="Mohit0061";
		b3.bookid=12356;
		b3.author="MahiRatDesign";
		b3.price=1000.00;
		System.out.println(b3.name);
		System.out.println(b3.bookid);
		System.out.println(b3.author);
		System.out.println(b3.price);
		
		Class_Book b4 = new Class_Book();
		b4.name="MohitRajendra";
		b4.bookid=12345;
		b4.author="MahiRo";
		b4.price=600.00;
		System.out.println(b4.name);
		System.out.println(b4.bookid);
		System.out.println(b4.author);
		System.out.println(b4.price);
		
		Class_Book b5 = new Class_Book();
		b5.name="MohitPawar";
		b5.bookid=1234;
		b5.author="Mahirat";
		b5.price=400.00;
		System.out.println(b5.name);
		System.out.println(b5.bookid);
		System.out.println(b5.author);
		System.out.println(b5.price);
	}
}
