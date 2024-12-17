package com.demo.serialDeserial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f1=new FileInputStream("employee.ser");
		ObjectInputStream os=new ObjectInputStream(f1);
		Employee e1=(Employee) os.readObject();
		System.out.println(e1);
	}
}
