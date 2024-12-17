package com.demo.test;

import java.time.LocalDate;

public class ExtendBase extends BaseForPoly{
	
	LocalDate d;

	public ExtendBase(LocalDate d,int roll,String name) {
		super(roll,name);
		this.d = d;
	}

	public ExtendBase() {
		super();
	}

	public LocalDate getD() {
		return d;
	}

	public void setD(LocalDate d) {
		this.d = d;
	}

	public String generateId() {
		String id="234"+d;
		return id;
	}
	
	@Override
	public String toString() {
		return "ExtendBase [d=" + d + "]";
	}
	
	
}
