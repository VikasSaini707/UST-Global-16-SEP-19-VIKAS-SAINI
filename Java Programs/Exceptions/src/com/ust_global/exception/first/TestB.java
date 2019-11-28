package com.ust_global.exception.first;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Main Started");
			
		int a=10;
		int b=0;
		try {
			b=10/2;
			System.out.println(b);
			System.out.println("Good morning");
			System.out.println("Happy Diwali");
		}catch (ArithmeticException e) {
			System.out.println("number can not be divided by zero");
		}
		
		System.out.println("Main ended");
	}
	
}
