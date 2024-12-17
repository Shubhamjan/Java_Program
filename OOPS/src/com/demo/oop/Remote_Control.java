package com.demo.oop;

public class Remote_Control {
	
	private String company;

	private String color;

	private String type;

	private int noButton;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoButton() {
		return noButton;
	}

	public void setNoButton(int noButton) {
		this.noButton = noButton;
	}
	
	public void show() {
		System.out.println("Company :-"+company+"\n"+"Color :-"+color+"\n"+"Type :-"+type+"\n"+"no of buttons :-"+noButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote_Control rm=new Remote_Control();
		rm.setColor("black");
		rm.setCompany("Sony");
		rm.setType("Gaming");
		rm.setNoButton(10);
		rm.show();
	}

}
