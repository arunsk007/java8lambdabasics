package com.arun.example.lambda.exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.arun.example.lambda.exercise1.Person;

public class Unit2ExcerciseJava8 {

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
		printConditionally(people, p -> true, p -> System.out.println(p));
		
		System.out.println("----------------------------------");
		// Step 3: Print All people that have lastname beginning with C
		printConditionally(people, p -> (p.getLastName().startsWith("C")), p -> System.out.println(p.getLastName()));
		
	}
	
	public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person person: people) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
	


}
// Removing this interface to replace it with java.util.function.Predicates
/*interface Condition{	
	boolean test(Person p);	
}*/
