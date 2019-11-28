package com.ust_global.sorting.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 9999999);
		hm.put("mama", 5836247);
		hm.put("sheela", 9874563);
		hm.put(null, 2365478);
		hm.put(null, 7896641);
		
		System.out.println("Data  :"+hm);
		hm.put("mama", 654123);
		System.out.println("After modify "+hm);
		
		hm.put("dimple", 9999999);
		System.out.println("After dimple "+hm);
		
		Object name = hm.get("sheela");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("Value "+name);
		
		Object name1 = hm.get("sela");
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("Value "+name1);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("Before removing "+hm);
		Object value = hm.remove("kuku");
		System.out.println("Value "+value);
		System.out.println("After removing kuku "+hm);
		
	}
}
