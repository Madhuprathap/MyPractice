package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Matching Overview
//txt = "AAAAABAAABA" 
//pat = "AAAA"
//
//We compare first window of txt with pat
//txt = "AAAAABAAABA" 
//pat = "AAAA"  [Initial position]
//We find a match. This is same as Naive String Matching.
//
//In the next step, we compare next window of txt with pat.
//txt = "AAAAABAAABA" 
//pat =  "AAAA" [Pattern shifted one position]
//This is where KMP does optimization over Naive. In this 
//second window, we only compare fourth A of pattern
//with fourth character of current window of text to decide 
//whether current window matches or not. Since we know 
//first three characters will anyway match, we skipped 
//matching first three characters. 
//
//Need of Preprocessing?
//An important question arises from above explanation, 
//how to know how many characters to be skipped. To know 
//this, we pre-process pattern and prepare an integer array 
//lps[] that tells us count of characters to be skipped. 

public class StringMatchiKMP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input Stirng:");
		String text = scanner.nextLine();
		System.out.println(text.length());
		System.out.println("Enter pattern to Search:");
		String pattern = scanner.nextLine();
		scanner.close();
		printPatternOccurrences(text, pattern);
	}

	private static void printPatternOccurrences(String text, String pattern) {
		int[] lps = new int[pattern.length()];
		buildPrefixSuffixArray(lps, pattern);
		List<Integer> matchesIndex = findMatchOccurrences(text, pattern, lps);
		matchesIndex.stream().forEach(System.out::print);
	}

	private static List<Integer> findMatchOccurrences(String text, String pattern, int[] lps) {
		List<Integer> matches = new ArrayList<Integer>(text.length()-pattern.length());
		int pi = 0, ti = 0;
		while (ti < text.length()) {
			if (text.charAt(ti) == pattern.charAt(pi)) {
				pi++;
				ti++;
			} else {
				if (pi == 0) {
					ti++;
				} else 
					pi = lps[pi-1];
			}
			if (pi == pattern.length()) {
				matches.add(ti - pattern.length());
				pi = 0;
			}
		}
		return matches;
	}

	private static void buildPrefixSuffixArray(int[] lps, String pattern) {
		int j=0;
		lps[0] = 0;
		for (int i = 1; i < lps.length;) {
			if (pattern.charAt(i) == pattern.charAt(j)) {
				lps[i] = ++j;
				i++;
			} else {
				--j;
				if (j <= 0) {
					lps[i++] = 0;
					j = 0;
				} else
					j = lps[j];
			}
		}
	}
}
