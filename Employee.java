package com.employee;

public class Employee {

			final static int PART_TIME = 1;
			final static int FULL_TIME = 2;
			final static int PART_TIME_HOURS = 4;
			final static int FULL_TIME_HOURS = 8;
			
		public int employeeWage(String name, int no_of_days, int max_hours_in_month, int wages_per_hour) {
			int wage = 0;    
			int days = 0;    
			int hours = 0; 
			
			while (days < no_of_days && hours < max_hours_in_month) {
				int attendance = (int)Math.floor( (Math.random() * 10) % 3);
				
				switch (attendance) {
					
				case PART_TIME: 
						if (hours + PART_TIME_HOURS > 100) {
							break;
						}
						hours += PART_TIME_HOURS;
						days++;
						break;
				case FULL_TIME:
						if (hours + FULL_TIME_HOURS > 100) {
							break;
						}
						hours += FULL_TIME_HOURS;
						days++;
						break;		
				}
				
			
			}
			wage = hours * wages_per_hour;
			System.out.println(" TOTAL WORKING DAYS = " + days);
			System.out.println(" TOTAL WORKING HOURS = " + hours);
			 return wage;
	}
			

}