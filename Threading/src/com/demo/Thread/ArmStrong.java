package com.demo.Thread;

public class ArmStrong extends Thread{
	
	public void run() {
		System.out.println("Armstorm no is ");
		for(int i=100;i<=1000;i++) {
			boolean flag=checkArmStrong(i);
			if(flag) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+" ");
			}
		}
	}

	private boolean checkArmStrong(int i) {
		
		int temp=i;
		int sum=0;
		while(i!=0) {
			int rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
		}
		
		if(sum==temp) {
			return true;
		}
		return false;
	}
}
