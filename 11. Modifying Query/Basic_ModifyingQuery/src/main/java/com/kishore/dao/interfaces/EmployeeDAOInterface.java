package com.kishore.dao.interfaces;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kishore.model.Employee;

@Repository
public interface EmployeeDAOInterface extends CrudRepository<Employee, Integer> {

	@Transactional
	@Modifying
	@Query(value = "UPDATE Employee emp SET emp.lastName = :emp_lastname WHERE emp.id = :emp_id")
	public void updateByLastName(@Param("emp_id")Integer id, @Param("emp_lastname")String lastName);
	
}
