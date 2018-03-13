//https://dzone.com/articles/easymock-tutorial-%E2%80%93-getting

package com.mocktesting;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

interface IAdd{
	int sum(int i, int j);
}

class AddDec implements IAdd{
	/*int i;
	int j;*/
	IAdd add;
	
	//We are testing this method using essaymock by mocking IAdd interface and sum(i,j) method
	/*int sum() {
		return add.sum(i, j) * 2;
	}*/

	@Override
	public int sum(int i, int j) {
		return add.sum(i, j) * 2;
	}
}

public class EasyMockTest {
	private IAdd add;
	private AddDec addDec;
	
	@Test
	public void test() {
		//Mock can be done only Interface
		add = createNiceMock(IAdd.class);
		addDec = new AddDec();
		addDec.add = add;
		
		// Setting up the expected value of the method call sum, means sum method is mocked
	    expect(add.sum(1,2)).andReturn(3);
	    // Setup is finished need to activate the mock
	    replay(add);
	    
	    //mock object object performed 
	    /*addDec.i = 1;
	    addDec.j = 2;*/
	    //Here addDesc.sum() is tested with mocking IAdd#sum(int i, int j)
	    assertEquals(addDec.sum(1,2),6);
	}

}
