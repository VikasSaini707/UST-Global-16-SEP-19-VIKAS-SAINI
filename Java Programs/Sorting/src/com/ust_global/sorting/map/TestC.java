package com.ust_global.sorting.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560076);
		lh.put("Haryana", 134203);
		lh.put("Patna", 880000);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();
		
		for (String key : s) {
			System.out.println("Key :"+key);
		}
		
		System.out.println("=====================");
		
		Collection<Integer> c =lh.values();
		for (Integer val : c) {
			System.out.println("Values : "+val);
		}
		
		System.out.println("======================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
