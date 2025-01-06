package com.exceptionhandling.exception;

public class AccountNotFoundException extends Exception {
	private static final long serialVersionUID = -5010582601472584790L;

	public AccountNotFoundException() {
		super();
	}

	public AccountNotFoundException(String message) {
		super(message);
	}

}
