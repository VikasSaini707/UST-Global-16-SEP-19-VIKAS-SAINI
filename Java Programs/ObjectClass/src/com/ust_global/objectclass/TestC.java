package com.ust_global.objectclass;

public class TestC {
	public static void main(String[] args) {
		Car c1=new Car(600000,"Audi","Black");
		Car c2=new Car(700000,"Lambo","White");
		Car c3=new Car(800000,"Toyota","Blue");
		
		int h1=c1.hashCode();
		System.out.println("Cost is "+h1);
		
		int h2=c2.hashCode();
		System.out.println("Cost is "+h2);
		
		int h3=c3.hashCode();
		System.out.println("Cost is "+h3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
