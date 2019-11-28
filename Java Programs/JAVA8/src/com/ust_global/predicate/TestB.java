package com.ust_global.predicate;

import java.util.function.Predicate;

public class TestB {
	
	public static void main(String[] args) {
		
		Predicate<Employee> p = (s)->{
			if(s.salary>20000)
				return true;
			else
				return false;
		};
		
		Employee e = new Employee(10, "Raghu", 12000);
		boolean b = p.test(e);
		System.out.println("Salary is greater than 20000 :"+b);
	}
}
