package com.demo.assignment;

public class Book {

	String title;
	
	String author;
	
	double price;
	
	int stock;

	public Book() {
		super();
	}

	public Book(String title, String author, double price, int stock) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
		double total=0.0;
		if(stock>100) {
			this.price=this.price*0.90;
//			price=this.total;
//			System.out.println("The total price for books with discount :-"+this.price);
		}
	}

//	public void displayPrice() {
//		
//	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", stock=" + stock + "]";
	}
}
