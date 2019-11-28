package com.ust_global.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		
		LinkedList li =  new LinkedList();
		li.add(2);
		li.add(12.2);
		li.add("Doongs");
		li.add(true);
		li.add(null);
		
		System.out.println("~~~~Using For loop~~~~");
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));	
		}
		
		System.out.println("~~~~Using For each loop~~~~");
		for (Object ob : li) {
			System.out.println(ob);
		}
		
		System.out.println("~~~~Using Iterator~~~~");
		Iterator it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("~~~~Using List Iterator~~~~");
		ListIterator lit = li.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("~~~~Using hasPervious~~~~");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		
		
		
		
	}
}
