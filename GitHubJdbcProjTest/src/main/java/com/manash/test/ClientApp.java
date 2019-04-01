package com.manash.test;

import java.sql.SQLException;

import com.manash.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) throws SQLException,Exception {
		//create service class object
		EmployeeService service=new EmployeeService();
		System.out.println("Employee Highest salary::"+service.getEmpHighSal());
		

	}

}
