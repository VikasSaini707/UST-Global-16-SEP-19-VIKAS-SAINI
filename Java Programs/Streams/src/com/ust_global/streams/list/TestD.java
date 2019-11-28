package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(20);
		marks.add(56);
		marks.add(71);
		marks.add(82);
		marks.add(12);
		marks.add(77);
		marks.add(25);
		
		Comparator<Integer> cmp = (m1,m2) -> {
			if(m1>m2)
				return 1;
			else if(m1<m2)
				return -1;
			else
				return 0;
		};
		long studentFailed = marks.stream().filter(i -> i < 40).count();
		
		System.out.println("Students failed :"+studentFailed);
		
		System.out.println("~~~~~~~~~~~~~~~~");
		Integer min = marks.stream().min(cmp).get();
		System.out.println("Min value : "+min);
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		Integer max = marks.stream().max(cmp).get();
		System.out.println("Max  value : "+max);
		
		
		
	}
}
