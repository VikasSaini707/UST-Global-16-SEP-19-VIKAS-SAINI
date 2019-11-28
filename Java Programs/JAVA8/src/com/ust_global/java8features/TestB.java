package com.ust_global.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Predicate<Student> p = (s) -> {
			if(s.percentage >= 35)
				return true;
			else
				return false;
		};
		
		Student s = new Student(1, "Rony", 75.63);
		boolean res = p.test(s);
		System.out.println("Passed : "+res);
	
	
	
	
	}
}
