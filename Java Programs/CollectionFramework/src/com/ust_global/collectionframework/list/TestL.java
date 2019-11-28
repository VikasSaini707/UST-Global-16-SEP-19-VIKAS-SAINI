package com.ust_global.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(63);
		l.add(78);
		l.add(7);
		l.add(24);
		System.out.println("Before Sorting");
		System.out.println(l);
		Collections.sort(l);
		System.out.println();
		System.out.println("After Sorting");
		System.out.println(l);
		
		
		Collections.reverse(l);
		System.out.println();
		System.out.println("After Reversing");
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println();
		System.out.println("After Shuffle");
		System.out.println(l);
	}
}
