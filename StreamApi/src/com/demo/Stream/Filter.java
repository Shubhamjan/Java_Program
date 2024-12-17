package com.demo.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		        System.out.println("Try programiz.pro");
		        List<Integer>lst=Arrays.asList(2,4,5,6,7,8,9);
		        List<Integer>re=lst.stream().filter(i->i%2==0).collect(Collectors.toList());
		        System.out.println(re);
		        
		    
	}

}
