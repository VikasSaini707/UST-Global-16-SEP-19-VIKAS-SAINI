package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		LinkedHashSet<Double> lhs = new LinkedHashSet<>();
		lhs.add(12.12);
		lhs.add(10.63);
		lhs.add(56.36);
		lhs.add(9.33);
		lhs.add(20.96);
		lhs.add(96.63);
		lhs.add(9.33);

		System.out.println("~~~ Using for each ~~~");
		for (Object ob : lhs) {
			System.out.println(ob);
		}

		System.out.println("~~~ Using Iterator ~~~");
		Iterator<Double> it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}


