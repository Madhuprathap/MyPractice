package com.callbyvalueref;

import java.util.Scanner;

//int[] or object[] are call by ref. Because they are created using 'new', so array is call by ref.
//But method(Integer), method(String) , method(int) primitive and wrapper are immutables and not call by ref. 
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("call by value=================");
		int i = 1;
		callbyValue(i);
		System.out.println(i);
		
		Integer val = new Integer(4);
		callByRef(val);
		System.out.println(val);
		
		String str = new String("Madhu,"); 
		callByRef(str);
		System.out.println(str);
		
		System.out.println("call by ref=================");
		int[] value = new int[] {1,2,3};
		callByRef(value);
		for (int index = 0; index < value.length; index++) {
			System.out.println(value[index]);
		}
		
		System.out.println("call by ref=================");
		int[] inputArray = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < 3; j++) {
			inputArray[j] = scanner.nextInt();
		}
		
		callByRef(inputArray);
		for (int index = 0; index < value.length; index++) {
			System.out.println(inputArray[index]);
		}
		
		System.out.println("call by ref=================");
		Integer[] intergerArray = new Integer[3];
		for (int j = 0; j < 3; j++) {
			intergerArray[j] = scanner.nextInt();
		}
		
		callByRef(intergerArray);
		for (int index = 0; index < value.length; index++) {
			System.out.println(intergerArray[index]);
		}
		
		StringBuilder strBuilder = new StringBuilder("Madhu,"); 
		callByRef(strBuilder);
		System.out.println(strBuilder);
		
	}
	
	private static void callByRef(String str) {
		System.out.println("String: "+str.toString());
		if (',' == (str.charAt(str.length()-1))) {
			str = str.substring(0, str.length()-1);
		}
		System.out.println(str.toString());
		
	}

	private static void callByRef(StringBuilder strBuilder) {
		System.out.println("StringBuilder: "+strBuilder.toString());
		if (',' == (strBuilder.charAt(strBuilder.length()-1))) {
			strBuilder = strBuilder.deleteCharAt(strBuilder.length()-1);
		}
		System.out.println(strBuilder.toString());
	}

	private static void callByRef(Integer val) {
		val = 10;
		System.out.println(val);
	}

	private static void callByRef(Integer[] intergerArray) {
		for (int i = 0; i < intergerArray.length; i++) {
			intergerArray[i] = intergerArray[i] + 1;
		}
		
		for (int i = 0; i < intergerArray.length; i++) {
			System.out.println(intergerArray[i]);
		}
		
	}

	private static void callByRef(int[] value) {
		for (int i = 0; i < value.length; i++) {
			value[i] += 1;
		}
		
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
	}

	private static void callbyValue(int i) {
		System.out.println(++i);
		++i;
		System.out.println(i);
	}

}
