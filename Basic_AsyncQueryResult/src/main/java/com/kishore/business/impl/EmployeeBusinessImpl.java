package com.kishore.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

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

	/*
	 * @Override public Future<Employee> findByFirstName(String firstName) { // TODO
	 * Auto-generated method stub return
	 * employeeDAOInterface.findByFirstName(firstName); }
	 */

	/*
	 * @Override public CompletableFuture<Employee> findByFirstName(String
	 * firstName) { // TODO Auto-generated method stub return
	 * employeeDAOInterface.findByFirstName(firstName); }
	 */
	
	@Override
	public ListenableFuture<Employee> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return employeeDAOInterface.findByFirstName(firstName);
	}
}
