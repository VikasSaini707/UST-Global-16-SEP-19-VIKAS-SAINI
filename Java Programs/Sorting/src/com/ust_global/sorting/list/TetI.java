package com.ust_global.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TetI {
	public static void main(String[] args) {
		
		SortByName sn = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		TreeSet<Bank> ts =new TreeSet<>(sm);
		Bank b1 = new Bank("HDFC" ,560076, 6764986);
		Bank b2 = new Bank("SBI", 134203, 1234560);
		Bank b3 = new Bank("Citi", 420052, 7894562);
		Bank b4 = new Bank("Canara", 543621, 1258963);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("~~~ Using Iterator ~~~");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext())
		{
			Bank b = it.next();
			System.out.println("Name is :"+b.name);
			System.out.println("Pincode is :"+b.pincode);
			System.out.println("MICR is :"+b.micr);
			System.out.println("~~~~~~~~~~~~~~~~~~");
					
		}
		
		
		
	}
}
