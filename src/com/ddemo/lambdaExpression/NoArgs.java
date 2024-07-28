package com.ddemo.lambdaExpression;

@FunctionalInterface
interface cabA {
	public void bookCab();

}

public class NoArgs {

	public static void main(String[] args) {
		cabA cab = () -> System.out.println("Cab is booked...");
		cab.bookCab();

	}

}
