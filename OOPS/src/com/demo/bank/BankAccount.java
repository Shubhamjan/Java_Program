package com.demo.bank;

public class BankAccount {
	
	protected long accountNumber;
	
	protected double balance;
	
	public void depositMoney(double money) {
		this.balance=this.balance+money;
	}
	
	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void withDrawMoney(double money) {
		if(money>this.balance) {
			System.out.println("Insufficient balance"); 
		}else {
			this.balance=this.balance-money;
			System.out.println("Rs."+money+" is withdraw ");
		}
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
