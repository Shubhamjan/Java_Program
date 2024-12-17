package com.demo.assignment;

public class TestEmployeeInheritance {
public static void main(String[] args) {
	Employee e=new Employee("Abc",5420.00);
	System.out.println("For employee:-");
	System.out.println("Bonus for employee:-"+e.calculateBonus());
	
	Manager m=new Manager("xyz",10000.34,500);
	System.out.println("For Manager:-");
	System.out.println("Bonus for Manager:-"+m.calculateBonus());
}
}
