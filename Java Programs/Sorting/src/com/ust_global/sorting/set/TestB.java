package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestB {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add(12);
		lhs.add(12.63);
		lhs.add("Momo");
		lhs.add('A');
		lhs.add(12.63);
		lhs.add(null);
		
		System.out.println("~~~ Using for each ~~~");
		for (Object ob : lhs) {
			System.out.println(ob);
		}
		
		System.out.println("~~~ Using Iterator ~~~");
		Iterator<Object> it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
