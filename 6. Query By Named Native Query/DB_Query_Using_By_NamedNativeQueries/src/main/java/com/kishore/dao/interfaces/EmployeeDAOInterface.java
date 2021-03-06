package com.kishore.dao.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kishore.model.Employee;

@Repository
public interface EmployeeDAOInterface extends CrudRepository<Employee, Integer> {

	public List<Employee> findByDepartment(String department);

	public List<Employee> getLast_NameOrDegree(String last_name, String degree);

}
