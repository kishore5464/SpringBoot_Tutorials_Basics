package com.kishore.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kishore.model.Employee;

@Repository
public interface EmployeeDAOInterface extends CrudRepository<Employee, Integer> {

	@Query(value = "SELECT e FROM Employee e WHERE e.department = ?1")
	public List<Employee> findByDepartment(String department);

	@Query(value = "SELECT * FROM employee_table WHERE last_Name = ?1 AND degree = ?2", nativeQuery = true)
	public List<Employee> getLast_NameOrDegree(String last_name, String degree);

}
