package com.runtimepolymorphism;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import statictest.test;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float f = 45.1f;
		long l = (long) f;
		System.out.println(l);
		
		long l1 = 123132l;
		float f1 = l1;
		System.out.println(f1);
		
		Base base = new Derived();//Upcast, can only call methods from interface Base
		//Run time polymorphism, overwritten method of object created gets called, here derived calls methods.
		((Derived)base).direvedOnlyMethod();
//		Derived derived = (Derived) new Base(); //Downcast, runtimeexception classcastexception
//		derived.direvedOnlyMethod();
		((Derived)base).direvedOnlyMethod();
		Base b = new Base();
//		((Derived)b).direvedOnlyMethod();//Downcast, runtimeexception classcastexception
		
		List<?> ll = new ArrayList<String>();
		ll = new ArrayList<Integer>();
		try {
			Class.forName("com.runtimepolymorphism.Base");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			((Derived)base).update(new User());
		} catch (NullPointerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<String> name = new ArrayList<String>();
		name.add("Madhu");
		name.add("Prathap");
		name.add("Janu");
		System.out.println(" jjk "+name.size());
		name.set(1, "gaddam");
		System.out.println(name.size());
		Iterator<String> it = name.iterator();
		while (it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
		name.add(1, "Test");
		System.out.println(name.size());
		it = name.iterator();
		while (it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
		test(new Integer(1));
		test(1);
		
		System.out.println(new Timestamp(1533640857851L));
	}
	
	public static void test(Object a) {
		System.out.println("test Object");
	}
	
	public static void test(Integer a) {
		System.out.println("test Integer");
	}
	
	public static void test(int a) {
		System.out.println("test int");
	}
	
}
