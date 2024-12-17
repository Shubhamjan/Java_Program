package com.demo.serialDeserial;

import java.io.Serializable;

//To provide the special permissions for this class to serialize
//we must implements Serializable othrwise we will get NonSerializable exception
public class Employee implements Serializable {

	int roll;

	String name;
	
	String username;

	transient String password;

	int mark;

	public Employee() {
		super();
	}

	

	public Employee(int roll, String name, String username, String password, int mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.username = username;
		this.password = password;
		this.mark = mark;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}



	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", mark=" + mark + "]";
	}

	
}
