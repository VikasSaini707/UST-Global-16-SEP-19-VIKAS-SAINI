package com.ust_global.lambdaexpressions;

public class TestMultiply {
	public static void main(String[] args) {
		
		MultiplyInterface multi=(a,b)->a*b;
		int product = multi.multiply(12, 30);
		System.out.println("The product is "+product);
	}
}
