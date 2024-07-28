package com.ddemo.lambdaExpression.Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	int salary;
	String name;

	public Employee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

}

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(50000, "Adrin"));
		employees.add(new Employee(30000, "Paul"));
		employees.add(new Employee(20000, "Mick"));

		Function<Employee, Integer> fn = n -> {

			int sal = n.salary;

			if (sal >= 10000 && sal <= 20000) {
				return (sal * 10 / 100);
			}
			if (sal > 20000 && sal <= 30000) {
				return (sal * 20 / 100);
			}
			if (sal > 30000 && sal <= 50000) {
				return (sal * 30 / 100);
			} else
				return (sal * 40 / 100);
		};

		Predicate<Integer> pd = k -> k > 5000;

		for (Employee employee : employees) {

			int bonus = fn.apply(employee);
			if (pd.test(bonus)) {
				System.out.println("Name----" + employee.name);
				System.out.println("Bonus---" + bonus);
			}

		}

	}

}
