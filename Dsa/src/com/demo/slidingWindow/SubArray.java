package com.demo.slidingWindow;
import java.util.*;
public class SubArray {
	public static void main(String[]args) {
		int[]kiran= {2,3,1,4,6,7,6,4};
		List<Integer>lst=new ArrayList<>();
		int size =3;
		int front=0;
		int ctr=0;
		int rear=front+2;
		for(int i=0;i<kiran.length;i++) {
			if(rear==kiran.length) {
				break;
			}
			ctr++;
			lst.add(sumArray(kiran,front,rear));
			front++;
			rear++;
		}
		Collections.sort(lst);
		System.out.println(lst.get(lst.size()-1));
	}
	public static int sumArray(int[]kiran,int front,int rear) {
		int sum=0;
		for(int i=front;i<=rear;i++) {
			sum=sum+kiran[i];
		}
		return sum;
				
	}
}
