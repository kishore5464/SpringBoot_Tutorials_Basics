package com.kishore.business.impl;

import java.util.List;
import java.util.Optional;

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
	public void insertEmployees(List<Employee> employeesList) {
		employeeDAOInterface.saveAll(employeesList);
	}
	
	@Override
	public Optional<Employee> getEmployeeBeforeUpdate(Integer id) {
		return employeeDAOInterface.findById(id);
	}

	@Override
	public void updateEmployeeLastName(Integer id, String lastName) {
		employeeDAOInterface.updateByLastName(id, lastName);
	}

	@Override
	public Optional<Employee> getEmployeeAfterUpdate(Integer id) {
		return employeeDAOInterface.findById(id);
	}

}
