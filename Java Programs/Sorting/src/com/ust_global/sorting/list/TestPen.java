package com.ust_global.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPen {
	public static void main(String[] args) {
		
		LinkedList<Pen> li = new LinkedList<>();
		Pen p1 = new Pen(18.99, "Rotomac"	, "Blue");
		Pen p2 = new Pen(12.00, "Cello"		, "Black");
		Pen p3 = new Pen(20.99, "Reynolds"	, "Red");
		Pen p4 = new Pen(15.96, "Pilot"		, "Green");
		Pen p5 = new Pen(25.63, "Flair"		, "Orange");
		
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		li.add(p5);
		
		System.out.println("Before sorting ====>");
		displayPenDetails(li);
		System.out.println();
		System.out.println("After sorting ====>");
		SortByPrice sp = new SortByPrice();
		SortByColor sc = new SortByColor();
//		Collections.sort(li,sp);
		Collections.sort(li, sc);
		displayPenDetails(li);

	}
	
	static void displayPenDetails(LinkedList<Pen> li)
	{
		Iterator<Pen> it = li.iterator();
		while(it.hasNext())
		{
			Pen p = it.next();
			System.out.println("Brand of pen :"+p.brand);
			System.out.println("Price is : "+p.price);
			System.out.println("Color of pen is :"+p.color);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
}
