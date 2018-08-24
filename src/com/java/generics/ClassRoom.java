package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom<E> {
	E roomNo;

	public E getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(E roomNo) {
		this.roomNo = roomNo;
	}
	
	
	public <T extends Number,K> T getFastest(List<T> list, K value) {
		E number = (E) new String("2");
		System.out.println(number);
		System.out.println(new Integer(new String("2")));
		return list.get(0); 
		
	}
	
	public <T> ArrayList<T> withOutArgs() {
		
		 return new ArrayList<T>();

	}
	
	public <T> void withOutArgs2() {
		ArrayList<T> t = new ArrayList<T>();
		t.add((T) new String());
//		T tt =  new T();
		System.out.println(t.getClass());
	}
	
	public void getFastester(List<?> list) {
		
		
	}
	
	public <T extends Number> List<T> generics() {
		return new ArrayList<T>();
		
	}
	
	public <T,Y extends T> List<Y> generics2() {
		return new ArrayList<Y>();
		
	}
	
	public <T> void generic3(List<? extends T> list) {

	}
}
