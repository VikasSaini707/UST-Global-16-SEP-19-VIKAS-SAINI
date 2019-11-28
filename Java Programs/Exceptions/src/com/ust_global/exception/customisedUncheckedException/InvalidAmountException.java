package com.ust_global.exception.customisedUncheckedException;

public class InvalidAmountException extends Exception{

	private String message = "Daily limit is 40,000";

	@Override
	public String getMessage() {
		return message;
	}
}
