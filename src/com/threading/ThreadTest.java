package com.threading;
//all threads run asynchronous
//Main will wait all threads to complete
public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 200; i++) {
					System.out.println("t1 "+ i);
				}
				
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 200; i < 300; i++) {
					System.out.println("t2 "+ i);
				}
			}
		});
		t2.start();
		
		System.out.println("in Main");
//		System.exit(0);
	}

}
