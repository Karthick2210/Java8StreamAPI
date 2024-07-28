package com.ddemo.lambdaExpression.Consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	int salary;
	String name;
	String gender;

	public Employee(int salary, String name, String gender) {
		this.salary = salary;
		this.name = name;
		this.gender = gender;
	}

}

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(50000, "Mick", "Male"));
		emp.add(new Employee(60000, "Adrin", "Female"));
		emp.add(new Employee(70000, "Rockey", "Male"));
		emp.add(new Employee(80000, "Creed", "Male"));
		emp.add(new Employee(90000, "Paul", "Male"));

		Function<Employee, Integer> fn = n -> (n.salary * 10 / 100);// task 1
		Predicate<Integer> prd = b -> b > 1000;// task2
		Consumer<Employee> con = em -> {// task3
			System.out.println("Name----" + em.name);
			System.out.println("Name----" + em.gender);
			System.out.println("Name----" + em.salary);

		};

		for (Employee employee : emp) {

			int bonus = fn.apply(employee);// Invoking Function

			if (prd.test(bonus)) {

				con.accept(employee);
				System.out.println("Name----" + bonus);

			}

		}

	}

}
