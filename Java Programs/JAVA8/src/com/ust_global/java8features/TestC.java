package com.ust_global.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		int res = f.apply(5);
		System.out.println("Square of 5 is "+res);
		
		int res2 = f.apply(9);
		System.out.println("Square of 9 is "+res2 );
		
	}
}
