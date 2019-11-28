package com.ust_global.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums= new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("====================");
		boolean b[] = {true,false,false,true,true};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("==========for each==========");
		for (boolean c : b) {
			System.out.println(c);
		}
		
		System.out.println("====================");
		double d[] = {3.4,6.55,87.55,88.22,54.88};
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("========for each============");
		for (double e : d) {
			System.out.println(e);
		}
	}
}
