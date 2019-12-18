package com.kishore.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishore.business.interfaces.EmployeeBussinessInterface;
import com.kishore.dao.interfaces.EmployeeDAOInterface;
import com.kishore.model.Employee;

@Service
public class EmployeeBusinessImpl implements EmployeeBussinessInterface {

	@Autowired
	private EmployeeDAOInterface employeeDAOInterface;

	@Override
	public List<Employee> getEmployeeByDepartment(String department) {
		return employeeDAOInterface.findByDepartment(department);
	}

	@Override
	public void createEmployees(List<Employee> emp_list) {
		employeeDAOInterface.saveAll(emp_list);
	}

}
