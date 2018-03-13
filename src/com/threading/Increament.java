package com.threading;

public class Increament {

	private static volatile  int i = 0;
	
	public  static synchronized void increament() {
		System.out.println("in incre");
		i = i + 1;
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("increa"+i);
	}
	
	public  void printInt() {
		//System.out.println("in printInt");
		synchronized (Increament.class) {
			System.out.println("in printInt");
			try {
				i = i + 1;
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("printInt "+i);
		}
		
	}
	
	synchronized public void methodBlock() {
		System.out.println("in method Block");
	}
	
}
