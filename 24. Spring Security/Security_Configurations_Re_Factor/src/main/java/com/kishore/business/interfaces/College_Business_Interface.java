package com.kishore.business.interfaces;

import java.util.List;

import com.kishore.service.models.Department;
import com.kishore.service.models.Student;

public interface College_Business_Interface {

	public List<Student> findAllStudent();

	public Student findStudentById(Integer student_Id);

	public List<Department> findAllDepartment();

	public Department findDepartmentById(Integer department_Id);

	public void createDepartmentAndStudent(Department department, Student student);

}
