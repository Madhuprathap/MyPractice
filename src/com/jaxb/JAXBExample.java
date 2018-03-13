package com.jaxb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner a = new Scanner(System.in);
		a.nextLine();
		new BufferedWriter(new OutputStreamWriter(System.out));
		new BufferedReader(new InputStreamReader(System.in));*/
		try {
			File file = new File("File.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.toString());
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(customer, new File("File.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
