package com.ust_global.exception.customisedUncheckedException;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Validator v = new Validator();
		try {
			v.verify(2);
		} catch (InvalidAgeException e) {
			System.out.println("exception occured");
		}
		
		v.verify(17);
		
		System.out.println("Main ended");
	}
}
