package com.bootcamp.hr.entity;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private float salary;
	private int departmentId;
	private String departmentName;
	private String JobId;
	private String JobTitle;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName, String email, float salary, int departmentId,
			String departmentName, String jobId, String jobTitle) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		JobId = jobId;
		JobTitle = jobTitle;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getJobId() {
		return JobId;
	}

	public void setJobId(String jobId) {
		JobId = jobId;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return this.id * 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee otherEmployee = (Employee) obj;
		return this.id == otherEmployee.getId() && this.email.equals(otherEmployee.getEmail());
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", this.id, this.firstName, this.lastName, this.email, this.salary);
	}
}
