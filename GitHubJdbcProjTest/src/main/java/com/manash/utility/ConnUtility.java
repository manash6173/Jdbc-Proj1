package com.manash.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtility {
	
	public Connection getConnecton(String url,String user,String password)throws SQLException {
		
		return DriverManager.getConnection(url, user, password);
	}

}
