package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(56);
		al.add(7);
		al.add(82);
		al.add(12);
		al.add(77);
		al.add(25);
		
		List<Integer> l = al.stream().map(i -> i+50).collect(Collectors.toList());
		
		for (Integer i : l) {
			System.out.println(i);
		}
	}
}
