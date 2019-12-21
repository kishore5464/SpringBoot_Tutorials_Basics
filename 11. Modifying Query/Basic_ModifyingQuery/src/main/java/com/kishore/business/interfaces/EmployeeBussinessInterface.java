package com.kishore.business.interfaces;

import java.util.List;
import java.util.Optional;

import com.kishore.model.Employee;

public interface EmployeeBussinessInterface {

	void insertEmployees(List<Employee> employeesList);

	void updateEmployeeLastName(Integer id, String lastName);

	Optional<Employee> getEmployeeBeforeUpdate(Integer id);

	Optional<Employee> getEmployeeAfterUpdate(Integer id);

}
