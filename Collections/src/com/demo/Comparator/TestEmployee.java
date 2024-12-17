package com.demo.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 The sort method internally calls the compare method of the NameComparator object 
 multiple times to compare pairs of Employee objects and decide their order.

For example:

java
Copy code
new NameComparator().compare(employee1, employee2);
 */
public class TestEmployee {
	
	static Scanner sc=new Scanner(System.in);
	
	private static List<Employee>lst=new ArrayList<>();
	
	public static void main(String[] args) {
		int ch;
		do {

			System.out.println("1.Add a new Employee ");
			System.out.println("2.Show All Employee ");
			System.out.println("3.Update Employee ");
			System.out.println("4.Remove Employee ");
			System.out.println("5.Sort according to salary ");
			System.out.println("6.Exit ");
			System.out.println("Enter your choice ");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				addEmployee();
				break;
			case 2:
				showEmployee();
				System.out.println("----------------------------------------");
				break;
			case 3:
				
				System.out.println("Enter the employee details:-");
				System.out.println("Enter the employee id:-");
				int id=sc.nextInt();
				System.out.println("Enter the employee name:-");
				String name=sc.next();
				System.out.println("Enter the dept name:-");
				String dept=sc.next();
				System.out.println("Ente the salary:- ");
				long p=sc.nextLong();
				boolean f=updateEmployee(id,name,dept,p);
				if (f) {
					System.out.println("Product updated successfully");
				} else {
					System.out.println("Product failed to update");
				}
				break;
			case 4:
				System.out.println("Enter the productId:-");

				int pid = sc.nextInt();
				boolean flag = removeEmployee(pid);
				if (flag) {
					System.out.println("Product removed successfully");
				} else {
					System.out.println("Product failed to remove");
				}
				break;
			case 5:
				System.out.println("Sorted list");
				sortBySalary();
			}
		} while (ch != 6);
	}

	
	private static void sortBySalary() {
		// TODO Auto-generated method stub
		
		Collections.sort(lst,new SalaryComparator());
		System.out.println(lst);
		
	}


	private static boolean removeEmployee(int pid) {
		// TODO Auto-generated method stub
		for(int i=0;i<lst.size();i++) {
			if(lst.get(i).getId()==pid) {
				lst.remove(i);
				return true;
			}
		}
		
		return false;
	}


	private static boolean updateEmployee(int id, String name, String dept, long p) {
		
		for(Employee e:lst) {
			if(e.getId()==id) {
				e.setId(id);
				e.setDept(dept);
				e.setName(name);
				e.setSalary(p);
//				lst.add(e);
				return true;
			}
		}
		return false;
	}



	private static void showEmployee() {
		// TODO Auto-generated method stub
		System.out.println("All Employee");
		for(Employee e:lst) {
			System.out.println("Employee id: "+e.getId());
			System.out.println("Employee name: "+e.getName());
			System.out.println("Employee department: "+e.getDept());
			System.out.println("Employee salary: "+e.getSalary());
			System.out.println();
		}
	}

	private static void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("------------------Fill the Details------------------");
		System.out.println("Enter the name:-");
		String name=sc.next();
		
		System.out.println("Enter the department name:-");
		String dname=sc.next();
		
		System.out.println("Enter the salary:-");
		long sal=sc.nextLong();
		
		Employee e=new Employee(name,dname,sal);
		lst.add(e);
		System.out.println("Employee added successfully");
	}
}
