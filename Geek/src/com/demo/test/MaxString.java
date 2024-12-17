package com.demo.test;
import java.util.*;
public class MaxString {

	public static void main(String[] args) {
		String[]sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		// TODO Auto-generated method stub
		  List<Integer>lst=new ArrayList<>();
	        for(int i=0;i<sentences.length;i++){
	            int temp=1;
	            for(int j=0;j<sentences[i].length();j++){
	                if(sentences[i].charAt(j)==' '){
	                    temp++;
	                }
	            }
	            lst.add(temp);
	        }
//	        Collections.sort(lst);
//	        lst.sort(Comparator.naturalOrder());
//	        int re=lst.stream().max((a.b)->Integer.compare(a, b))
	        Integer i= lst.stream().max((a,b)->Integer.compare(a,b)).get();
	        System.out.println(i);
	}

}
