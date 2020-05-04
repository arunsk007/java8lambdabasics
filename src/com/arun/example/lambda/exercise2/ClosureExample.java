package com.arun.example.lambda.exercise2;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		// effectively final
		int b = 20;
		// the variable b doesn't have to be declared as final, 
		// but the constant value of 20 will passed on to the Process
		// interface. 20 is the value of the variable b in scope, ie coming from the closure.
		// for this lambda, whereever it is used, the value will always be 20.
		// eg of a function passed as value.
		doProcess(a, i -> System.out.println(i+b));
		
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process{
	void process(int i);
}
