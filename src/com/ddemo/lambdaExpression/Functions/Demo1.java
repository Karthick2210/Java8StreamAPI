package com.ddemo.lambdaExpression.Functions;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f = n -> n * n;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		System.out.println(f.apply(7));
		System.out.println(f.apply(6));
	}

}
