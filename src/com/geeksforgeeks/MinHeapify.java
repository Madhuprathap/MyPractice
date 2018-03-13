package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class MinHeapify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(100);
		list.add(new String("V0"));
		list.add(1, new String("v3"));
		
		System.out.println(list.size());
		
		int[] array =  new int[] {1,7,2,10,3};
	
		minHeapify(array);
		minHeapify(array);
		minHeapify(array);
		
	}

	private static int minHeapify(int[] array) {
		int minValue = Integer.MAX_VALUE;
		int minHeapyIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1 && minValue > array[i]) {
				minValue = array[i];
				minHeapyIndex = i;
			}
		}
		int i = minHeapyIndex;
		for (; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[i] = -1;
		return minValue;
	}

}
