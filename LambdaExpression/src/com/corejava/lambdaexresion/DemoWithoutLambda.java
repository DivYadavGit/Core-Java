package com.corejava.lambdaexresion;

interface Demo
{
	public void printInfo();
}

/**
 * Implement interface and add function definition.
 * @author User
 */
class DemoApp implements Demo
{
	@Override
	public void printInfo()
	{
		System.out.println("Statement print from class");
	}
}

public class DemoWithoutLambda
{

	public static void main(String[] args)
	{
		Demo demo1 = new DemoApp();
		demo1.printInfo();

		// Initialize resource of interface and add function definition directly.
		Demo demo2 = new Demo() {

			@Override
			public void printInfo()
			{
				System.out.println("Statement print directly from Interface");
			}
		};

		demo2.printInfo();
	}
}
