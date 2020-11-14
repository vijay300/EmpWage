package com.practice;

public class EmpWageBuilderUc1 {
	public static void main(String[] args) {
		 final int IS_FULL_TIME =1;
		 final int EMP_RATE_PER_HOUR =20;
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%2;
	
		if (empCheck == IS_FULL_TIME) {
			empHrs=8;
			System.out.println("Employee is present");
		}
		else {
			empHrs=0;
			System.out.println("Employee is absent");
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}

}
