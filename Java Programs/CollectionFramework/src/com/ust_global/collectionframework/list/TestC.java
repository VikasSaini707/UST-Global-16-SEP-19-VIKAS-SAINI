package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(80.8);
		al.add(true);
		al.add("Good evening");
		
		Iterator it = al.iterator();
		
		Object o1 = it.next();
		System.out.println("obj1 = "+o1);
		
		
		for(int i=0;i<4;i++)
		{
			Object o = al.get(i);
			System.out.println(o);
		}
		
		System.out.println("~~~~Iterator~~~~");
		
		ArrayList all = new ArrayList();
		all.add(44);
		all.add(33.55);
		all.add(false);
		all.add("momo");
		
		Iterator ite = all.iterator();
		while(ite.hasNext())
		{
			Object oo = ite.next();
			System.out.println(oo);
		}
		
		System.out.println("Hello");
	}
}
