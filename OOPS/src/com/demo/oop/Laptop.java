package com.demo.oop;

public class Laptop {

	private int id;

	private String company;

	private float price;

	public Laptop() {
		System.out.println("default");
//		super();
	}

	public Laptop(int id, String company, float price) {
//		super();
		System.out.println("parametrized");
		this.id = id;
		this.company = company;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", company=" + company + ", price=" + price + "]";
	}
}
