package com.arun.example.lambda.exercise3;

import java.util.Arrays;
import java.util.List;

import com.arun.example.lambda.exercise1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens",70),
				new Person("Lewis", "Caroll",50),
				new Person("Barack", "Obama",60),
				new Person("Donald", "Trump",75),
				new Person("Matt", "Casedy",72)
				);
		
		// normal for loop
		System.out.println("Normal For Loop");
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i));
		}
		
		// normal for in loop
		System.out.println("Enhanced For Loop");
		for(Person p: people) {
			System.out.println(p);
		}
		
		// normal for each loop
		System.out.println("Internal foreach loop");
		people.forEach(System.out::println);

	}

}
