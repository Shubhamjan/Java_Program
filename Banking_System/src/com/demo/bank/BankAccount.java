package com.demo.bank;

import java.util.Date;

public class BankAccount {
	private Long accountNo;
	
	private String holderName;
	
	private String address;
	
	private Date dateOfCreate;
	
	private Double balance;

	public BankAccount() {
		super();
	}

	public BankAccount(Long accountNo, String holderName, String address, Date dateOfCreate, Double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.address = address;
		this.dateOfCreate = dateOfCreate;
		this.balance = balance;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfCreate() {
		return dateOfCreate;
	}

	public void setDateOfCreate(Date dateOfCreate) {
		this.dateOfCreate = dateOfCreate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", holderName=" + holderName + ", address=" + address
				+ ", dateOfCreate=" + dateOfCreate + ", balance=" + balance + "]";
	}
	
	
	
	
}
