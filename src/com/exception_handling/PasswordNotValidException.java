package com.exception_handling;

public class PasswordNotValidException extends RuntimeException{

	public PasswordNotValidException(String msg) {
		super(msg);
	}
}
