package com.employee;

public abstract class Employee {
	String name;
	int n;
	public Employee(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract double weeklyPay(int hoursWorked);
}
