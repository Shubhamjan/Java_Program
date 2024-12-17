package com.demo.Comparable;

public class Product  implements Comparable<Product>{
	
	private int pid;
	
	private static int count;
	
	static {
		count=0;
	}
	
	private String name;
	
	private double price;

	public Product() {
		super();
	}

	public Product( String name, double price) {
		super();
		count++;
		this.pid =count;
		this.name = name;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.price>o.price) {
			return 1;
		}else if(this.price<o.price) {
			return -1;
		}else {
			return 0;
		}
//		return 0;
	}
	
	
	
}
