package com.kishore.business.interfaces;

import java.util.List;

import com.kishore.model.Employee;

public interface EmployeeBussinessInterface {

	List<Employee> getEmployeeByDepartment(String department);

	void createEmployees(List<Employee> emp_list);

}
