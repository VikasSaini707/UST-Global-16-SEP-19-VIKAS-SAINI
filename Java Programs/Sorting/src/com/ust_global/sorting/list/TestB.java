package com.ust_global.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		
		LinkedList<Laptop> li = new LinkedList<>();
		Laptop l1= new Laptop(40000.99, 8, "Dell");
		Laptop l2= new Laptop(35000.89, 4, "HP");
		Laptop l3= new Laptop(65000.99, 16, "Sony");
		Laptop l4= new Laptop(30000.79, 8, "Asus");
		
		li.add(l1);
		li.add(l2);
		li.add(l3);
		li.add(l4);
		
		displayLaptopDetails(li);
		
		System.out.println("=====After sorting======");
		Collections.sort(li);
		displayLaptopDetails(li);
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> li)
	{
		Iterator<Laptop> it = li.iterator();
		while(it.hasNext())
		{
			Laptop l = it.next();
			System.out.println("Brand is "+l.name);
			System.out.println("Price is "+l.price);
			System.out.println("RAM is "+l.ram);
			System.out.println("~~~~~~~~~~~~~");
					
			
		}
	}
}
