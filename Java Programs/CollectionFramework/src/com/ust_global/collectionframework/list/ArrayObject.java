package com.ust_global.collectionframework.list;

public class ArrayObject {
	public static void main(String[] args) {
		
		Object arr[] = {12.3,44,"Hello",true,78.54f,null,'A'};
		
		System.out.println("~~~ for loop ~~~~~~~~");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("~~~ for each loop ~~~~");
		
		for(Object o : arr)
		{
			System.out.println(o);
		}
	}
}
