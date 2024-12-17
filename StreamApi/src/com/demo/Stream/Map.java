package com.demo.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>lst=Arrays.asList(2,4,5,6,7,8,9);
		 List<Integer>re=lst.stream().collect(Collectors.toList());
		 Long i=lst.stream().count();
		 System.out.println(re);
		 System.out.println(i);
	}

}
