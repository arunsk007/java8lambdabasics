package com.arun.example.lambda.exercise3;

import java.util.Arrays;
import java.util.List;

import com.arun.example.lambda.exercise1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens",70),
				new Person("Lewis", "Caroll",50),
				new Person("Barack", "Obama",60),
				new Person("Donald", "Trump",75),
				new Person("Matt", "Casedy",72)
				);
		
		// print people with lastname starting with C
		people.stream()
		.filter((p)->p.getLastName().startsWith("C"))
		.forEach(System.out::println);

	}

}
