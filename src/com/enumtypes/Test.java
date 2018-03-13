package com.enumtypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static enum FilterType {
		ALL,
		PROCESSING,
		COMPLETED,
		PENDING,
		ERROR;
		
		public static Object[] COMPLETELY_PROCESSESED_STATUSES = {
			PROCESSING,
			COMPLETED,
			PENDING,
		};
	}
	
	
	public enum WhoisRIR {
	    ARIN("whois.arin.net"),
	    RIPE("whois.ripe.net"),
	    APNIC("whois.apnic.net"),
	    AFRINIC("whois.afrinic.net"),
	    LACNIC("whois.lacnic.net"),
	    JPNIC("whois.nic.ad.jp"),
	    KRNIC("whois.nic.or.kr"),
	    CNNIC("ipwhois.cnnic.cn"),
	    UNKNOWN("");

	    private String url;

	    public void setUrl(String url) {
			this.url = url;
		}

		WhoisRIR(String url) {
	        this.url = url;
	    }

	    public String getUrl() {
	        return url;
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(FilterType.COMPLETED);
		List<Object> list = Arrays.asList(FilterType.COMPLETELY_PROCESSESED_STATUSES);
		System.out.println(list.contains(FilterType.PROCESSING));
		System.out.println(list.contains(FilterType.ALL));
		System.out.println(FilterType.COMPLETELY_PROCESSESED_STATUSES);
		
		System.out.println(FilterType.COMPLETED == FilterType.ALL);
		
		System.out.println(WhoisRIR.ARIN.getUrl());
		//setting property value of enum
		WhoisRIR.ARIN.setUrl("madu.net");
		System.out.println(WhoisRIR.ARIN.getUrl());
		
		for (FilterType fileType : FilterType.values()) {
            System.out.println(fileType);
        }
		System.out.println(FilterType.COMPLETED.values().length);
		
		//convert string to enum
		FilterType PROCESSED = FilterType.valueOf("processed".toUpperCase());
//		System.out.println(PROCESSED.name() + " - " + PROCESSED.ordinal());
	}

}
