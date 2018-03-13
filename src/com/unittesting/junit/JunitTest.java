package com.unittesting.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
	//Before every testcase
	@Before
	public void before(){
		System.out.println("Before");
	}

	//Test method should be public
	//expected used: then should throw the exception
	@Test(expected = NullPointerException.class)
	public void equl() {

		System.out.println("equal");
		assertEquals(30, 30);
		assertEquals("10 x 5 must be 50", 50, 50);
		throw new NullPointerException();
	}
	
	@Test(expected = Exception.class)
	public void notNull() throws Exception{
		System.out.println("notNull");
		assertNotNull(new JunitTest());
		
		Divide divide = new Divide();
		System.out.println(divide.divide(5, 0));
		assertEquals(divide.divide(5, 0),5);
		
	}
	
	//after every testcase
	@After
	public void after(){
		System.out.println("after");
	}
}
