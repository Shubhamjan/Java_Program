package com.demo.bank;

public class TestBank {
	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount(10,1123,1000);
		System.out.println("The interest would be :-"+sa.calculateInterest());
		
		CurrentAccount ca=new CurrentAccount(1234,1500,100);
		ca.withdraw(500);
	}
}
