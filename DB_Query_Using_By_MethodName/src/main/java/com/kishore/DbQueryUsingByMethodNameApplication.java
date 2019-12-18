package com.kishore;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.business.interfaces.EmployeeBussinessInterface;
import com.kishore.model.Employee;

@SpringBootApplication
public class DbQueryUsingByMethodNameApplication implements CommandLineRunner {

	@Autowired
	private EmployeeBussinessInterface employeeBussinessInterface;

	public static void main(String[] args) {
		SpringApplication.run(DbQueryUsingByMethodNameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Getting by one parameter
		createEmployees();
		getEmployeeByDepartment();
		getEmployeeByLastNameOrDegree();
	}

	private void createEmployees() {
		List<Employee> emp_list = Arrays.asList(new Employee(1, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(2, "Arumugam", "N", "Mech", "BE"), new Employee(3, "Shantha", "Arumugam", "History", "BA"),
				new Employee(4, "Sudha", "A", "CS", "MCA"), new Employee(5, "Roshini", "Kishore", "ECE", "BE"),
				new Employee(6, "Ram", "Kumar", "CS", "ME"), new Employee(7, "Krishna", "Swamy", "CS", "ME"));

		employeeBussinessInterface.createEmployees(emp_list);
	}

	private void getEmployeeByLastNameOrDegree() {
		List<Employee> emp_List = employeeBussinessInterface.getEmployeeByLastNameOrDegree("Kumar", "BE");
		System.out.println("----------------------------------------------------");
		emp_List.forEach(System.out::println);
	}

	private void getEmployeeByDepartment() {
		List<Employee> emp_List = employeeBussinessInterface.getEmployeeByDepartment("CS");
		emp_List.forEach(System.out::println);
	}

}
