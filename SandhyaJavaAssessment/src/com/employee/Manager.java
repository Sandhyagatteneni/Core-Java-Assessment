package com.employee;

public class Manager extends Regular {

	int bonus = 1000;
	
	public Manager(String name) {
		super(name);
	}

	@Override
	double weeklyPay(int hoursWorked) {
		return super.weeklyPay(hoursWorked)+bonus;
	}

	

}
