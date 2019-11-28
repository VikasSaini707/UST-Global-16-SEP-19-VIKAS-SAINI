package com.ust_global.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		System.out.println("HashCode of Pen Object is "+p.hashCode());
		
		Pen s= new Pen();
		System.out.println("HashCode of Pen Object is "+s.hashCode());
		
		String s1 = p.toString();
		System.out.println(s1);
		System.out.println(p);
	}
}
