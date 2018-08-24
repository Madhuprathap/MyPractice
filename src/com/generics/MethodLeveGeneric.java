package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.runtimepolymorphism.Base;
import com.runtimepolymorphism.Derived;

class A { }
class B extends A { }
class C extends A { }

public class MethodLeveGeneric<E extends Number, F extends A, G extends String> {
	public static void main(String[] args) {
		String stringElement = "stringElement";
		List<String> stringList = new ArrayList<String>();
		String theElement = addAndReturn(stringElement, stringList);
		System.out.println(theElement);


		Integer integerElement = new Integer(123);
		List<Integer> integerList = new ArrayList<Integer>();
		Integer theElement2 = addAndReturn(integerElement, integerList);  
		System.out.println(theElement2);
//		Compile time error
//		List<Integer> integers = new ArrayList<Number>(); 
//		List<Number> numbers = new ArrayList<Integer>(); 
		
		Base[] deriveds = new Base[10];
		deriveds[0] = new Derived();
		System.out.println(deriveds);
//		compile time error is size not provided
//		List[] list = new ArrayList[];
		List[] list = new ArrayList[10];
		list[0] = new ArrayList();
		System.out.println(list.toString());
	}
	
	public static <T> T addAndReturn(T element, Collection<T> collection){
	    collection.add(element);
	    return element;
	}
	
	public void processElements(List<? extends E> elements){
		for(E o : elements){
			System.out.println(o.intValue());
		}
//		elements.add(new B());
	}
	
	public void processElements2(List<F> elements){
		for(Object o : elements){
			System.out.println(o);
		}
//		elements.add(new B());
	}
	
	public void processElements3(List<? extends A> elements){
		for(A o : elements){
			System.out.println(o);
		}
//		elements.add(new B());
	}
	
	public void insert(List<? super A> elements) {
		elements.add(new A());
		elements.add(new B());
		elements.add(new C());
	}
}
