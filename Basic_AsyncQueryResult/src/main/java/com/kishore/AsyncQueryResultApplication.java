package com.kishore;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.concurrent.ListenableFuture;

import com.kishore.business.interfaces.EmployeeBussinessInterface;
import com.kishore.model.Employee;

@SpringBootApplication
//@EnableAsync
public class AsyncQueryResultApplication implements CommandLineRunner {

	@Autowired
	private EmployeeBussinessInterface employeeBussinessInterface;

	public static void main(String[] args) {
		SpringApplication.run(AsyncQueryResultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insertEmployees();
		findByFirstName("Roshini");
	}

	private void findByFirstName(String firstName) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
//		Future<Employee> empList = employeeBussinessInterface.findByFirstName(firstName);

//		CompletableFuture<Employee> empList = employeeBussinessInterface.findByFirstName(firstName);

		ListenableFuture<Employee> empList = employeeBussinessInterface.findByFirstName(firstName);

		Employee emp = empList.get(1, TimeUnit.SECONDS);
		if (empList.isDone()) {
			System.out.println("Employee => " + emp.toString() + "\n");
		}
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