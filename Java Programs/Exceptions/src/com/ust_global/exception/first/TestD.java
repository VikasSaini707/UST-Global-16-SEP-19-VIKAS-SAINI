package com.ust_global.exception.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("main started");

		int[] a= {10,20,30};
		int  b=10;
		try 
		{
			System.out.println(a[4]);
		
		}catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("array index out of bound");
		}
		
		try
		{
			System.out.println(b/0);
		}catch (ArithmeticException e) 
		{
			System.out.println("not divided by zero");
		}
		System.out.println("main ended");
	}
}
