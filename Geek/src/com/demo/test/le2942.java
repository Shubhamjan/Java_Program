package com.demo.test;
import java.util.*;
public class le2942 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []words = {"leet","code"};
		char x = 'e';
		List<Integer>r=new ArrayList<>();
        List<Character>p=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)=='e'){
                    r.add(i);
                    break;
                }
            }
        }
//        return r;
        System.out.println(r);
	}

}
