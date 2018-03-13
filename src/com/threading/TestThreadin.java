package com.threading;

class TestThreadin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Increament inc = new Increament();
		final Increament inc1 = new Increament();
		System.out.println("start");
	 	Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inc.increament();
				
			}
		});
		t.start();
		
		System.out.println("in main");
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inc.methodBlock();
			}
		});
		t3.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inc1.printInt();
			}
		});
		t2.start();
		
		//object lock and class locks are different means if one thread is running in static sync method/block other thread can be run in non-sync mehtod/block. so dont mix them
		//method/blocks share same locks. class lock for static, object lock for non-static. It does not differentiate b/w methods and blocks
		/*Producer prod = new Producer();
		prod.start();*/
	}

}
