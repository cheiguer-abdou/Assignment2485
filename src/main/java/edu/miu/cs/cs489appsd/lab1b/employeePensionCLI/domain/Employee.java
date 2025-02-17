package edu.miu.cs.cs489appsd.lab1b.employeePensionCLI.domain;

import java.util.Date;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private Date employmentDate;
	private double yearlySalary;
	private PensionPlan pensionPlan;

	public Employee() {
	}


	public Employee(int employeeId, String firstName, String lastName, Date employmentDate, double yearlySalary, PensionPlan pensionPlan) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employmentDate = employmentDate;
		this.yearlySalary = yearlySalary;
		this.pensionPlan = pensionPlan;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public PensionPlan getPensionPlan() {
		return pensionPlan;
	}

	public void setPensionPlan(PensionPlan pensionPlan) {
		this.pensionPlan = pensionPlan;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
