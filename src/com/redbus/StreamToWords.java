package com.redbus;

import java.util.HashMap;
import java.util.Map;

public class StreamToWords {
	public static void main(String[] args) {
		
		String encodedstring = "010100010110";
		String[] encodings = {"[newline]	010100","2	010110"};
		System.out.println(Decoding(encodings, encodedstring));
	}
	
	static String Decoding(String[] encodings, String encodedstring) {
		//Dictionary
		Map<String, String> dictionary = new HashMap<String, String>();
		for (int i = 0; i < encodings.length; i++) {
			String[] temp = encodings[i].split("\t");
			dictionary.put(temp[1], temp[0]);
		}
		
		StringBuilder decodedString = new StringBuilder();
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < encodedstring.length(); i++) {
			word.append(encodedstring.charAt(i));
			if (dictionary.containsKey(word.toString())) {
				String decodedChar = dictionary.get(word.toString());
				word = new StringBuilder();
				if (decodedChar.equals("[newline]")) {
					decodedString.append("\n");
				} else {
					decodedString.append(decodedChar);
				}
			}
		}
		return decodedString.toString();
    }
}
