package com.practice;

public class EmpWageBuilderUc1 {
	public static void main(String[] args) {
		 final int IS_FULL_TIME =2;
		 final int EMP_RATE_PER_HOUR =20;
		 int IS_PART_TIME =1;
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%3;// for 0,1,2
	
		if (empCheck == IS_FULL_TIME) {
			empHrs=8;
			System.out.println("Employee is present for full time");
		}
		else if (empCheck == IS_PART_TIME) {
			empHrs=4;
			System.out.println("Employee is present for part time");
		}
		else{
			empHrs=0;
			System.out.println("Employee is absent");
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}

}
