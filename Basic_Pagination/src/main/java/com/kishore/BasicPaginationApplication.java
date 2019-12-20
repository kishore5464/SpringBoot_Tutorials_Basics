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
public class BasicPaginationApplication implements CommandLineRunner {

	@Autowired
	EmployeeBussinessInterface employeeBussinessInterface;

	public static void main(String[] args) {
		SpringApplication.run(BasicPaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insertEmployees();
	}

	private void insertEmployees() {
		List<Employee> employeesList = Arrays.asList(new Employee(1, "Kishore", "Kumar", "Male"),
				new Employee(2, "Roshini", "Kishore", "Female"), new Employee(3, "Shantha", "Arumugam", "Female"),
				new Employee(4, "Sudha", "S", "Female"), new Employee(5, "Arumugam", "N", "Male"),
				new Employee(6, "Vishnu", "G", "Male"), new Employee(7, "Jansi", "R", "Female"),
				new Employee(8, "Kalpana", "C", "Female"), new Employee(9, "Ajay", "Kumar", "Male"),
				new Employee(10, "Gokul", "T", "Male"), new Employee(11, "Gowtham", "G", "Male"),
				new Employee(12, "Divya", "Priya", "Female"), new Employee(13, "Ramya", "A", "Female"),
				new Employee(14, "Viwsa", "N", "Male"), new Employee(15, "Jegan", "N", "Male"));

		employeeBussinessInterface.insertEmployees(employeesList);
	}

}
