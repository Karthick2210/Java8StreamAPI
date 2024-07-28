package com.ddemo.lambdaExpression.Consumers;

import java.util.function.Consumer;

public class demo {

	public static void main(String[] args) 
	{
		Consumer<String> con = n->System.out.println("Consumer Value--"+n);
		con.accept("Welcome");
	}
	
}
