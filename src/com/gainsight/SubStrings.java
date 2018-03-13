package com.gainsight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String text = reader.readLine();
			System.out.println(text);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Scanner scanner = new Scanner(System.in);
		scanner.next();*/
		String st = "baiai";
		Set uniqueSubstrings = new HashSet();
		for(int c = 0 ; c < st.length() ; c++ )
		{
			for(int i = 1 ; i <= st.length() - c ; i++ )
			{
				System.out.println(st.substring(c, c+i));
				uniqueSubstrings.add(st.substring(c, c+i));
			}
		}

		System.out.println(uniqueSubstrings.size());



		/*String st = "iii";
		long length = st.length();
		long n = 0;

		Set uniqueChars = new HashSet();

		for (int i = 0; i < length; i++) {
			if (st.charAt(i) != ' ') {
				uniqueChars.add(st.charAt(i));
				++n;
			}
		}

		long output = ((n*(n+1))/2)-(n-uniqueChars.size());
		System.out.println(output);*/
		
	}

}
