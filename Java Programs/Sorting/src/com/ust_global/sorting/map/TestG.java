package com.ust_global.sorting.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(9, "Tony", 9600);
		Employee e2 = new Employee(6, "Steve", 8900);
		Employee e3 = new Employee(8, "Vision", 1100);
		Employee e4 = new Employee(2, "Bruce", 4500);
		Employee e5 = new Employee(4, "Thor", 3600);
		Employee e6 = new Employee(1, "Loki", 2200);
		Employee e7 = new Employee(7, "Wanda", 8800);
		Employee e8 = new Employee(3, "Vers", 6800);
		Employee e9 = new Employee(5, "Scarlett", 7500);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new ArrayList<>();
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);
		
		HashMap<Integer, ArrayList<Employee>> hm = new HashMap<>();
		hm.put(1, al1);
		hm.put(2, al2);
		hm.put(3, al3);
		
		ArrayList<Employee> e = hm.get(1);
		Iterator<Employee> it = e.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println("The name is :"+emp.name);
			System.out.println("The id is :"+emp.id);
			System.out.println("The Salary is "+emp.salary);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			
			
		}
		
		
		
		
		
	}
}
