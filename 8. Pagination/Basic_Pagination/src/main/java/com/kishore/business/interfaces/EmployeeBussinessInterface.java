package com.kishore.business.interfaces;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.kishore.model.Employee;

public interface EmployeeBussinessInterface {

	void insertEmployees(List<Employee> employeesList);

	List<Employee> findByGender(String gender, Pageable pageable);

}
