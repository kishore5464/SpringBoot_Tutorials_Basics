package com.kishore.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kishore.service.models.Student;

@Repository
public interface Student_Repository extends CrudRepository<Student, Integer> {

}
