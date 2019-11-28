package com.ust_global.accessmodifiers.pkg1;

import com.ust_global.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Sample d = new Sample();
//		System.out.println(d.a);
//		d.add(); //not possible
		
		//Default
//		System.out.println(d.b);
//		d.sub();
		
		//Protected
		System.out.println(d.c);
		d.mul();
		
		//Public
		System.out.println(d.name);
		d.div();
	}
}
