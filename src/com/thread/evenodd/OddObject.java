package com.thread.evenodd;

public class OddObject extends Thread{
	private Count count;
	
	public OddObject(Count count) {
		super();
		this.count = count;
	}


	@Override
	public void run() {
		/*synchronized (this) {
			
		}*/
		/*synchronized (OddObject.class) {
			
		}*/
		synchronized (count) {
			try{
				while (count.start <= count.end) {
					Thread.sleep(100);
					System.out.println("Odd   -" + count.start);
					count.start = count.start + 1;
					count.notify();
					count.wait();
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		
	}
}
