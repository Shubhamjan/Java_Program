package com.demo.exception;

public class TestBankException {
	public static void main(String[] args) {
		Bank b=new Bank(500);
		b.withdraw(600);
		b.withdraw(400);
		System.out.println(b.getBalance());
}
}
