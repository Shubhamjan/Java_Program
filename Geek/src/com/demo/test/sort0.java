package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,2,1,2,0};
		List<Integer>lst=new ArrayList<>();
        for(Integer i:a){
            lst.add(i);
        }
        Collections.sort(lst);
        System.out.println(lst);
//        System.out.println(a[-1]);
	}

}
