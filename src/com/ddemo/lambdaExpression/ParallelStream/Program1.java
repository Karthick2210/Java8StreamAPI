package com.ddemo.lambdaExpression.ParallelStream;

import java.util.Arrays;
import java.util.List;

class Student {

	int marks;
	String name;

	public Student(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}

	public int getMarks() {

		return this.marks;
	}

	public String getname() {

		return this.name;
	}

}

public class Program1 {

	public static void main(String[] args) {

		// Seaqential Stream
		List<Student> students = Arrays.asList(new Student(85, "Ajay"), new Student(90, "Abhi"),
				new Student(45, "Avik"), new Student(75, "Anik"), new Student(95, "Ashish"));

		students.stream().filter(stu -> stu.getMarks() > 85).limit(3)
				.forEach(st -> System.out.println(st.getMarks() + " " + st.getname()));

		// Parallel Stream
		students.parallelStream().filter(stu -> stu.getMarks() > 85).limit(3)
				.forEach(st -> System.out.println(st.getMarks() + " " + st.getname()));

		// Converting Normal Stream to parallel stream
		students.stream().parallel().filter(stu -> stu.getMarks() > 85).limit(3)
				.forEach(st -> System.out.println(st.getMarks() + " " + st.getname()));

	}

}
