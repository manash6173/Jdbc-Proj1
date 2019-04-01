package com.manash.service;

import java.sql.SQLException;

import com.manash.dao.EmployeeDAO;

public class EmployeeService {
	private EmployeeDAO dao=new EmployeeDAO();
	
	public int getEmpHighSal() throws SQLException,Exception{
		//use dao
		int sal=dao.getMaxSal();
		return sal;
	}
}
