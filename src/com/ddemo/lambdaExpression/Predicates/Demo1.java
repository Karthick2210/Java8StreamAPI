package com.ddemo.lambdaExpression.Predicates;

import java.util.function.Predicate;

public class Demo1 {

//Predicate will take only 1 args and return Boolean 
//When we have condition check we can use this
	public static void main(String[] args) {

		/* Example 1 for Integer */
		Predicate<Integer> predicate = i -> (i >= 10);
		System.out.println(predicate.test(10));// true
		System.out.println(predicate.test(1));// false

		/* Example 2 for String */
		Predicate<String> sq = s -> (s.length() > 3);
		System.out.println(sq.test("Bang"));

		/* Example 3 Array Elements whose size is grater than 4 */

		String[] name = { "Karthick", "Kavin", "Arn", "Aravind" };

		Predicate<String> arr = i -> (i.length() > 4);
		for (String Names : name) {

			if (arr.test(Names)) {

				System.out.println(Names);
				// Advantage include all the condition in one lambda expression and execute at a
				// time

			}

		}

	}

}
