package com.hashmap;

public class Classroom {

	int id;
	
	public Classroom(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		//return id;
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
