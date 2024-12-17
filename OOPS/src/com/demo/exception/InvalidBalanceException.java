package com.demo.exception;

public class InvalidBalanceException extends Exception {
	
//	String message;
	public InvalidBalanceException(String message) {
		super(message);
	}
}
