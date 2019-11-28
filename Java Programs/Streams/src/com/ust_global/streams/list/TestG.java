package com.ust_global.streams.list;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Rama", 98.63));
		al.add(new Student(5, "Vijay", 78.43));
		al.add(new Student(3, "Ajay", 58.63));
		al.add(new Student(4, "Sujay", 62.63));
		al.add(new Student(2, "Titu", 35.65));
	
		Helper h = new Helper();
		//h.displayAllStudent(al);
		//h.displayFailedStudents(al);
		//h.displayPassedStudents(al);
		Student s = h.displayTopper(al);
		System.out.println("Topper is :"+s.name);
	}
}
