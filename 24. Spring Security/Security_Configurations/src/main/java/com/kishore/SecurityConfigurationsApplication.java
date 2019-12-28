package com.kishore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.business.interfaces.College_Business_Interface;
import com.kishore.service.models.Department;
import com.kishore.service.models.Student;

@SpringBootApplication
public class SecurityConfigurationsApplication implements CommandLineRunner {

	@Autowired
	private College_Business_Interface college_Business_Interface;

	public static void main(String[] args) {
		SpringApplication.run(SecurityConfigurationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createDepartmentAndStudent();
	}

	private void createDepartmentAndStudent() {
		Department department = new Department();
		department.setDepartment_name("MCA");

		Student student = new Student();
		student.setName("Kishore");
		student.setEmail("kishoreroshini0107@gmail.com");
		student.setMobile(9876777787l);

		college_Business_Interface.createDepartmentAndStudent(department, student);
	}

}
