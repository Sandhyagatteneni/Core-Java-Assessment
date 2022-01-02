package com.employee;

public class Regular extends Employee {
	
	private int hours=40;
	
	public Regular(String name) {
		super(name);
	}

	@Override
	double weeklyPay(int hoursWorked) {
		int salary = hours*100;
		return salary;
	}
	
}

