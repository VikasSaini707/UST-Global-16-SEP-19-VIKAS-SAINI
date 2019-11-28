package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(20);
		marks.add(56);
		marks.add(71);
		marks.add(82);
		marks.add(12);
		marks.add(77);
		marks.add(25);

		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	
	
	}
}
