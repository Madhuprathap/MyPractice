package com.threading;

public class Producer extends Thread{

	int i = 0;
	
	private void printI() {
		while (i < 10) {
			i = i + 1;
			System.out.println(i);
		}
	}
	
	@Override
	public void run() {
		printI();
	}
}
