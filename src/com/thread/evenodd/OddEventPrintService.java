package com.thread.evenodd;

public class OddEventPrintService implements Runnable{
	
	Object object;
	volatile static int i=1;
	
	
	public OddEventPrintService(Object object) {
		super();
		this.object = object;
	}


	@Override
	public void run() {
		while (i<30) {
			try{
				if (i%2 == 0 && Thread.currentThread().getName().equals("Even")) {
					synchronized (object) {
						System.out.println(Thread.currentThread().getName() + "-" + i);
						i++;
						object.notify();
						if (i<29) {
							object.wait();
						}
					}
				} else if (i%2 == 1 && Thread.currentThread().getName().equals("Odd")) {
					synchronized (object) {
						System.out.println(Thread.currentThread().getName() + "-" + i);
						i++;
						object.notify();
						if (i<30) {
							object.wait();
						}
					}
				} else {
					synchronized (object) {
						object.notify();
						object.wait();
					}
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}

}
