package com.kishore.business.interfaces;

import java.util.List;

import org.springframework.util.concurrent.ListenableFuture;

import com.kishore.model.Employee;

public interface EmployeeBussinessInterface {

	void insertEmployees(List<Employee> employeesList);

//	Future<Employee> findByFirstName(String firstName);
	
//	CompletableFuture<Employee> findByFirstName(String firstName);
	
	ListenableFuture<Employee> findByFirstName(String firstName);

}
