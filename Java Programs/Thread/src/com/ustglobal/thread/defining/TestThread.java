package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyThread m = new MyThread();
		
/*		m.run();   we should not call run method , because it will 
				   behaves like normal program rather than thread
		*/
		m.start();
//		m.start();  IllegalThreadStateException
		for(int i =0 ;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
		System.out.println("Main ended");
	}
}
