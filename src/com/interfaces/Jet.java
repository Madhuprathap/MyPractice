package com.interfaces;

public abstract class Jet implements Flyer{
	String getFlyType()
	{
		return "Jet";
	}
	
	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		return true;
	}
}
