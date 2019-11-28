package com.ust_global.lambdaexpressions;

public class TestFactorial {
	public static void main(String[] args) {
		
		FactorialInterface fi=(x)->{
			int fact =1;
			while(x>0)
			{
				fact=fact*x;
				x--;
			}
			return fact;
		};
		
		int fact = fi.factorial(5);
		System.out.println("factorial is "+fact);
	}
}
