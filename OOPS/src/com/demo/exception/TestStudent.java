package com.demo.exception;

public class TestStudent {
	public static void main(String[] args) {
		try {
			Student st1=new Student(101,"abc",103);
		}catch(InvalidMarkException e) {
			System.out.println(e);
		}
//		st.setMarks(500);
	}
}
