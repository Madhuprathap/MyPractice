package com.circularDependency;

import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Building building = new Building();
		System.out.println(building.lift.getSpeed());
		
		Building deepCopy = building.deepCopy();
		
		System.out.println(building.lift.getSpeed());
		System.out.println(deepCopy.lift.getSpeed());
		
		System.out.println(1/0.0);
		System.out.println(6|3);
		
		
		System.out.println("geeeeks".contains("eek"));
	}

}
