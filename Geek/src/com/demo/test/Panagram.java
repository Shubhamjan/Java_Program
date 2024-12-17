package com.demo.test;
import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqabusaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
		Set<Character>set=new TreeSet<>();
		
        int sum=0;
        for(int i=0;i<sentence.length();i++) {
        	if(!set.contains(sentence.charAt(i))) {
        		set.add(sentence.charAt(i));
        	}
//        	sum=sum+(int)sentence.charAt(i);
        }
        for(Character i:set) {
        	sum=sum+(int)sentence.charAt(i);
        }
        if(sum<2847) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
        System.out.println(set);
        System.out.println(sum);
        String s="shubham";
//       System.out.println(reverseStri);
	}

}
