package test;


import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import mockit.Deencapsulation;
import mockit.Mock;
import mockit.MockUp;

public class AbastractJMock {

	@Test(expected=SQLException.class)
	public void test() throws SQLException {
		new MockUp<AbstractTest>() {
            @Mock
            public final int getBatchSize() throws SQLException {
                throw new SQLException();
            }
        };
		Test1 test = new Test1();
//		Deencapsulation.setField(test, "", 5);
        
		System.out.println(test.getBatchSize());
		
		
		
		
	}

}
