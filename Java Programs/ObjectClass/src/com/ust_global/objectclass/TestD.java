package com.ust_global.objectclass;

public class TestD {
	public static void main(String[] args) {
		Cow c1 = new Cow(10000, "momo", 12);
		
		Cow c2 = new Cow(20000, "mimi", 10);
		
		Cow c3 = new Cow(10000, "momo", 12);
		
		boolean b = c1.equals(c2);
		System.out.println(b);
		System.out.println(c1.equals(c3));
	}
}
