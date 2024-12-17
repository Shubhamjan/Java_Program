package com.demo.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleDemo {
	public static void main(String[] args) {
		List l1;
		System.out.println("1.Linked List");
		System.out.println("2.Array List");
		
		int opt=1;
		if(opt==1) {
			l1=new LinkedList();
		}else if(opt==2) {
			l1=new ArrayList();
		}
		System.out.println();
	}
}
