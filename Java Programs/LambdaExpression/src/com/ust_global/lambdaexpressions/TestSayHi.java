package com.ust_global.lambdaexpressions;

public class TestSayHi {
	public static void main(String[] args) {
		sayHiInterface ss=()->System.out.println("Hi How are you");
		ss.sayHi();
	}
}
