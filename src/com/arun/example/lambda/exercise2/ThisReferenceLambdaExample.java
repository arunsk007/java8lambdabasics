package com.arun.example.lambda.exercise2;

public class ThisReferenceLambdaExample {
	
	public void doProcess(int i, Process p){
		p.process(i);
	}
	
	public static void main(String[] args) {
		ThisReferenceLambdaExample thisRefExample = new ThisReferenceLambdaExample();
		
		// this reference cannot be used inside lambda in a static block.
		/*thisRefExample.doProcess(10, i -> {
			System.out.println("Value of i is "+i);
			System.out.println(this);
		});*/
		
		thisRefExample.execute();

	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is "+i);
			System.out.println(this);
		});
	}
	
	public String toString() {
		return "ThisReferenceLambdaExample Class";
	}

}
