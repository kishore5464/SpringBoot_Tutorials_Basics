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
		getEmployeeByDegree();
	}

	private void createEmployees() {
		List<Employee> emp_list = Arrays.asList(new Employee(1, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(2, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(3, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(4, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(5, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(6, "Kishore", "Kumar", "CS", "MCA"),
				new Employee(7, "Kishore", "Kumar", "CS", "MCA"));
	}

	private void getEmployeeByDegree() {
		List<Employee> emp_List = employeeBussinessInterface.getEmployeeByDegree("BE");
		emp_List.forEach(System.out::println);
	}

}
