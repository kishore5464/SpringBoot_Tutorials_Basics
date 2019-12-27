package com.kishore.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kishore.business.interfaces.College_Business_Interface;
import com.kishore.service.models.Department;
import com.kishore.service.models.Student;

@RestController
@RequestMapping(value = "/college")
public class StudentController {

	@Autowired
	private College_Business_Interface student_Business_Interface;

	@GetMapping(value = "/student")
	public List<Student> allStudents() {
		return student_Business_Interface.findAllStudent();
	}

	@GetMapping(value = "/students/{student_id}")
	public Student oneStudents(@PathVariable("student_id") String student_id) {
		return student_Business_Interface.findStudentById(Integer.parseInt(student_id));
	}

	@GetMapping(value = "/department")
	public List<Department> allDepartments() {
		return student_Business_Interface.findAllDepartment();
	}

	@GetMapping(value = "/department/{department_id}")
	public Department oneDepartment(@PathVariable("department_id") String department_id) {
		return student_Business_Interface.findDepartmentById(Integer.parseInt(department_id));
	}
}
