package com.inquira;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.StringTokenizer;

public class RunSqlScript {
	private static final String MSSQL = "mssql";
	public static void main(String[] args) {
		Connection connection = null;
		try{
			
			String result = "SUCCESS";
			
			Driver driver = null;
			
			
			//Set up the connection
			driver = (Driver) Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
			
			String url = "jdbc:jtds:sqlserver://adc2120511.us.oracle.com:1433;databaseName=DW_STAGE";
			String user = "sa";
			String password = "ok852";
			
			Properties properties = new Properties();
			properties.setProperty("user", user);
			properties.setProperty("password", password);
			
			connection = driver.connect(url, properties);

			String dbType = "MSSQL";
			
			InputStream sqlScriptInputStream = new FileInputStream(new File("DW_Create.sql"));
			if(!executeSQLCommandFile(dbType, sqlScriptInputStream, connection))
				result = "FAILED";
			System.out.println("result::::"+result);
        } catch (Exception ex) {
        	ex.printStackTrace();
			//result = "FAILED";
            //System.err.println("RunSQLScript.install() FATAL ERROR: " + ex.getMessage());
            //ex.printStackTrace(IASys.err);
        } finally {		
		
			//Close the connection
			if(connection != null){
				try{
					connection.close();
				} catch(SQLException e){
					//Could not close the connection
				}
			}
			
			
		}
    }
	
	private static boolean executeSQLCommandFile(String dbType, InputStream sqlScript, Connection connection) {
    	boolean result= true;
    	
		try {
    		//Read the file as a String
    		String sqlCommands = readStreamAsString(sqlScript);
			
			if(sqlCommands != null){
			
				Statement stmt = null;

				//Tokenize the file by the semicolon delimiter
				StringTokenizer tokenizer = new StringTokenizer(sqlCommands, ";");

				//Disable auto-commit
				connection.setAutoCommit(false);
				stmt = connection.createStatement();

				//Iterate over each SQL command
				while(tokenizer.hasMoreTokens()) {
					String command = tokenizer.nextToken().trim();

					if(command.length() > 0) {
						
						//Need to re-add a semicolon at the end of each statement for MSSQL
						//Was having issues with "WITH" keyword in DW_Populate.sql complaining about
						//previous statements missing the semicolon
						if(dbType != null && dbType.equalsIgnoreCase(MSSQL)) {
							command += "\n;";
						}
					
						//Add the command to the batch of commands]
						System.out.println(command);
						stmt.addBatch(command);
					}
				}
				//Execute the batch of statements
				try{
					stmt.executeBatch();
					//Commit if not errors occured
					connection.commit();
				} catch (SQLException e1) {
					result = false;
					//Rollback if an error occurred
					try {
						if (connection != null) {
							connection.rollback();
						}
					} catch (SQLException e2) {
						e2.printStackTrace();
					}
					throw e1;
				} finally {
					//Close the statement
					if (stmt != null) {
						try {
							stmt.close();
						} catch (SQLException e1) {
							//Could not close the statement
						}
					}
					
					//Close the connection
					if (connection != null) {
						try {
							connection.close();
						} catch (SQLException e1) {
							//Could not close the connection
						}
					}
				}
			} else {
				//Could not read the input stream
				result = false;
			}
    	} catch (Exception e) {
    		result = false;
			e.printStackTrace();
    	}

    	return result;
    }
    
	private static String readStreamAsString(InputStream inputStream) throws IOException {
        String result = null;
        Reader reader = null;
        try {

            if (inputStream != null) {
                reader = new InputStreamReader(inputStream, "UTF-8");
                StringBuffer sb = new StringBuffer();
                char[] b = new char[8192];
                int n;
                while ((n = reader.read(b)) > 0) {
                    sb.append(b, 0, n);
                }
                result = sb.toString();
            }
    
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
        }
        return result;
    }

	
	
}
