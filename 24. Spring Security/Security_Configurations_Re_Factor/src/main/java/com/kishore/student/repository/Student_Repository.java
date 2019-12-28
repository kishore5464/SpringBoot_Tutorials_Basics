package com.kishore.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishore.service.models.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student, Integer> {

}
