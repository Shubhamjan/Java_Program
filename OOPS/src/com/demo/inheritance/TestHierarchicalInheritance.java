package com.demo.inheritance;

public class TestHierarchicalInheritance {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.setData(1,"Shubham",10000.45);
		m.setBonus(5000);
		m.showData();
		m.show();
		System.out.println("-----------------------");
		
		Typist t=new Typist();
		t.setData(2, "Om", 1000);
		t.setWage(100);
		t.showData();
		t.showWage();
	}
}
