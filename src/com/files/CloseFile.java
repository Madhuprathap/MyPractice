package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CloseFile {
	private final static String DELETE_DOCMETAINFOHIST = "delete from doc_meta_info_hist where collection_id  in (?)";
    private final static String INSERT_DOCMETAINFOHIST = "insert into doc_meta_info_hist (select * from doc_meta_info where collection_id in (?))";
	
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Personal\\workspace\\MyPractice\\src\\errormessages.properties");
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		br.close();
		System.out.println("br closed");
//		br.close();
		
		isr.close();
		
		StringBuilder str = new StringBuilder("1, 2, 3, ");
		if (str.length() > 0) {
			System.out.println(str.delete(str.length()-", ".length(), str.length()));
		}
		String deleteQuery = DELETE_DOCMETAINFOHIST.replace("?", str);
        String insertQuery = INSERT_DOCMETAINFOHIST.replace("?", str);
        System.out.println(DELETE_DOCMETAINFOHIST);
        System.out.println(deleteQuery);
        System.out.println(INSERT_DOCMETAINFOHIST);
        System.out.println(insertQuery);
        
	}

}
