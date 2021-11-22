package com.employee;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
			
		System.out.println( "Employee Wage computation for multiple companies");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" \n -------------------------------- \n Enter total number of Companies you want to add : ");
		int nComp=sc.nextInt();
		Employee ec = new Employee();
		
		
		for(int i=0;i<nComp;i++) {
			sc.nextLine(); 

			System.out.print(" \n Enter the name of Company : ");
			String name = sc.nextLine();
			
			System.out.print(" \n Enter the maximum working days of Company : ");
			int no_of_days=sc.nextInt();
			
			System.out.print(" \n Enter maximum working hours for month in the Company : ");
			int max_hours_in_month=sc.nextInt();
			
			System.out.print(" \n Enter the wage per hour of Company : ");
			int wages_per_hour=sc.nextInt();
			
			int wagePerMonth = ec.employeeWage(name, no_of_days, max_hours_in_month, wages_per_hour);
			System.out.println(" \n Employee wage per month= "+wagePerMonth);
		}
		
		sc.close();
	
}
}
