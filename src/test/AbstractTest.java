package test;

import java.sql.SQLException;

public abstract class AbstractTest {
	
	public final int getBatchSize() throws SQLException {
		return 100;
	}
}
