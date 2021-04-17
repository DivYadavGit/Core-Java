package com.corejava.lambdaexresion;

interface LambdaParameter
{
	public void demo(int i, float f);
}

public class LamdaExpressionDemowithParameters
{

	public static void main(String[] args)
	{
		//Passing parameters through Lambda expression
		LambdaParameter para = (int i, float f) -> {
			System.out.println("Intereger value is: " + i);
			System.out.println("Float value is: " + f);
		};
		para.demo(5, 48.7f);
	}

}
