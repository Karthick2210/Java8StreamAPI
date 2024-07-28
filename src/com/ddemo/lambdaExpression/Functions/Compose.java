package com.ddemo.lambdaExpression.Functions;

import java.util.function.Function;

public class Compose {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n -> n * 2;
		Function<Integer, Integer> f1 = n -> n * n*n;
		System.out.println(f.compose(f1).apply(2));
	}

}
