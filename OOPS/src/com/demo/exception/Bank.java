package com.demo.exception;

public class Bank {
	
	private int balance;
	
	public Bank(int balance) {
		super();
		this.balance = balance;
	}

	public Bank() {
		super();
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amt) {
		try {
			if(amt>this.balance) {
				throw new InvalidBalanceException("No balance");
			}else {
				this.balance=this.balance-amt;
				System.out.println("Money deposited");
			}
		}catch(InvalidBalanceException e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Override
	public String toString() {
		return "Bank [balance=" + balance + "]";
	}

	
	
}
