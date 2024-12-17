package com.demo.test;

public class Animal {
	private String color;
	
	private String type;
	
	private String name;
	
	public void setData() {
		color="yellow";
		
		type="wild";
		
		name="tiger";
	}
	
	public void show() {
		System.out.println("Animal colur: "+color);
		System.out.println("Animal type :"+type);
		System.out.println("Animal name :"+name);
	}
	
	public static void main(String[]args) {
		Animal a=new Animal();
		a.setData();
		a.show();
	}
}
