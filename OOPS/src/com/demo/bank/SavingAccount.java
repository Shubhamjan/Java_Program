package com.demo.bank;

public class SavingAccount extends BankAccount{
	
	private int interestRate;
//	private long accountNumber;
//	private double balance;
	public SavingAccount() {
		super();
	}

	
	
	public SavingAccount(int interestRate, long accountNumber, double balance) {
		super(accountNumber,balance);
		this.interestRate = interestRate;
//		this.accountNumber = accountNumber;
//		this.balance = balance;
	}



	public double calculateInterest() {
		double interest=(balance*this.interestRate*1)/100;
		return interest;
	}
	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + "]";
	}
	
	
}
