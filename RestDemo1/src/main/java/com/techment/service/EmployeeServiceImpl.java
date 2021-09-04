package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techment.dao.EmployeeDao;
import com.techment.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public String addEmployee(Employee employee) {
		employeeDao.save(employee);
		return "employee Added";
	}

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

}
