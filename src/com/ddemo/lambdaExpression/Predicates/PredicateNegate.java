package com.ddemo.lambdaExpression.Predicates;

import java.util.function.Predicate;

public class PredicateNegate {

	public static void main(String[] args) {

		int a[] = { 12, 12, 13, 56, 45, 65, 90, 78, 43, 56, 22 };

		Predicate<Integer> even = b -> b % 2 != 0;
		// Predicate<Integer> cond = b -> b > 20;

		for (int i : a) {

			if (even.negate().test(i)) {

				System.out.println(i);

			}
		}

	}

}
