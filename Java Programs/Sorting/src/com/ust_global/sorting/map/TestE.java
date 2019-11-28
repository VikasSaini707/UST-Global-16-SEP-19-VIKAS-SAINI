package com.ust_global.sorting.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<>();
		lh.put("Bangalore", 560076);
		lh.put("Haryana", 134203);
		lh.put("Patna", 880000);
		
		for(Map.Entry<String, Integer> m : lh.entrySet())
		{
			String key  = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key+" ---"+" value is "+value);
		}
		
		
	}
}
