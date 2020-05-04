package com.arun.example.lambda.exercise2;

public class ThisReferenceAnonymousInnerClass {
	
	public void doProcess(int i, Process p){
		p.process(i);
	}

	public static void main(String[] args) {
		
		ThisReferenceAnonymousInnerClass thisRefExample = new ThisReferenceAnonymousInnerClass();
		thisRefExample.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println("Value of i is "+i);
				System.out.println(this);
			}
			
			public String toString() {
				return "Process Anonymous Inner Class";
			}
		});
		

	}

}
