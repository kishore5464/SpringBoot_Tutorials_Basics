package com.kishore.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kishore.service.models.Department;

@Repository
public interface Department_Repository extends CrudRepository<Department, Integer> {

}
