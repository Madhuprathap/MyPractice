package com.sutherland;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Test {
	
	static int i =1;
	
	private class InnerTest{
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		HashMap map = new HashMap();
		map.put(1, "1");
		map.put(1, "2");
		System.out.println(map.get(1));
		System.out.println( map.size());
		
		
		Scanner scanner = new Scanner(System.in);
		String txt = scanner.next().trim();
		System.out.println(Integer.parseInt(txt));
		/*Test t;
		t.dispaly();*/
		int[] intArray = new int[10];
		Object[] objectArray = new Object[50];
		objectArray[1] = new Test();
		System.out.println(objectArray[1]);
		
		Hashtable table = new Hashtable();
//		Hashtable null as key not allowed
//		table.put(null, "21");
		
		HashSet hashSet = new HashSet();
		hashSet.add(null);
		hashSet.add(null);
		System.out.println("HashSet size " + hashSet.size());
		
		List l = new ArrayList();
		l.add("aA");
		l.add("AA");
		l.add("Aa");
		l.add(0, "Madhu");
		System.out.println(l.get(0));
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Collection sort = new LinkedList();
		sort.add(1);
		sort.add(2);
		for (Object object : sort) {
			System.out.println(object);
		}
		
		System.out.println("tree set");
		Set tree = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (Integer.compare(o1, o2) == 1) {
					return -1;
				} else if (Integer.compare(o1, o2) == -1) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.toArray();
		Iterator iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.println( iterator.next());

		}
		System.out.println(Integer.valueOf('A'));
		
		
		System.out.println("tree set");
		Set tree1 = new TreeSet();
		tree1.add("7");
		tree1.add(9);
		
		iterator = tree1.iterator();
		while (iterator.hasNext()) {
			System.out.println( iterator.next());

		}
		
		System.out.println(Integer.valueOf('a'));
		
	}

	private void dispaly() {
		// TODO Auto-generated method stub
		
	}

	

}
