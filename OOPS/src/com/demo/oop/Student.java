package com.demo.oop;

public class Student {
	
	private int id;
	
	private String name;
	
	private String hobby;

	public Student() {
//		super();
		this(1,"Shubham","Playing games");
		System.out.println("In default");
	}

	public Student(int id, String name, String hobby) {
//		super();
		
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		System.out.println("In parametrized");
	}

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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobby=" + hobby + "]";
	}
}
