package com.demo.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>lst=Arrays.asList(2,4,5,6,7,8,9);
		 List<String>names=Arrays.asList("Shubham","Chitra","Prajakta","Rajendra");
		 List<Integer>num=Arrays.asList(34,12,5,67,8,90);
//		 Comparator<String>c=(a,b)->{
//			 int l1=a.length();
//			 int l2=b.length();
//			 if(l1>l2) {
//				 return 1;
//			 }else if(l1<l2) {
//				 return -1;
//			 }else {
//				 return 0;
//			 }
//		 };
//		 List<Integer>sort=lst.stream().sorted().collect(Collectors.toList());//ascending
////		 List<Integer>desc=lst.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
//		 List<Integer>desc=lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		 System.out.println(sort);
//		 System.out.println(desc);
////		 List<String>n=names.stream().sorted((a,b)->Integer.compare(a.length(), b.length())).collect(Collectors.toList());
//		 System.out.println(n);
//		 List<String>sort=names.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
//		 System.out.println(sort);
		Integer i= num.stream().max((a,b)->Integer.compare(b,a)).get();
		System.out.println(i);
		 
	}

}
