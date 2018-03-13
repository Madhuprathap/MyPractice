package com.redbus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.print.attribute.standard.Fidelity;


public class Pascal {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int k = Integer.parseInt(reader.readLine());
			printPascal(k);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printPascal(int k) {
		int [] factorial = new int[k];
		factorial[0] = 1;
		factorial[1] = 1;
		factorial[2] = 2;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j <= i; j++) {
				if (factorial[i] == 0 ) {
					findFactorial(factorial, i);
				} 
				if (factorial[j]==0) {
					findFactorial(factorial, j);
				}
				System.out.print(factorial[i]/(factorial[j]* factorial[i-j]) + " ");
			}
			System.out.println();
		}
	}

	private static int findFactorial(int[] factorial, int i) {
		if (factorial[i-1] == 0 ) {
			factorial[i] = i * findFactorial(factorial, i-1);
		}
		return factorial[i] = i * factorial[i-1];
	}

}


