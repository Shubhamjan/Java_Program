package com.demo.t2;
import java.util.*;
public class SortByHeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names = {"Mary","John","Emma"};
		int[]heights = {180,165,170};
		Map<Integer,String>map=new TreeMap<>();
        int j=names.length-1;
        String[]r=new String[names.length];
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        for(Map.Entry<Integer,String>i:map.entrySet()){
            r[j]=i.getValue();
            j--;
        }
        System.out.println(map);
        System.out.println(Arrays.toString(r));
	}

}
