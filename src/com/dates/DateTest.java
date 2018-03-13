package com.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat buddhistCalendarFormatter = new SimpleDateFormat("dd-MMM-yyyy",  new Locale("th", "TH"));
		String dateInString = "02-ก.ค.-2558";
		SimpleDateFormat gregorianCalendarFormatter = new SimpleDateFormat("dd-MMM-yyyy");
		try {
	 
			Date date = buddhistCalendarFormatter.parse(dateInString);
			System.out.println(date);
			System.out.println(date.getDate()+" -- "+date.getMonth() + " -- " + (date.getYear()+1900));
			System.out.println(gregorianCalendarFormatter.format(date));
			System.out.println(buddhistCalendarFormatter.format(date));
	 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dateInString = "2014-01-01T00:00:01";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");
		try {
			Date date = format.parse(dateInString);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
