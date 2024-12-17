package com.demo.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst=Arrays.asList(2,5,7,8,12);
		Consumer<Integer>c=new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		lst.forEach(c);
	}

}
