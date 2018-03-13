package com.geeksforgeeks;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrintSpiral {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestInterface testInterface = new TestInterface() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			int i = 0;
			
			PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
				public int compare(Integer x, Integer y) {
					return (x > y) ? -1 : ((x == y) ? 0 : 1);
				};
			});
			
			while (i < n) {
				pQueue.add(scanner.nextInt());
				i++;
			}
			
			System.out.println(maxAmountOfMoney(pQueue, m));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
		
	}
	
	private static int maxAmountOfMoney(PriorityQueue<Integer> pQueue, int m) {
		
		int maxAmount = 0;
		while (m > 0) {
			if (pQueue.size() > 0) {
				Integer max = pQueue.poll();
				maxAmount += max;
				if (max-1 > 0) {
					pQueue.add(max-1);
				}
				m--;
			} else {
				return -1;
			}
			
		}
		return maxAmount;
	}


	/*private static int maxAmountOfMoney(int[] windowsTickets, int m) {
		int maxAmount = 0;
		while (m > 0) {
			maxAmount += maxOfArray(windowsTickets);
			m--;
		}
		return maxAmount;
	}

	private static int maxOfArray(int[] windowsTickets) {
		int max = -1;
		int maxIndex = 0;
		for (int i = 1; i < windowsTickets.length; i++) {
			if (max < windowsTickets[i]) {
				max = windowsTickets[i];
				maxIndex = i;
			}
		}
		windowsTickets[maxIndex] = windowsTickets[maxIndex] - 1;
		return max;
	}*/
}
