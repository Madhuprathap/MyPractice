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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
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
		float f = 2.1f;
		double d = 4.8;
		System.out.println((f+d));
		System.out.println((int)(f+d));
		
		System.out.println((int)2.5);
		
		HashMap map = new HashMap();
		map.put(1, "1");
		map.put(1, "2");
		map.put("Madhu", "Mahdu");
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
		
		int[][] test = new int[5][];
		
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
		System.out.println("LinkedList:");
		List linkedList = new LinkedList();
		linkedList.add("Madhu");
		linkedList.add("Gaddam");
		linkedList.add(0, "prathap");
		System.out.println(linkedList);
		
		System.out.println("stack:");
		List stack = new Stack();
		stack.add("Madhu");
		stack.add("Gaddam");
		stack.add(0, "prathap");
		System.out.println(stack);
		
		Collection sort = new LinkedList();
		sort.add(1);
		sort.add(2);
		sort.add("Madhu");
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
		
		
		List ll = new ArrayList();
		ll.add("Madhu");
		ll.add(12);
		System.out.println(ll);
		
		System.out.println("LinkedHashMap");
		Map map2 = new LinkedHashMap();
		map2.put("Madhu", "madhu");
		map2.put(1, 1);
		
		System.out.println("tree map");
		Map map1 = new TreeMap();
		map1.put(12, 12);
		map1.put("Madhu", "madhu");
		System.out.println(map1.keySet().toArray());
		
		System.out.println("tree set");
		Set tree1 = new TreeSet();
		tree1.add("Madhu");
		tree1.add(9);
		System.out.println(tree1);
		
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
