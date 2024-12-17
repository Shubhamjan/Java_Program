package com.demo.oop;

public class Player_Main {
	public static void main(String[] args) {
		Player p1=new Player(1001,"Rohit Sharma","Cricket");
		Player p2=new Player(1001,"Rohit Sharma","Cricket");
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
