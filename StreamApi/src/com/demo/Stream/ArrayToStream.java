package com.demo.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]num= {34,56,78,12,78};
		Arrays.stream(num).filter(i->i%2==0).forEach(i->System.out.println(i));//this is for specific arra
		Stream<?>stream=Stream.of(45,56,"erer","12");//this is for generic array
		stream.map(i->i+":").forEach(i->System.out.println(i));
	}

}
