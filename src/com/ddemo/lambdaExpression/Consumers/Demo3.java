package com.ddemo.lambdaExpression.Consumers;

import java.util.function.Consumer;

//Consumer Chaining
public class Demo3 {

	public static void main(String[] args) {

		Consumer<String> con = n -> System.out.println(n + "  is white color");
		Consumer<String> con1 = n -> System.out.println(n + "  Has 4 legs ");
		Consumer<String> con2 = n -> System.out.println(n + "  Has 1 tail");

		con.andThen(con1).andThen(con2).accept("Cow");
	}

}
