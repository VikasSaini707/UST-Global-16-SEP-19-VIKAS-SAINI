package com.ust_global.sorting.map;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(101, "Ajay");
		ht.put(92, "Mina");
		ht.put(103, "Momo");
		ht.put(84, "Monu");
		ht.put(101, "saini");
		ht.put(55, "Shinu");
		ht.put(12, "Rony");
//		ht.put(null, "billi");  Null pointer  Exception
//		ht.put(108, null);    Null Pointer Exception
		System.out.println("Data : "+ht);
		
		
		
		
	}
}
