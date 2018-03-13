package com.threethreads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SharedObject sharedObject = new SharedObject();
		
		Thread t3 = new Thread(new ThirdThread(sharedObject));
		Thread t2 = new Thread(new SecondThread(sharedObject));
		Thread t1 = new Thread(new OneThread(sharedObject));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
