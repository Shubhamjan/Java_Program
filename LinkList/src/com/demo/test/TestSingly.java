package com.demo.test;

import com.demo.bean.SinglyLink;

public class TestSingly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLink l=new SinglyLink();
		l.addAtEnd(52);
		l.addAtEnd(58);
		l.addAtEnd(96);
		l.addAtEnd(100);
//		l.addAtBegin(24);
		l.addByPosition(500, 4);
		l.deleteByPos(3);
		l.show();
	}

}
