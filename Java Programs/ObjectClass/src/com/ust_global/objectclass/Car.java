package com.ust_global.objectclass;

public class Car {
	int cost;
	String Brand;
	String color;
	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		Brand = brand;
		this.color = color;
	}
	@Override
	public int hashCode()
	{
		return cost;
	}
	
	@Override
	public String toString()
	{
		return "Cost is "+cost+" Brand is "+Brand+" Color  is "+color;
	}
}
