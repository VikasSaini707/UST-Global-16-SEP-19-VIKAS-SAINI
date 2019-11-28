package com.ust_global.lambdaexpressions;

public class TestGreet {
	public static void main(String[] args) {
		Greet g =(message)->{
			System.out.println("hello");
		};
		
		g.greet("hii");
	}
}
