package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.List;



public class TestK {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<>();
		al.add(65.36);
		al.add(78.25);
		al.add(89.25);
		al.add(12.36);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println();
		
		al.add(2, 58.96);
		System.out.println("After adding to 2nd index ");
		System.out.println(al);
		
		System.out.println();
		al.add(0, 11.10);
		System.out.println("After adding to 0th index ");
		System.out.println(al);
		
		System.out.println();
		al.remove(0);
		System.out.println("After removing 0th index");
		System.out.println(al);
		
		System.out.println();
		al.remove(null);
		System.out.println("After removing null");
		System.out.println(al);
		
		System.out.println();
		double val = al.get(4);
		System.out.println("Object at 4th index : " +val);
		
		System.out.println();
		al.set(1, 22.33);
		System.out.println("After replacing 1st index");
		System.out.println(al);
		
		al.clear();
		System.out.println();
		System.out.println("After clear() method");
		System.out.println(al);
		
		System.out.println();
		al.contains(78.69);
		
		
		List<Double> ali = new ArrayList<>();
		ali.add(12.3);
		ali.add(23.4);
		ali.add(34.5);
		ali.add(45.6);
		
		al.addAll(ali);
		System.out.println("New Array List");
		System.out.println(ali);
		System.out.println(al);
		
		System.out.println();
		boolean contains = ali.contains(34.5);
		System.out.println("Contains 34.5 : "+contains);
		
		System.out.println();
		boolean containall = al.containsAll(ali);
		System.out.println("List Contains ali : "+containall);
		
		System.out.println();
		System.out.println("Before removeAll() method");
		System.out.println(al);
		boolean remove = al.removeAll(al);
		System.out.println("After removeAll() ");
		System.out.println(al);
		
		
		
		
		
		
		
		
	}
}
