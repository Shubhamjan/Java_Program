package com.demo.test;

public class Palidrom {
	public static void main(String[] args) {
		int[]a={111,222,234};
//        int sum=0;
               boolean flag=false;
                  //add code here.
                  for(int i=0;i<a.length;i++){
                      int temp=a[i];
                      int sum=0;
                      while(a[i]!=0){
                        int rem=a[i]%10;
                        sum=sum*10+rem;
                        a[i]=a[i]/10;
                      }
                      System.out.println("Temp="+temp+"//"+"sum="+sum);
                      if(temp!=sum){
                          flag=true;
                          break;
                      }
                      
                  }
                  if(flag){
                     System.out.println("1");
                  }
                  else{
                       System.out.println("0");
                  }
	}
}
