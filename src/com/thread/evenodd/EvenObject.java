package com.thread.evenodd;

public class EvenObject extends Thread{
	private Count count;
	
	int ary[] = new int[12];
	int arry[] = new int[] {1,2,3};
	
	public EvenObject(Count count) {
		super();
		this.count = count;
	}
	
	@Override
	public void run() {
		synchronized (count) {
			try{
				while (count.start <= count.end) {
					Thread.sleep(100);
					System.out.println("Even  -" + count.start);
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
