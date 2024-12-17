package com.demo.oop;

import java.util.Objects;

public class Bike {
	
	private String company;
	
	private String color;
	
	private String type;
	private static int count;
//	static {
//		count=0;
//	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public Bike() {
		System.out.println("Default");
//		count++;
//		System.out.println("object="+count);
	}
	
	public Bike(String company,String color,String type) {
		this.color=color;
		this.company=company;
		this.type=type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Bike [company=" + company + ", color=" + color + ", type=" + type + "]";
	}

	public static void main(String [] args) {
		Bike b1=new Bike("Mercedes","Red","Sedan");
		System.out.println(b1);
		System.out.println(b1.getCompany());
	}
	
}
