package com.arun.example.lambda.exercise3;

public class MethodReference1 {

	public static void main(String[] args) {
//		Thread t = new Thread(() -> printMessage());
		Thread t = new Thread(MethodReference1::printMessage);
		t.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello Method Reference !");
	}

}
