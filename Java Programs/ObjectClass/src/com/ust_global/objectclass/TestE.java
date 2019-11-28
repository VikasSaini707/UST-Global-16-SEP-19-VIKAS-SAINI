package com.ust_global.objectclass;

public class TestE {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Vini", 70000.99);
		
		Employee e2 = new Employee(2, "Moni", 78000.99);
		
		Employee e3 = new Employee(1, "Vini", 70000.99);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
