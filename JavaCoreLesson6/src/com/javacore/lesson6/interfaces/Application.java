package com.javacore.lesson6.interfaces;
public class Application {

	public static void main(String[] args) {
		HourlyRate hr = new HourlyRate();
		MonthlyRate mr = new MonthlyRate();
		
		System.out.println("Employer with hourly rate has: " + hr.salary(160, 20) + "§/month");
		System.out.println("Employer with montly rate has: " + hr.salary(1, 2000) + "§/month");

	}
}
