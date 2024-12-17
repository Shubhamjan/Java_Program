package com.demo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

   public static void sort(int []a) {

       int temp;

 
//       for(int i=0;i<a.length-1;i++){
//                 for(int j=i;j<a.length-i-1;j++){
//                         if(a[j]>a[j+1]){
//                                temp=a[j];
//                                a[j]=a[j+1];
//                                a[j+1]=temp;
//                         } 
//                 }
//          }
       List<Integer>lst=new ArrayList<>();
       for(int i:a) {
    	   lst.add(i);
       }
       Collections.sort(lst);
       for(int i=0;i<lst.size();i++) {
    	   a[i]=lst.get(i);
       }

//        return a;

   }

   public static void print(int []a) {

       for(int i=0;i<a.length;i++) {

           System.out.printf("%4d",a[i]);

       }

   }

   public static void main(String[] args) {

       int [] a = {565,454,67,2,65,35,567,23};

       //Arrays.sort(a);

       //System.out.println(Arrays.toString(a));

       sort(a);

       print(a);

   }

}