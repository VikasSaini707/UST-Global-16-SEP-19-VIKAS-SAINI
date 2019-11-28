package com.ust_global.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(29.4);
		al.add(true);
		al.add("Divya");
		
		for(Object o : al)
		{
			System.out.println(o);
		}
		
	}
}
