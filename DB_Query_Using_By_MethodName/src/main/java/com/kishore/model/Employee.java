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
	private String first_name;
	private String last_name;
	private String department;
	private String degree;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String first_name, String last_name, String department, String degree) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
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

	@Column(name = "first_name")
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Column(name = "last_name")
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", department="
				+ department + ", degree=" + degree + "]";
	}

}
