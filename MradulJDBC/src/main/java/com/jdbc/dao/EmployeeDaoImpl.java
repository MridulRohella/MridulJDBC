package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static Connection conn;
	static {
		try {
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/riya", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	@Override
	public void insertEmp(Employee e) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into employee(id,name,gender,salary) values("+e.getId()+",'"+e.getName()+"','"+e.getGender()+"',"+e.getSalary()+")");
			System.out.println("EmployeeDaoImpl.insertEmp()");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void updateEmp(Employee e) {
		
	}

	@Override
	public void deleteEmp(int id) {
		
	}

	@Override
	public void getEmpById(int id) {
		
	}

	@Override
	public void getAllEmps() {
		
	}

}
