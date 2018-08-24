package com.generics;

import java.util.List;

public class Box <T> { 
	private T value; 
	public Box( T t) { 
		value = t; 
	} 
	public void add(List<? extends T> value) {
		// TODO Auto-generated method stub
	}
	
	public <E> void add1(List<? extends E> value) {
		// TODO Auto-generated method stub
	}
	
	public void addSuper(List<? super T> value) {
		// TODO Auto-generated method stub
	}
	
	public <E> void addSuper1(List<? super E> value) {
		// TODO Auto-generated method stub
	}
	
	//Use of Multiple Bounds
	// T extend one Class & multiple interface...
	public static <T extends Number & Comparable<? super T>> int compareNumbers(T t1, T t2) {
		return 0;
	}
	// Can not extends multiple class
	public static <T extends String & Number > int compareNumbers1(T t1, T t2) {// does not work..
		return 0;
	}
	// Can not extends class after interface
	public static <T extends Comparable<? super T> & Number > int compareNumbers2(T t1, T t2) {// does not work..
		return 0;
	}
	// Can extends multiple interfaces
	public static <T extends CharSequence & Comparable<T>> int compareNumbers3(T t1, T t2) {
		return 0;
	}
}
