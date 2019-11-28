package com.ust_global.collectionframework.list;

public class TestStudentArray {
	public static void main(String[] args) {
		
		StudentArray arr[] = new StudentArray[5];
		
		arr[0] = new StudentArray("Rohan", 1, 78.96);
		arr[1] = new StudentArray("Mohan", 5, 89.52);
		arr[2] = new StudentArray("Sohan", 2, 52.63);
		arr[3] = new StudentArray("Milan", 6, 66.55);
		arr[4] = new StudentArray("Suman", 7, 82.41);
		
		System.out.println("~~~~ for Loop ~~~~");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Name is "+arr[i].name +" and rollno is "+arr[i].rollno+" and percentage is "+arr[i].percentage);
		}
		
		System.out.println("");
		
		System.out.println("~~ for each Loop ~~");
		
		for (StudentArray st : arr) {
			System.out.println(st);
		}
	}
}
