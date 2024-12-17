package com.demo.oop;

public class Cup {
	
	String type;
	
	int size;
	
	public Cup() {
		this("plastic",24);//constructor chaining help to call multple constructor
		System.out.println("In default");
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Cup(String type) {
//		super();
		System.out.println("Only for type");
		this.type = type;
	}

	public Cup(String type,int size) {
		this(type);
		this.size=size;
		this.type=type;
		System.out.println("this is for full");
	}

	@Override
	public String toString() {
		return "Cup [type=" + type + ", size=" + size + "]";
	}
}
