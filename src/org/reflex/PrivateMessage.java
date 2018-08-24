package org.reflex;

public class PrivateMessage {
	
	private String message;

	private String getMessage() {
		System.out.println(this.message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

