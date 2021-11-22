package com.employee;

public class Main {
	public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation Program");
	Employee ec = new Employee();
	int wagePerMonth = ec.employeeWage();
	System.out.println(" Total wage for a month is: "+wagePerMonth);
}
}
