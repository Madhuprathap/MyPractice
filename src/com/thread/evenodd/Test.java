package com.thread.evenodd;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

	public static final Logger logger = Logger.getLogger("com.thread.evenodd.Test", "log.txt");
	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Count count = new Count(10, 200);
//		EvenObject even = new EvenObject(count);
//		OddObject odd = new OddObject(count);
		
//		even.start();
//		odd.start();
		
//		Class c = Class.forName("Count");
//		Count cc = (Count) c.newInstance();
//		System.out.println(cc.start);
		Object object = new Object();
		OddEventPrintService.i=0;
	 	OddEventPrintService oddEventPrintService = new OddEventPrintService(object);
		Thread oddThread = new Thread(oddEventPrintService , "Odd");
		Thread evenThread = new Thread(oddEventPrintService , "Even");
		oddThread.setPriority(10);
		evenThread.setPriority(1);
		oddThread.start();
		evenThread.start();
		
		logger.log(Level.INFO, "Finished!!");
	}
}
