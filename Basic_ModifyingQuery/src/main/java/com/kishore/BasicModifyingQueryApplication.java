package com.kishore;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.business.interfaces.EmployeeBussinessInterface;
import com.kishore.model.Employee;

@SpringBootApplication
public class BasicModifyingQueryApplication implements CommandLineRunner {

	@Autowired
	private EmployeeBussinessInterface employeeBussinessInterface;

	public static void main(String[] args) {
		SpringApplication.run(BasicModifyingQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insertEmployees();
		getEmployeeBeforeUpdate(10);
		updateEmployeeLastName(10, "Thaniga Arasu");
		getEmployeeAfterUpdate(10);
	}
	
	private void insertEmployees() {
		List<Employee> employeesList = Arrays.asList(new Employee(1, "Kishore", "Kumar", "Male"),
				new Employee(2, "Roshini", "Kishore", "Female"), new Employee(3, "Shantha", "Arumugam", "Female"),
				new Employee(4, "Sudha", "S", "Female"), new Employee(5, "Arumugam", "N", "Male"),
				new Employee(6, "Vishnu", "G", "Male"), new Employee(7, "Jansi", "R", "Female"),
				new Employee(8, "Kalpana", "C", "Female"), new Employee(9, "Ajay", "Kumar", "Male"),
				new Employee(10, "Gokul", "T", "Male"), new Employee(11, "Gowtham", "G", "Male"),
				new Employee(12, "Divya", "Priya", "Female"), new Employee(13, "Ramya", "A", "Female"));

		employeeBussinessInterface.insertEmployees(employeesList);
	}

	private void getEmployeeBeforeUpdate(Integer id) {
		Optional<Employee> emp = employeeBussinessInterface.getEmployeeBeforeUpdate(id);
		System.out.println("\n\nEmployee Details Before Update is: \n"+emp.get().toString());
		System.out.println("----------------------------------------------------------\n");
	}

	private void updateEmployeeLastName(Integer id, String lastName) {
		employeeBussinessInterface.updateEmployeeLastName(id, lastName);
	}

	private void getEmployeeAfterUpdate(Integer id) {
		Optional<Employee> emp = employeeBussinessInterface.getEmployeeAfterUpdate(id);
		System.out.println("\nEmployee Details After Update is: \n"+emp.get().toString());
		System.out.println();
	}

}