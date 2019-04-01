package com.manash.dao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.manash.utility.ConnUtility;

public class EmployeeDAO {
	
	
	public int getMaxSal() throws SQLException,Exception {
		//input stream class object
		InputStream is=new FileInputStream("src/main/java/com/manash/commons/DBConfig.properties");
		//create Properties class object
		Properties prop=new Properties();
		//load file 
		prop.load(is);
		PreparedStatement ps=null;
		int result=0;
		Connection con=ConnUtility.getConnecton(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		ps=con.prepareStatement("select max(sal) from emp");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			 result=rs.getInt(1);
		}
		return result;
	}
	
	public String sayHello() {
		return "Hii welcome to GitHub";
	}

}
