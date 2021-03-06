package com.kishore.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
		// TODO Auto-generated method stub
		employeeDAOInterface.saveAll(employeesList);
	}

	@Override
	public List<Employee> findByGender(String gender, Pageable pageable) {
		// TODO Auto-generated method stub
		return employeeDAOInterface.findByGender(gender, pageable);
	}

}
