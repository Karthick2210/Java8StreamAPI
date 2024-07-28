package com.ddemo.lambdaExpression;

@FunctionalInterface
interface Ola
{
	public void bookOla(String source , String destination); 	
}

public class AcceptingArgs {
	
	public static void main(String[] args) {
		
		Ola ola = (source,destination)-> System.out.println("Ola is booked from "+source+" to "+destination);
		ola.bookOla("Mysore", "Bangalore");
		
	}

}
