package com.manash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manash.utility.ConnUtility;

public class EmployeeDAO {
	
	private ConnUtility conn=new ConnUtility();
	
	public int getMaxSal() throws SQLException {
		PreparedStatement ps=null;
		int result=0;
		Connection con=conn.getConnecton("jdbc:oracle:thin:@localhost:1521:xe", "system", "manash");
		ps=con.prepareStatement("select max(sal) from emp");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			 result=rs.getInt(1);
		}
		return result;
	}

}
