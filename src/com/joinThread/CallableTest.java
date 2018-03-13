package com.joinThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class CallableTest implements Callable<String>, Runnable{

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Thread t = new Thread(new CallableTest());
		t.start();
		
		FutureTask<String> future = new FutureTask<String>(new CallableTest());
		future.run();
		while (true) {
			if (future.isDone()) {
				System.out.println("out" + future.get().toString());
				break;
			}
		}
		
	}

	@Override
	public void run() {
		/*synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("run");
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(100);
		System.out.println("call");
		return "Madhu";
	}

}
