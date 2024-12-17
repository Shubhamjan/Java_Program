package com.demo.exception;

public class InvalidMarkException extends RuntimeException{
	
	String message;
	
	public InvalidMarkException() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public InvalidMarkException(String message) {
//		super(message)
		System.out.println("In exception class");
		this.message = message;
	}
	@Override
	public String toString() {
		return "InvalidMarkException [message=" + message + "]";
	}
}
