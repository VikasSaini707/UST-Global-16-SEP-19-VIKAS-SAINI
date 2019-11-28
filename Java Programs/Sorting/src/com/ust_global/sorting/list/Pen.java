package com.ust_global.sorting.list;

public class Pen implements Comparable<Pen>{
	double price;
	String brand;
	String color;
	public Pen(double price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
//	@Override
//	public int compareTo(Pen p) {
//		Double a = this.price;
//		Double b = p.price;
//		return a.compareTo(b);
//	}
	
//	@Override
//	public int compareTo(Pen p) {
//		String a = this.brand.toLowerCase();
//		String b = p.brand.toLowerCase();
//		return a.compareTo(b);
//	}
	
	@Override
	public int compareTo(Pen p) {
		String a = this.color.toLowerCase();
		String b = p.color.toLowerCase();
		return a.compareTo(b);
	}
	
}
