package com.kishore.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishore.service.models.Department;

@Repository
public interface Department_Repository extends JpaRepository<Department, Integer> {

}
