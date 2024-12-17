package com.demo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;import java.util.stream.Collectors;

public class MiniProject{
	static ArrayList<Product> a = new ArrayList<>();
	static Scanner sc;

	private static void addproduct() {
		System.out.println("Enter the product details:-");
//		System.out.println("Enter the id:-");
//		int id = sc.nextInt();
		System.out.println("Enter the product name:-");
		String name = sc.next();
		System.out.println("Enter the price:-");
		double p = sc.nextDouble();
		Product p1 = new Product(name, p);
		a.add(p1);
		System.out.println("Product added successfully");
	}

	public static void showProducts() {
		// TODO Auto-generated method stub
		System.out.println("------------------All Products--------------------");
		for (Product i : a) {
			System.out.println(i);
		}
	}

	private static boolean removeproduct(int pid) {
		boolean flag = false;
		for (Product i : a) {
			if (i.getPid() == pid) {
				a.remove(i);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	private static boolean updateProduct(int id, String name, double p) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		for (Product i : a) {
			if (i.getPid() == id) {
				i.setName(name);
				i.setPrice(p);
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int ch;
		do {

			System.out.println("1.Add a new Product ");
			System.out.println("2.Show Product ");
			System.out.println("3.Update Product ");
			System.out.println("4.Remove Product ");
			System.out.println("5.Sort according to price ");
			System.out.println("6.Exit ");
			System.out.println("Enter your choice ");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				addproduct();
				break;
			case 2:
				showProducts();
				System.out.println("----------------------------------------");
				break;
			case 3:
				System.out.println("Enter the productId:-");

				int id = sc.nextInt();
				
				System.out.println("Enter the details for updation:-");
				System.out.println("Enter the product name:-");
				String name=sc.next();
				
				System.out.println("Enter the product price:-");
				double p=sc.nextDouble();
				boolean f=updateProduct(id,name,p);
				if (f) {
					System.out.println("Product updated successfully");
				} else {
					System.out.println("Product failed to update");
				}
				break;
			case 4:
				System.out.println("Enter the productId:-");

				int pid = sc.nextInt();
				boolean flag = removeproduct(pid);
				if (flag) {
					System.out.println("Product removed successfully");
				} else {
					System.out.println("Product failed to remove");
				}
				break;
			case 5:
				System.out.println("Sorted list");
				System.out.println(sortByprice());
			}
		} while (ch != 6);
	}

	private static List<Product> sortByprice() {
		
		Collections.sort(a);
		return a;
	}

	
	

}
