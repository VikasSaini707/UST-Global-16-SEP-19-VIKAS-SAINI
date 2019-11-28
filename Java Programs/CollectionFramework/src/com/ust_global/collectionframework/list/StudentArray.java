package com.ust_global.collectionframework.list;

public class StudentArray {
	
	String name;
	int rollno;
	double percentage;
	public StudentArray(String name, int rollno, double percentage) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentArray [name=" + name + ", rollno=" + rollno + ", percentage=" + percentage + "]";
	}
	
	
}
