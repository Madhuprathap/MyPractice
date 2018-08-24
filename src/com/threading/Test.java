package com.threading;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new RecursiveSyncThread());
		t1.start();
		synchronized(Test.class){
			System.out.println("in Main");
		}
	}

}
