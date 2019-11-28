package com.ust_global.exception.first;

public class TestF 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		
		Paytm p =new Paytm();
		
		try 
		{
			p.book();
		}catch (ArithmeticException e) 
		{
			System.out.println("Exception caught in main");
		}finally {
			System.out.println("Executing finally");
		}
		

		System.out.println("main ended");
	}
}
