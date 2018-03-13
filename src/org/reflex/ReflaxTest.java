package org.reflex;

import java.lang.reflect.Method;

public class ReflaxTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateMessage pMessage = new PrivateMessage();
		pMessage.setMessage("Madhu");
		try {
		Method method = PrivateMessage.class.getDeclaredMethod("getMessage", null);
		method.setAccessible(true);
		System.out.println(method.invoke(pMessage, null));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
