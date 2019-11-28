package com.ust_global.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student(161, "Ankita",45.95);
		Student s2 = new Student(142, "Hritik", 98.60);
		Student s3 = new Student(193, "Tiger", 84.52);
		Student s4 = new Student(104, "Minu", 65.34);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		displayStudentDetails(al);
		Collections.sort(al);
		
		System.out.println("~~~~~After sorting~~~~~");
		displayStudentDetails(al);
	}
	
	static void displayStudentDetails(ArrayList<Student> al)
	{
		Iterator<Student> it =  al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("~~~~~~~~~~~~~~~");
		}
	}
}
