package com.arun.example.lambda.exercise2;

import java.util.function.BiConsumer;

public class ExceptionHandlerWrapper {

	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key =0;
		
		process(someNumbers, key, wrapperLambda((a,b) -> System.out.println(a/b)));
	}



	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i:someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {		
		return (v,k) -> {
			try {
				System.out.println("Inside wrapperLambda");
				biConsumer.accept(v, k);
			}catch(ArithmeticException ae) {
				System.out.println("ArithmeticException occured for "+v+" / "+k); 
			}
		};

	}
	
	

}
