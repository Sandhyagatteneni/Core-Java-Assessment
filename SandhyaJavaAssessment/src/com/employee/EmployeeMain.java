package com.employee;

import java.util.Scanner;

public class EmployeeMain extends Employee {
	
	public EmployeeMain(String name) {
		super(name);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employement type : \n1.Regular\n2.Contractor\n3.Manager\n");
		int n = sc.nextInt();
		System.out.println("Enter number of hours worked : ");
		int hoursWorked = sc.nextInt();
		Regular regular = new Regular("Regular");
		Contractor contractor = new Contractor("Contractor");
		Manager manager = new Manager("Manager");
				
		switch(n) {
		case 1 :
			System.out.println("Salary of the Employee = "+ regular.weeklyPay(hoursWorked));
			break;
		case 2 :
			System.out.println("Salary of the Employee = "+ contractor.weeklyPay(hoursWorked));
			break;
		case 3 :
			System.out.println("Salary of the Employee = "+ manager.weeklyPay(hoursWorked));
			break;
		}
			
	}

	@Override
	double weeklyPay(int hoursWorked) {
		return 0;
	}
}
