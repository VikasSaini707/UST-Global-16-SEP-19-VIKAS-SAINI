package com.ust_global.sorting.map;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 9999999);
		hm.put("mama", 5836247);
		hm.put("sheela", 9874563);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 4563171);
		hm1.put("riya", 6985231);
		hm1.put("kriti", 7896541);
		
		boolean haskey = hm.containsKey("mama");
		System.out.println("Has key "+haskey);
		
		boolean hasValue = hm.containsValue(9874563);
		System.out.println("Has Value "+hasValue);
		
		System.out.println("Before putAll");
		System.out.println(hm);
		hm.putAll(hm1);
		System.out.println("After putAll");
		System.out.println(hm);
		
		System.out.println("Size is "+hm.size());
	
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is empty :"+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
	
	
	
	
	
	}
	
}
