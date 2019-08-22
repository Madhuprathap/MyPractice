package com.joinThread;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Timestamp heartbeatTime = new Timestamp(new java.util.Date().getTime());
		System.out.println(heartbeatTime);
		
		/*Thread t1 = new Thread(new OneThread());
		t1.setPriority(1);
		t1.setDaemon(false);
		t1.start();
//		You have three threads T1, T2, and T3, How do you ensure that they finish in order T1, T2, T3 ?
//		You can do this by using join method, by calling T1.join() from T2 and T2.join() from T3. In this case thread, T1 will finish first, followed by T2 and T3
//		The current thread, which calls join method will wait until the thread on which join has called die or wait at most specified millisecond for this thread to die.
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("in main: "+ i);
		}*/
		System.out.println(Test.class.getClassLoader());
		
		Class.forName("com.sun.deploy.uitoolkit.impl.fx.AppletStageManager", true 
                ,  Test.class.getClassLoader().getParent());
		System.out.println(AppletStageManager.class.getClassLoader());
		
		// child class loader knows if parent loads the class reverse is not true
		Class.forName("com.sun.deploy.uitoolkit.impl.fx.AppletStageManager", true 
                ,  Test.class.getClassLoader());
		System.out.println("Child load try " + AppletStageManager.class.getClassLoader());
		
		Class.forName("java.lang.String", true 
                ,  Test.class.getClassLoader());
		System.out.println("Child load try " + String.class.getClassLoader());
		
		Class.forName("com.joinThread.CallableTest", true 
                 ,  Test.class.getClassLoader());
		
		System.out.println("normal " + Test.class.getClassLoader());
		// try same class to load with parent
		// parent does not class loaded by child
		Class.forName("com.joinThread.CallableTest", true 
                 ,  Test.class.getClassLoader().getParent());
	}
}
