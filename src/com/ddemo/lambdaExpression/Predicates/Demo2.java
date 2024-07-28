package com.ddemo.lambdaExpression.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
 Lambda expression for Objects
 */

class Employee {

	String name;
	int salary;
	int experiance;

	public Employee(String name, int salary, int experiance) {
		this.name = name;
		this.salary = salary;
		this.experiance = experiance;
	}

}

public class Demo2 {

	public static void main(String[] args) {

		Employee employee = new Employee("Karthick", 50000, 3);

		Predicate<Employee> emp = e -> (e.salary <= 50000 && e.experiance <= 4);

		// System.out.println(emp.test(employee));

		// Checking for Multiple Objects

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Karthick", 50000, 4));
		al.add(new Employee("Kiran", 90000, 4));
		al.add(new Employee("Aeun", 50000, 5));
		al.add(new Employee("Anil", 1000, 1));
		al.add(new Employee("Abhi", 40000, 3));

		for (Employee employee2 : al) {

			if (emp.test(employee)) {

				System.out.println(" Name " + employee2.name + " Salary " + employee2.salary);

			}

		}

	}

}
