package com.ust_global.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByNames sn = new SortByNames();
		TreeSet<Customer> ts = new TreeSet<>(sn);
		Customer c1 = new Customer("Manohar", 6, 5600.23);
		Customer c2 = new Customer("Ashu", 2, 6000.63);
		Customer c3 = new Customer("Juile", 9, 9600.96);
		Customer c4 = new Customer("Momo", 3, 2200.00);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("~~~ Using Iterator ~~~");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext())
		{
			Customer b = it.next();
			System.out.println("Name is :"+b.name);
			System.out.println("ID is :"+b.id);
			System.out.println("Salary is :"+b.salary);
			System.out.println("~~~~~~~~~~~~~~~~~~");
					
		}
	}
}
