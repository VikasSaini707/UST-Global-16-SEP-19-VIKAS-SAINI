package com.ust_global.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(66);
		pq.add(45);
		pq.add(33);
		
		System.out.println("~~~ Using Iterator ~~~");
		Iterator it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(pq.poll());
					
		}
		System.out.println("After poll "+pq);
	}
}
