package com.corejava.variabledatatype;

public class CharacterDataType
{
	public static void main(String args[])
	{
		System.out.println("------------- Convert Charcter into String -------------");
		convertToString();
	}

	/**
	 * Convert different types of data into String.
	 */
	public static void convertToString()
	{
		char c = 'D';
		char[] charArray = { 'D', 'I', 'V', 'Y', 'A' };
		int intVal = 10;
		long longVal = 8965l;
		float floatVal = 56.8f;
		double doubleVal = 78.415d;

		System.out.println("Convert Character Data Type into String using toString(): " + Character.toString(c));
		System.out.println("Convert Character Data Type into String using valueOf(): " + String.valueOf(c));
		System.out
				.println("Convert Character Array Data Type into String using valueOf(): " + String.valueOf(charArray));
		System.out.println("Convert Character Array Data Type into String using toString(): " + new String(charArray));
		System.out.println("Convert Integer Data Type into String using valueOf(): " + String.valueOf(intVal));
		System.out.println("Convert Integer Data Type into String using toString(): " + Integer.toString(intVal));
		System.out.println("Convert Long Data Type into String using valueOf(): " + String.valueOf(longVal));
		System.out.println("Convert Float Data Type into String using valueOf(): " + String.valueOf(floatVal));
		System.out.println("Convert Double Data Type into String using valueOf(): " + String.valueOf(doubleVal));
	}
}
