package com.demo.t2;

public class Valid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="234Adas";
//		int ctr=0;
		boolean flag =true;
        for(int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i))){
                flag=true;
               }
            if(Character.isDigit(word.charAt(i))){
              flag=true;
            }
            if((word.charAt(i)=='a' ||word.charAt(i)=='e' ||word.charAt(i)=='i' ||word.charAt(i)=='o' ||word.charAt(i)=='u')||(word.charAt(i)=='A' ||word.charAt(i)=='E' ||word.charAt(i)=='I' ||word.charAt(i)=='O' ||word.charAt(i)=='U')){
               flag=true;
            }
            if(word.charAt(i)=='$' || word.charAt(i)=='#'||word.charAt(i)=='@'){
                flag=false;
                break;
            }
            
        }
        if(flag){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
	}

}