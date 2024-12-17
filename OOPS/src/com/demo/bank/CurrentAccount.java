package com.demo.bank;

public class CurrentAccount extends BankAccount{
	 private double overdraftLimit;

	public CurrentAccount(long accountNumber,double balance,double overdraftLimit) {
		super(accountNumber,balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount + " | New Balance: Rs" + balance);
        } else {
            System.out.println("Overdraft limit exceeded or invalid withdrawal amount!");
        }
    }
}
