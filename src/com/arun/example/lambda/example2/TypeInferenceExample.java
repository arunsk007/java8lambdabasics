package com.arun.example.lambda.example2;

public class TypeInferenceExample {
	
	public static void main(String args[]) {
		
		StringLengthLamda myLambda1 = (String s) -> s.length();
		System.out.println("State1 : "+myLambda1.getLength("Arun"));
		
		// Removed input argument type since compiler have the required implementation information
		StringLengthLamda myLambda2 = (s) -> s.length();
		System.out.println("State2 : "+myLambda2.getLength("Arun"));
		
		// Since there is only 1 parameter, no need to have parenthesis
		StringLengthLamda myLambda3 = s -> s.length();
		System.out.println("State3 : "+myLambda3.getLength("Arun"));
	}
	
	interface StringLengthLamda {
		int getLength(String string);
	}

}
