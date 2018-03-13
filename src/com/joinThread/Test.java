package com.joinThread;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new OneThread());
		t1.setPriority(1);
		t1.setDaemon(false);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("in main: "+ i);
		}
	}
	

}
