package com.demo.test;
import java.util.*;
public class ListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>lst=Arrays.asList(null,"Shubham","Chitra","Prajakta","Rajendra");
//		for(int i=0;i<lst.size();i++) {
//			if(lst.get(i)==null) {
//				lst.remove(i);
//			}
//		}
		lst.remove(0);
		System.out.println(lst);
	}

}
