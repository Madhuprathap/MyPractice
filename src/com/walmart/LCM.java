package com.walmart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LCM {

	static ArrayList<Integer> intervalsList = null;
	static int LCM = 1;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String n = reader.readLine();
		System.out.println("Enter "+ n + " inputs:");
		int inputSize = Integer.parseInt(n);
		String[] inputArray = new String[inputSize];
		for (int i = 0; i < inputSize; i++) {
			inputArray[i] = reader.readLine();
		}
		
		for (int i = 0; i < inputArray.length; i++) {
			String intervalsText = inputArray[i];
			String[] intervalsArray = intervalsText.split(" ");
			
			intervalsList = new ArrayList<Integer>();
			for (int j = 0; j < intervalsArray.length; j++) {
				intervalsList.add(Integer.parseInt(intervalsArray[j]));
			}
			lcm(intervalsList);
		}
		
	}
	
	private static void lcm(ArrayList<Integer> intervalsList) {
		while (true) {
			int minDivisor = firstDivisor(minValue(intervalsList));
			if (minDivisor == -1) {
				break;
			}
			
            for (int i = 0; i < intervalsList.size(); ++i) {
                if (intervalsList.get(i) % minDivisor == 0) {
                	intervalsList.set(i, intervalsList.get(i)/minDivisor);
                }
            }
            System.out.print(intervalsList.toString()+"\n");
        }
        System.out.println("LCM = " + LCM); 
        LCM = 1;
	}

	private static Integer firstDivisor(Integer minValue) {
		if (minValue == Integer.MAX_VALUE) {
			return -1; //Return -1 to signal end
		} else {
			for (int i = 2; i <= minValue; ++i) {
				if (minValue % i == 0) {
					LCM *= i;
					System.out.print(i+" ");
					return i;
				}
			}
		}
		System.err.println("Unnecessary return!");
		return -10;
	}

	private static Integer minValue(ArrayList<Integer> list) {
		Integer min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i) != 1 && list.get(i) < min) {
				min = list.get(i);
			}
		}
		return min; //When this returns Integer.MAX_VALUE, we are done
	}

}
