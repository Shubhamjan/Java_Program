package com.demo.serialDeserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Employee e1=new Employee(1,"Shubham","shubham1","shubham",90);
		FileOutputStream f1=new FileOutputStream("employee.ser");
		ObjectOutputStream os=new ObjectOutputStream(f1);
		os.writeObject(e1);
		System.out.println("Employee object serialized");
	
	}
}
