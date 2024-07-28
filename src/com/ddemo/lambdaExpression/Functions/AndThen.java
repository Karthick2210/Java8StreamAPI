package com.ddemo.lambdaExpression.Functions;

import java.util.function.Function;

public class AndThen {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n -> n * 2;
		Function<Integer, Integer> f1 = n -> n * n*n;
		System.out.println(f.andThen(f1).apply(2));
	}

}
