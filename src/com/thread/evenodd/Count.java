package com.thread.evenodd;

public class Count {
	public volatile int start = 0;
	public int end = 100;
	
	public Count(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	

}
