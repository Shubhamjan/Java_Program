package com.demo.oop;

//Constructor in Java
class Charger {

	String type;
	String company;
	float price;

	// special method having the same name as the class name
	// is called as constructor // this method gets called automatically when the
	// new object is created
	// constructor does not return any value, not even void // There are two types
	// of constructor: 1. default 2. parameterized
	// default
	public Charger() {
		System.out.println("constructor called");
	}

	// parameterized
	public Charger(String type, String company, float price) {
		this.type = type;
		this.company = company;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public void showData() {
		System.out.println("Charger [type=" + type + ", company=" + company + ", price=" + price + "]");
	}

	public static void main(String[] args) {

		Charger c1 = new Charger();
		Charger c2 = new Charger("C type", "Samsung", 2000.00f);
		c1.showData();
		c2.showData();
		System.out.println("Charger Type:" + c1.getType());
	}
}
