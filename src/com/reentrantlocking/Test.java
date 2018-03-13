package com.reentrantlocking;

public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		SharedService service = new SharedService();
		Thread t1 = new Thread(service);
		Thread t2 = new Thread(service);
		//Static class level locking
		//Thread t1 = new Thread(new SharedService());
		//Thread t2 = new Thread(new SharedService());
		/*t1.setName("T1");
		t1.setPriority(10);
		t2.setName("T2");
		t1.start();
		t2.start();
		Thread.sleep(50);
		service.normalMethod();
		service.testMethodLayerLock();*/
		
		//daemon thread, JVM will wait for non-daemon/userthreads before it exits. if there a daemon thread running also will not wait and gets shutdown after main thread job done
		 Thread daemonThread = new Thread(new Runnable(){
	            @Override
	           public void run(){
	               try{
	               //while(true){
	            	   System.out.println("Daemon thread is running");
	            	   Thread.sleep(100);
	                   System.out.println("Daemon thread is running");
	               //}
	                  
	               }catch(Exception e){
	                  
	               }finally{
	                   System.out.println("Daemon Thread exiting");
	               }
	           }
	       }, "Daemon-Thread");
	      
	       daemonThread.setDaemon(true); //making this thread daemon
	       daemonThread.start();
	       Thread.sleep(10000);
	}

}
