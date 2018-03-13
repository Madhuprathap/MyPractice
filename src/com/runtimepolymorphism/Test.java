package com.runtimepolymorphism;

import java.util.ArrayList;
import java.util.List;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base base = new Derived();//Upcast, can only call methods from interface Base
		//Run time polymorphism, overwritten method of object created gets called, here derived calls methods.
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
		
	}

}
