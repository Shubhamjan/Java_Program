package com.demo.beans;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int ctr=0;
        String str1=a.toLowerCase();
        String str2=b.toLowerCase();
        Map<Character,Integer>count=new TreeMap<>();
        Map<Character,Integer>count2=new TreeMap<>();
        if(str1.length()==str2.length()){
            for(int i=0;i<str2.length();i++){
                if(count.containsKey(str1.charAt(i))){
                    count.put(str1.charAt(i),count.get(str1.charAt(i))+1);
                }else{
                    count.put(str1.charAt(i), 1);
                }
                if(count2.containsKey(str2.charAt(i))){
                    count2.put(str2.charAt(i),count2.get(str2.charAt(i))+1);
                }else{
                    count2.put(str2.charAt(i), 1);
                }
            }
            for(int j=0;j<str1.length();j++){
                if(count.get(j)==count2.get(j)){
                    ctr++;
                }
            }
            if(ctr==str1.length()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
