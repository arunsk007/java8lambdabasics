package com.arun.example.lambda;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World! from HelloWorldGreeting");
	}

}
