package com.interfaces;

public class FlyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jet jet = new Jet() {
			
			@Override
			public int numberOfWings() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(jet.canFly());
	}

}
