package com.hashmap;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Classroom, Integer> map = new HashMap<Classroom, Integer>();
		Classroom c1 = new Classroom(1);
		map.put(c1, new Integer(1));
		map.put(new Classroom(2), new Integer(2));
		map.put(new Classroom(3), new Integer(3));
		map.put(null, new Integer(4));
		map.put(null, new Integer(5));
		Iterator<Entry<Classroom, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry e = iterator.next();
			System.out.println(e.getKey() + "   " +e.getValue());
		}
		
		System.out.println(map.get(c1));
		Iterator it =  map.keySet().iterator();
		while (it.hasNext()) {
			 System.out.println(map.get(it.next()));
			
		}
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Madhu", "prathap");
		map1.put("Surja", "gagain");
		
		System.out.println(map1.get("Madhu"));
		
		File file = new File("/", "file.txt");
	}

}
