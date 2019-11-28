package com.ust_global.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		hs.add(12);
		hs.add(51.25);
		hs.add("Vini");
		hs.add(false);
		hs.add(null);
		hs.add(null);
		hs.add(12);
		
		System.out.println(hs);
		
		System.out.println();
		System.out.println("~~~ Using for each ~~~");
		for (Object ob : hs) {
			System.out.println(ob);
		}
		
		System.out.println();
		System.out.println("~~~ Using iterator ~~~");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
