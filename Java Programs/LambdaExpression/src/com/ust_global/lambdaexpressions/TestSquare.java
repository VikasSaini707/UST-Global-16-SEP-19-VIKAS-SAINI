package com.ust_global.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		
		SquareInterface sq =(x)->x*x;
		int squa=sq.square(9);
		System.out.println("Square is "+squa);
	}
}
