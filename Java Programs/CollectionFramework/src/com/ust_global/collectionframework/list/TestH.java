package com.ust_global.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(234);
		v.add("nono");
		v.add(23.88);
		v.add(false);
		v.add(null);
		
		
		System.out.println("~~~~Using For loop~~~~");
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));	
		}
		
		System.out.println("~~~~Using For each loop~~~~");
		for (Object ob : v) {
			System.out.println(ob);
		}
		
		System.out.println("~~~~Using Iterator~~~~");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("~~~~Using List Iterator~~~~");
		ListIterator lit = v.listIterator();
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
