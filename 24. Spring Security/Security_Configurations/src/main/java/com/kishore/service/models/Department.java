package com.kishore.service.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String department_name;

	private Set<Student> students = new HashSet<Student>();

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer id, String department_name, Set<Student> students) {
		super();
		this.id = id;
		this.department_name = department_name;
		this.students = students;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "department_name")
	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", department_name=" + department_name + ", students=" + students + "]";
	}

}
