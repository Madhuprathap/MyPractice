package com.geeksforgeeks;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxNumberArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {3,1,4,2,6};
		int[] rep = new int[] {2,1,5,9,3};
		
		//Max Heapy - using priorityqueue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(20, new Comparator<Integer>() {

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
		
		for (int i = 0; i < rep.length; i++) {
			pQueue.add(rep[i]);
		}
		
		int maxHeapy = (Integer) pQueue.poll();
		for (int i = 0; i < arr.length; i++) {
			if (maxHeapy > arr[i] ) {
				arr[i] = maxHeapy;
				maxHeapy = (Integer) pQueue.poll();
			}
			System.out.print(arr[i]);
		}
	}

}
