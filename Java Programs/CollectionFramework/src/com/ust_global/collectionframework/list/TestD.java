package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.99);
		al.add("yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
		System.out.println("====Forward=====>");
		while(li.hasNext())
		{
			Object oo= li.next();
			System.out.println(oo);
		}
		System.out.println("<====Backward====");
		while(li.hasPrevious())
		{
			Object o = li.previous();
			System.out.println(o);
		}
	}
}
