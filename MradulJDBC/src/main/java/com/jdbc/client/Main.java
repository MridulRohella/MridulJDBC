package com.jdbc.client;

import com.jdbc.dao.EmployeeDao;
import com.jdbc.dao.EmployeeDaoImpl;
import com.jdbc.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee("Saurabh singh", "male", 10, 45787);
		EmployeeDao dao = new EmployeeDaoImpl();
//		dao.insertEmp(emp);
//		
//		emp = new Employee("Gaurav singh", "male", 11, 45787);
//		dao.insertEmp(emp);
//
//		emp = new Employee("Dhairya singh", "male", 12, 45787);
//		dao.insertEmp(emp);
//		emp = new Employee("Vishwas singh", "male", 13, 45787);
//		dao.insertEmp(emp);

	}

}
