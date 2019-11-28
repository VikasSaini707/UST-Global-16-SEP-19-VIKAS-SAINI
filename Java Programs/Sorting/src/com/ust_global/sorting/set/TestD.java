package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestD {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(12);
		ts.add(65);
		ts.add(58);
		ts.add(10);
		ts.add(15);
//		ts.add("Deepika"); Class Cast Exception
		ts.add(10);
		
		System.out.println("~~~ Using for each ~~~");
		for (Object ob : ts) {
			System.out.println(ob);
		}

		System.out.println("~~~ Using Iterator ~~~");
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
