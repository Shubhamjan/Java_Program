package com.demo.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(34);
		v.add(45);
		v.add(12);
		v.add(67);
		v.add(78);
		
//		Enumeration e1=v.elements();
//		while(e1.hasMoreElements()) {
//			System.out.print(e1.nextElement()+" ");
//		}
//		Iterator i=v.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		Collections.rotate(v, 2);
		for(int i=0;i<v.size();i++) {
			System.out.println("The "+(i+1)+" element is "+v.get(i));
		}
	}
}
