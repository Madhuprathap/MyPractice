package com.redbus;

public class Second {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args[0]);
		int a[] = new int[] {2,3,10,2,4,8,1};
		a[0]++;
		System.out.println(a[0]);
		System.out.println(maxDiff(a));
	}

	private static int maxDiff(int[] a) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxIndex = i;
			}
		}
		if (maxIndex == 0) {
			return -1;
		} else {
			min = max;
			for (int i = 0; i < maxIndex; i++) {
				if (a[i] < min) {
					min = a[i];
				}
			}
		}
		return max-min ; 
	}

}
