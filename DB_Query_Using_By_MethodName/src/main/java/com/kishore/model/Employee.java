package com.kishore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String first_Name;
	private String last_Name;
	private String department;
	private String degree;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String first_Name, String last_Name, String department, String degree) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.department = department;
		this.degree = degree;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "first_Name")
	public String getFirstName() {
		return first_Name;
	}

	public void setFirstName(String first_Name) {
		this.first_Name = first_Name;
	}

	@Column(name = "last_Name")
	public String getLastName() {
		return last_Name;
	}

	public void setLastName(String last_Name) {
		this.last_Name = last_Name;
	}

	@Column(name = "department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "degree")
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", department="
				+ department + ", degree=" + degree + "]";
	}

}
