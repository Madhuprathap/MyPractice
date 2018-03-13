package com.joinThread;

import com.threading.Test;

public class OneThread implements Runnable{

	@Override
	synchronized public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("One thread: " + i);
		}

	}
	
	public void printInfo() {
		synchronized(Test.class){
			System.out.println("in Main");
		}
	}

}
