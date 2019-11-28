package com.ust_global.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Shreya");
		Object o = al.get(0);
		String s =(String)o;
		String st = s.toUpperCase();
		System.out.println(st);
	}
}
