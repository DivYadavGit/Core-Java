package com.corejava.lambdaexresion;

interface LambdaDemo
{
	public void printInfo();
}

public class LambdaExpressionDemo
{
	public static void main(String args[])
	{
		// Lambda expression with single statement
		LambdaDemo demo1 = () -> System.out.println("Print statement using Lambda Expression.");
		demo1.printInfo();
		
		//This kind of scenario also work
		LambdaDemo demo = (() -> System.out.println("Print statement using Lambda Expression.")); 
		demo.printInfo();
		
		// Lambda expression with multiple statement
		LambdaDemo demo2 = () -> {
			System.out.println("Statement1");
			System.out.println("Statement2");
			System.out.println("Statement3");
		};
		demo2.printInfo();
	}
}
