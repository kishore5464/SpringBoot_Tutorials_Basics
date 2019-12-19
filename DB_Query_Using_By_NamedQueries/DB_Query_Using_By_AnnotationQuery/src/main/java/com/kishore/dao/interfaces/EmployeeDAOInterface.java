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

	@Query(value = "SELECT emp FROM Employee emp WHERE emp.lastName = ?1 OR emp.degree = ?2")
	public List<Employee> getLast_NameOrDegree(String last_name, String degree);

}
