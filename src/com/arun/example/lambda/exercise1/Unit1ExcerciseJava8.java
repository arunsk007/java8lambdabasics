package com.arun.example.lambda.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcerciseJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens",70),
				new Person("Lewis", "Caroll",50),
				new Person("Barack", "Obama",60),
				new Person("Donald", "Trump",75),
				new Person("Matt", "Casedy",72)
				);
		
		// Step 1: Sort list by lastname
		Collections.sort(people,(o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		printConditionally(people, p -> true);
		
		System.out.println("----------------------------------");
		// Step 3: Print All people that have lastname beginning with C
		printConditionally(people, p -> (p.getLastName().startsWith("C")));
		
	}
	
	public static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person person: people) {
			if(predicate.test(person)) {
				System.out.println(person.toString());
			}
		}
	}
	


}
// Removing this interface to replace it with java.util.function.Predicates
/*interface Condition{	
	boolean test(Person p);	
}*/
