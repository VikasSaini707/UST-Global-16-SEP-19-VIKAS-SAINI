package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Hema");
		ts.add("Rekha");
		ts.add("Jaya");
		ts.add("Shushma");
		ts.add("Nirma");
		
		System.out.println("~~~ Using for each ~~~");
		for (Object ob : ts) {
			System.out.println(ob);
		}

		System.out.println("~~~ Using Iterator ~~~");
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
