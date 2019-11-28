package com.ust_global.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.add(2);
		s.add(9);
		s.add(7);
		s.add(3);
		
		System.out.println("Using get()=====");
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		System.out.println();
		int j =s.size();
		System.out.println("Using pop()=====");
		for (int i = 0; i < j; i++) {
			System.out.println(s.pop());
		}
	}
}
