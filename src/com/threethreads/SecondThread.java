package com.threethreads;

public class SecondThread implements Runnable{
	
	private int temp[] = {1,2,3,4,5,6,7,8,9,10};
	
	private SharedObject object;
	
	public SecondThread(SharedObject sharedObject) {
		object = sharedObject;
	}

	@Override
	public void run() {
		printTemp();
	}
	
	private void printTemp() {
		synchronized (object) {
			try {
				for (int i = 0; i < temp.length; i++) {
					if (object.i == 1) {
						Thread.sleep(10);
						System.out.println(Thread.currentThread() + " -Second Thread- " + temp[i]);
						object.i = 2;
						object.notifyAll();
						if (i<temp.length-1) {
							object.wait();
						}
					} else {
						object.notifyAll();
						object.wait();
						i--;
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
