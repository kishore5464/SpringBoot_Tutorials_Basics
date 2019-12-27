package com.kishore.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishore.business.interfaces.College_Business_Interface;
import com.kishore.service.models.Department;
import com.kishore.service.models.Student;
import com.kishore.student.repository.Department_Repository;
import com.kishore.student.repository.Student_Repository;

@Service
public class College_Business_Impl implements College_Business_Interface {

	@Autowired
	private Student_Repository student_Repository;

	@Autowired
	private Department_Repository department_Repository;

	@Override
	public List<Student> findAllStudent() {
		return student_Repository.findAll();
	}

	@Override
	public Student findStudentById(Integer student_Id) {
		return student_Repository.getOne(student_Id);
	}

	@Override
	public List<Department> findAllDepartment() {
		return department_Repository.findAll();
	}

	@Override
	public Department findDepartmentById(Integer department_Id) {
		return department_Repository.getOne(department_Id);
	}

}
