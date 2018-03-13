package com.threading;

public class RecursiveSyncThread implements Runnable {
	int i = 0;
	Object object = new Object();
	@Override
	public void run() {
		recusiveSyncThread();
	}
	
	private  void recusiveSyncThread() {
		synchronized (object) {
			i++;
			System.out.println(i);
			if (i<30) {
				recusiveSyncThread();				
			}
		}
	}
	
/*	static int i = 0;
	public static void main(String[] args) {
		//recusiveSyncThread();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				recusiveSyncThread();
			}
		});
		t1.start();
	}

	private static void recusiveSyncThread() {
		synchronized (RecursiveSyncThread.class) {
			i++;
			System.out.println(i);
			if (i<10) {
				recusiveSyncThread();				
			}
		}
	}*/
}
