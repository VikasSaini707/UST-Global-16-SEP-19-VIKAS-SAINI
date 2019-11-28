package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Vini");
		al.add("Savita");
		al.add("Kavita");
		al.add("Babita");
		
		String s = al.get(0);
		System.out.println(s.toUpperCase());
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("+++++List iterator++++++");
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("++++Using for each++++");
		
		for (String st : al) {
			System.out.println(st);
		}
		
		
		
	}
}
