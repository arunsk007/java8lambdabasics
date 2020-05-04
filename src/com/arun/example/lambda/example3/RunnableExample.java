package com.arun.example.lambda.example3;

public class RunnableExample {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Print inside Runnable");
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(()-> System.out.println("Print inside LambdaRunnable"));
		myLambdaThread.run();
	}
	
	/*
	 *  Interfaces with one abstract method is called Functional Interfaces.
	    eg. Runnable.
	*/

}
