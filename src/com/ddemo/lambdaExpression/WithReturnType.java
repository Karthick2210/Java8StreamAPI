package com.ddemo.lambdaExpression;

@FunctionalInterface
interface Uber {

	public String bookUber(String source, String destination);
}

public class WithReturnType {

	public static void main(String[] args) {

		Uber uber = (String source, String destination) -> {
			System.out.println("Uber is booked from " + source + " to " + destination);
			return ("Price is 100Rs");
		};
		System.out.println(uber.bookUber("Mys", "Bng"));

	}

}
