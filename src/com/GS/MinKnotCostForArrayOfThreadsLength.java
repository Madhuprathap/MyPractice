package com.GS;

import java.util.PriorityQueue;

public class MinKnotCostForArrayOfThreadsLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] lengthOfThreads = new int[] {4,2,6,3,1};
		System.out.println(calculateCostForThreadKnot(lengthOfThreads));
	}
	
	static int calculateCostForThreadKnot(int[] lengthOfThreads) {
		if (lengthOfThreads != null && lengthOfThreads.length > 0) {
			return minKnotsCost(lengthOfThreads);
		} else {
			return 0;
		}
    }
	
	private static int minKnotsCost(int[] lengthOfThreads) {
		int minCost = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < lengthOfThreads.length; i++) {
			queue.add(lengthOfThreads[i]);
		}
		while (queue.size() > 1) {
			Integer firstMin = queue.poll();
			Integer secondMin = queue.poll();
			minCost += firstMin+secondMin;
			queue.add(firstMin+secondMin);
		}
		return minCost;
	}
}
