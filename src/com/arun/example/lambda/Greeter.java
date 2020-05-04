package com.arun.example.lambda;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		// OOP Concept - Implementation using Interface Implementation
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		helloWorldGreeting.perform();
		
		Greeting lambdaFunction = () -> System.out.println("Hello World! from LambdaFunction");
		lambdaFunction.perform();
		
		Greeting anonymousInnerClass = new Greeting() {			
			@Override
			public void perform() {
				System.out.println("Hello World! from AnonymousInnerClass");
				
			}
		};
		anonymousInnerClass.perform();
		
		//Any method that accept the interface can be also be used 
		System.out.println("--------------------------------------------");
		System.out.println("From a method that accept the interface type");
		System.out.println("--------------------------------------------");
		greeter.greet(helloWorldGreeting);
		greeter.greet(lambdaFunction);
		greeter.greet(anonymousInnerClass);

	}
	
/* Notes:
 * ------
 * Lambdas can do similar functions as an anonymous inner class but are never same as anonymous inner class
 * 
 */

}
