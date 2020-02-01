package com.lgs.lab.interface2;

public class Application {
	public static void main (String[] args) {
		
		MyCalculator myCalculator = new MyCalculator();
		System.out.println(myCalculator.plus(10, 5));
		System.out.println(myCalculator.minus(10, 5));
		System.out.println(myCalculator.multiply(10, 5));
		System.out.println(myCalculator.devide(10, 5));
	}
}
