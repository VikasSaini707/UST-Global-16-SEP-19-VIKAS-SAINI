package com.ust_global.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		Comparator<Employee> comp = (e1,e2)->{
			return e1.name.toLowerCase().compareTo(e2.name.toLowerCase());
		};

		TreeSet<Employee> ts = new TreeSet<>(comp);
		
		Employee e1 = new Employee(4, "Nikki", 5.06);
		Employee e2 = new Employee(1, "Binnie", 6.02);
		Employee e3 = new Employee(7, "Marisa", 5.04);
		Employee e4 = new Employee(2, "Vini", 5.11);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("~~~ Using Iterator ~~~");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
