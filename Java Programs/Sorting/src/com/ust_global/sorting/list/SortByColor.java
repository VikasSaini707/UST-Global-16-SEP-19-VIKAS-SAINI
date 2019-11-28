package com.ust_global.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Pen> {

	@Override
	public int compare(Pen p1, Pen p2) {
		String s1= p1.color;
		String s2= p2.color;
		return s1.compareTo(s2);
		
	}
	
}
