package com.kishore.dao.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.concurrent.ListenableFuture;

import com.kishore.model.Employee;

@Repository
public interface EmployeeDAOInterface extends CrudRepository<Employee, Integer> {

//	@Async
//	Future<Employee> findByFirstName(String firstName);
	
//	@Async
//	CompletableFuture<Employee> findByFirstName(String firstName);
	
//	@Async
	ListenableFuture<Employee> findByFirstName(String firstName);
}
