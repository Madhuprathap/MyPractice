package com.symantec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

//Interface is always extends

//An interface can extend multiple Interfaces
//An interface can not extend classes
public interface InterfaceTest extends List, Set{

	void test1();
	
	public void test2();

}
