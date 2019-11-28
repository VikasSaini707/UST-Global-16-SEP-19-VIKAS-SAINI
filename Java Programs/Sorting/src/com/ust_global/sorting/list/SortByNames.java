package com.ust_global.sorting.list;

import java.util.Comparator;

public class SortByNames implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		String s = o1.name;
		String s2 = o2.name;
		
		return s.compareTo(s2);
	}

}
