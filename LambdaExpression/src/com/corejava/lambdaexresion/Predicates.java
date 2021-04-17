package com.corejava.lambdaexresion;

import java.util.function.IntPredicate;

public class Predicates
{
	public static void main(String[] args)
	{
		// IntPredicate w/o using lambda expression
		IntPredicate voterIDAge = new IntPredicate() {

			@Override
			public boolean test(int value)
			{
				if (value >= 18)
					return true;
				else
					return false;
			}
		};
		System.out.println("Age is greater than 18: " + voterIDAge.test(15));

		/// IntPredicate with using lambda expression
		IntPredicate ageLess18 = i -> i < 18;
		System.out.println("Age is less than 18: " + ageLess18.test(8));

		System.out.println("Perform logical and operation b/w two predicates: " + voterIDAge.and(ageLess18).test(8));
		System.out.println("Perform logical or operation b/w two predicates: " + voterIDAge.or(ageLess18).test(8));
	}

}
