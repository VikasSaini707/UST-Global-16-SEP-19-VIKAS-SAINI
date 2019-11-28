package com.ust_global.java8features;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
		
		Consumer<Student> c = s ->{
			System.out.println("Id is "+s.id );
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		};
		
		Student s  = new Student(6, "divi", 85.20);
		c.accept(s);
		
	}
}
