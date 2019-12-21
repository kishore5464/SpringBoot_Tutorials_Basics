package com.kishore.business.interfaces;

import java.util.List;

import com.kishore.model.Employee;

public interface EmployeeBussinessInterface {

	void insertEmployees(List<Employee> employeesList);

	List<Employee> findByGenderOrLastName(String gender, String lastName);

}
