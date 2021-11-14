package com.employee;

public class Employee {
	public static void main(String[] args) {
		int attendance = (int)Math.floor( (Math.random()*3));
		int wages = 20;
		int Monthly_Working_Days = 20;
		switch (attendance) {
		case 0:
			int empHrs = 4;
			System.out.println("Employee is Present and done Part Time: \n Monthly Wage is " + empHrs*wages*Monthly_Working_Days);
		break;
		case 1:
			int empHr= 8;
			System.out.println(" Employee is Present and done Full Time: \n Monthly Wage is " + empHr*wages*Monthly_Working_Days);
		break;
		case 2:
			System.out.println(" Employee is absent \n Monthly Wage is 0 ");
		break;
	  }
	}
}
