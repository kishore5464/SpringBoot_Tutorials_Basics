package com.kishore.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kishore.model.Employee;

@Repository
public interface EmployeeDAOInterface extends CrudRepository<Employee, Integer> {

	@Query(value = "SELECT emp FROM Employee emp WHERE emp.lastName = :lastname OR emp.gender = :gen")
	public List<Employee> findByGenderOrLastName(@Param("gen") String gender, @Param("lastname") String lastName);
}
