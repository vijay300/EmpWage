package com.practice;

public class EmpWageBuilderUc1 {
	public static final int IS_FULL_TIME =2;
	public static final int IS_PART_TIME =1;
	public static final int EMP_RATE_PER_HOUR =20;
	public static final int NO_OF_WORKING_DAYS =20;  
	public static void main(String[] args) {
		  
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		for(int day=0; day<NO_OF_WORKING_DAYS; day++) 
		{
			double empCheck =  Math.floor(Math.random()*10)%3;// for 0,1,2
		
			switch ((int)empCheck) {
		    	case IS_FULL_TIME:
		    		empHrs=8;
		    		System.out.println("Employee is present for full time on day "+day);
		    		break;
		    	case IS_PART_TIME: 
		    		empHrs=4;
		    		System.out.println("Employee is present for part time on day "+day);
		    		break;
		    	default: 
		    		empHrs=0;
		    		System.out.println("Employee is absent on day "+day);
			}
			
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage=totalEmpWage+empWage;
			System.out.println("Emp Wage per day: "+empWage);
		}
		System.out.println("Total Emp Wage: "+totalEmpWage);
	}
}

