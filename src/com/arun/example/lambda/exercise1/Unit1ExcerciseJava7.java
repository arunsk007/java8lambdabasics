package com.arun.example.lambda.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens",70),
				new Person("Lewis", "Caroll",50),
				new Person("Barack", "Obama",60),
				new Person("Donald", "Trump",75),
				new Person("Matt", "Casedy",72)
				);
		
		// Step 1: Sort list by lastname
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Step 2: Create a method that prints all elements in the list
		printAll(people);
		
		System.out.println("----------------------------------");
		// Step 3: Print All people that have lastname beginning with C
		printConditionally(people, new Condition() {			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}			
		});
		
	}
	
	public static void printAll(List<Person> people) {
		for(Person person: people) {
			System.out.println(person.toString());
		}
	}
	
	public static void printConditionally(List<Person> people, Condition condition) {
		for(Person person: people) {
			if(condition.test(person)) {
				System.out.println(person.toString());
			}
		}
	}
	


}

interface Condition{	
	boolean test(Person p);	
}
