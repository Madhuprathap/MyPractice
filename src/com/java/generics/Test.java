package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book<String> book = new Book<String>();
		book.setValue("String");
		System.out.println(book.getValue());
		
		ClassRoom<Integer> classRoom = new ClassRoom<Integer> ();
		classRoom.setRoomNo(new Integer(12));
		//classRoom.setRoomNo(new String("sd"));
		System.out.println(classRoom.getRoomNo());
		
//		ArrayList<?> list = new ArrayList<String>();
//		list.add(new String("madhu"));
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(new Integer(12));
		System.out.println(classRoom.getFastest(lst, new Float("12")));
		ArrayList<String> stringList = classRoom.withOutArgs();
		stringList.add(new String("123"));
		
//		stringList.add(new Integer("123"));
		
		classRoom.withOutArgs2();
		
		List<String> l = classRoom.generics2();
		
		List<Object> num = new ArrayList<Object>();
		num.add(new String("1"));
		System.out.println(num.get(0));
		
		int x = 5;
		updateX(x);
		System.out.println(x);
		//wrapper class
		Integer y = new Integer(7);
		updatey(y);
		System.out.println(y);
		
		Book<Integer> book1 = new Book<Integer>();
		book1.setValue(10);
		updateBook(book1);
		System.out.println(book1.getValue());
	}

	private static void updateBook(Book<Integer> book1) {
		book1.setValue(book1.getValue()+1);
		System.out.println(book1.getValue());
	}

	private static void updatey(Integer y) {
		//pre increment so gets added value to x
		y = ++y;
		System.out.println(y);
		
	}

	private static void updateX(int x) {
		System.out.println("in UpdateX");
		System.out.println(++x);
		
	}

}
