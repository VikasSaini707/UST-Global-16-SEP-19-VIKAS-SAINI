package com.ust_global.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(22);
		l.add(15);
		l.add(29);
		l.add(10);
		
		Integer peekElement = l.peek();
		System.out.println("Peek element :"+peekElement);
		
		Integer peekFirstElement =l.peekFirst();
		System.out.println("Peek First element :"+peekFirstElement);
		
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek last element :"+peekLastElement);
		
		System.out.println("After peek ------>");
		System.out.println(l);
		
		System.out.println("============================");
		
		Integer pollElement = l.poll();
		System.out.println("Poll Element :"+pollElement);
		Integer pollFirstElement = l.peekFirst();
		System.out.println("Poll First element :"+pollFirstElement);
		Integer pollLAstElement = l.pollLast();
		System.out.println("Poll Last element :"+pollLAstElement);
		System.out.println("After poll ------->");
		System.out.println(l);
		
		System.out.println("============================");
		l.push(45);
		System.out.println("After push --->"+l);
		Integer pop = l.pop();
		System.out.println("Poped element --->"+pop);
		System.out.println("After pop --->"+l);
		
		
		
		
		
		
		
		
	}
}
