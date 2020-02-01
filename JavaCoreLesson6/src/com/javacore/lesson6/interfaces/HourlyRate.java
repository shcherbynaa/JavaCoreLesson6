package com.javacore.lesson6.interfaces;
public class HourlyRate implements Salary{

	@Override
	public double salary(int hours, double hourlyRate) {
		return hours*hourlyRate;
		
	}

}
