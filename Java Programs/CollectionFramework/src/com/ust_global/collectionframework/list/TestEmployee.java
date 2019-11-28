package com.ust_global.collectionframework.list;

import java.util.ArrayList;

public class TestEmployee {
	public static void main(String[] args) {
	
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(1, "Monu", 5000);
		Employee e2 = new Employee(2, "Sonu", 8000);
		Employee e3 = new Employee(3, "Titu", 4000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Salary is "+e.sal);
			System.out.println("");
		}
	}
	
	
}
