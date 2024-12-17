package com.demo.Stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EmpSol {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date ram=dateFormat.parse("20-12-2005");
		Date k=dateFormat.parse("01-05-2025");
		Date b=dateFormat.parse("08-07-2023");
		
		List<Employee>emp=Arrays.asList(new Employee("Ram",2000,ram),new Employee("kiran",8000,kiran),new Employee("banda",4500,banda))
		
	}

}
