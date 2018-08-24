package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import linkedlist.Node;

class SerializationBox implements Serializable {

	public SerializationBox(int i) {
		serializableProp = i;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 9197421922953073347L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int serializableProp = 10;
	
	//NotSerializableException
	//private Node node = new Node("12");
	
	public int getSerializableProp() {
		return serializableProp;
	}
}

class SerializationBoxSub extends SerializationBox {

	public SerializationBoxSub() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2340031437851938407L;
	/**
	 * 
	 */
	private byte serializablePropsub = 10;

	public byte getSerializablePropSub() {
		return serializablePropsub;
	}
}


public class SerializationSample {
	public static void main(String args[]) throws IOException,
	FileNotFoundException, ClassNotFoundException {
		SerializationBox serialB = new SerializationBox(1);
		try {
			SerializationBox serialB2 = (SerializationBox) Class.forName("SerializationBox").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		serialize("D:\\Personal\\workspace\\MyPractice\\serial.out", serialB);
		SerializationBox sb = (SerializationBox) deSerialize("serial.out");
		System.out.println(sb.getSerializableProp());
	}

	public static void serialize(String outFile, Object serializableObject)
	throws IOException {
		FileOutputStream fos = new FileOutputStream(outFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(serializableObject);
	}

	public static Object deSerialize(String fileName)
	throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		return ois.readObject();
	}
}
