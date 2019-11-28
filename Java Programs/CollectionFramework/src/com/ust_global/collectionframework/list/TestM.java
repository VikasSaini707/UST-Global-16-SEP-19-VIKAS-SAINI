package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Sarah");
		al.add("Brie");
		al.add("Lizzie");
		al.add("Scarlett");
		
		System.out.println(al);
		System.out.println();
		System.out.println("After Sorting");
		Collections.sort(al);
		System.out.println(al);
	}
}
