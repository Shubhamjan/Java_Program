package com.demo.test;
import java.util.*;
public class Winner {
	
	 //Function to return the name of candidate that received maximum votes.
    public static void winner(String arr[], int n)
    {
        // add your code
        Map<String,Integer>set=new HashMap<>();
//        String[]name=new String[];
        String[] name=new String [2];
        String nm="";
        int count = 0;
        for(int i=0;i<arr.length;i++){
//            
            if(!set.containsKey(arr[i])){
                set.put(arr[i],1);
            }else{
                set.put(arr[i],set.get(arr[i])+1);
            }
            
//            if(set.get(arr[i])>count) {
//            	nm=arr[i];
//            	count=set.get(arr[i]);
//            }
        }
        for(Map.Entry<String,Integer>i:set.entrySet()) {
        	if(i.getValue()>count) {
        		nm=i.getKey();
        		count=i.getValue();
        	}
        }
        name[0]=nm;
        name[1]=Integer.toString(count);
        System.out.println(Arrays.toString(name));
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr = {"john","johnny","jackie","johnny","john", 
				"jackie","jamie","jamie","john","johnny","jamie",
				"johnny","john"};
		winner(arr,arr.length);
	}

}
