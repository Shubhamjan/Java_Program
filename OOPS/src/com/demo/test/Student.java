package com.demo.test;

public class Student {
	
	private int id;
	
	private String name;
	
	private int marks;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("Id :"+id+"\n"+"Name :"+name+"\n"+"Marks :"+marks);
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.setId(1);
		st.setName("Abc");
		st.setMarks(500);
		st.show();
	}
}
