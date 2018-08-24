package com.reentrantlocking;

import java.util.concurrent.locks.ReentrantLock;

public class SharedService implements Runnable{
	//Gives thread safety
	//Here this class is the shared class/shared object.
	
	//Locking is on instance object level.
	private ReentrantLock lock = new ReentrantLock(true);
	
	//Locking is on class object level.
	//private static ReentrantLock lock = new ReentrantLock(true);
	static volatile int i = 0;
	
	@Override
	public void run() {
		//Inside, it create a new lock on every method call time, so it is not thread safety as 
		//on each call it tries to get its own lock and its as it was never locked already.
		//ReentrantLock lock = new ReentrantLock(true);
		while (true) {
			lock.lock();
			try {
				System.out.println(Thread.currentThread().getName() + " --- "+ i++);
				Thread.sleep(10000);
				testMethodLayerLock();
				System.out.println(Thread.currentThread().getName() + "--- End");
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				lock.unlock();
			}
		}
	}

	public void testMethodLayerLock() {
		//with same current thread will not go to wait state, simply returns true by increasing hold count
		lock.lock();
		try{
			System.out.println(Thread.currentThread().getName() + "--- testMethodLayerLock");
		} finally {
			lock.unlock();
		}
		
	}
	
	public void normalMethod() {
		System.out.println(Thread.currentThread().getName() + "--- normalMethod");
		
	}
	
}
