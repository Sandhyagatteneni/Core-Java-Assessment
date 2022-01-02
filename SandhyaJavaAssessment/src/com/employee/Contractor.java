package com.employee;

public class Contractor extends Employee {
	
	double hourlyWage; 
	private int rate=100, excessHoursWorked;
	
	public Contractor(String name) {
		super(name);
	}

	@Override
	double weeklyPay(int hoursWorked) {
		hourlyWage = hoursWorked * rate;
		
		if(hoursWorked > 40) 
			excessHoursWorked = hoursWorked-40;
		
			hourlyWage = hourlyWage + excessHoursWorked * rate * 0.5;
		
		return hourlyWage;
	}
}
