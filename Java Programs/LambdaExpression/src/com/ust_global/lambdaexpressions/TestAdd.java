package com.ust_global.lambdaexpressions;

public class TestAdd implements AddInterface {
	public static void main(String[] args) 
	{
		TestAdd t1 = new TestAdd();
		int sum = t1.add(12, 15);
		System.out.println("The sum is "+sum);
	}

	@Override
	public int add(int a, int b) {
		
		return a + b;
	}
	
}
