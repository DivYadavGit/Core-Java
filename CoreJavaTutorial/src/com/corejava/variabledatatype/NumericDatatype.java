package com.corejava.variabledatatype;

public class NumericDatatype
{
	public static void main(String args[])
	{
		System.out.println("_____________________Operations with Integer______________________");
		int intNo1 = 2147483647, intNo2 = 15;
		intOperations(intNo1, intNo2);

		System.out.println("_____________________Operations with Long______________________");
		long longNo1 = 9223372036854775807L, longNo2 = 153l;
		longOperations(longNo1, longNo2);

		System.out.println("_____________________Operations with Float______________________");
		float floatNo1 = 100f, floatNo2 = 3.3F;
		floatOperations(floatNo1, floatNo2);

		System.out.println("_____________________Operations with Double______________________");
		double doubleNo1 = 1000.00D, doublNo2 = 33.3d;
		doubleOperations(doubleNo1, doublNo2);
		
		System.out.println("_____________________Min Max Values of Numeric Datatype______________________");
		minMaxValues();
		
		System.out.println("_____________________Implicit Type Casting______________________");
		implicitTypeCasting();
		
		System.out.println("_____________________Explicit Type Casting______________________");
		explicitTypeCasting();
	}

	/**
	 * It performs Arithmetic operations with integer nos Only division, modulo and
	 * subtraction result are correct, for multiplication & addition it gives some
	 * weird output because of it exceeds integer max. limit.
	 * 
	 * @param no1
	 * @param no2
	 */
	public static void intOperations(int no1, int no2)
	{
		int resAdd, resMul, resSub, resDiv, resMod;

		resAdd = no1 + no2;
		System.out.println("Addition of two Integer numbers : " + resAdd);

		resMul = no1 * no2;
		System.out.println("Multiplication of two Integer numbers : " + resMul);

		resSub = no1 - no2;
		System.out.println("Substraction of two Integer numbers : " + resSub);

		resDiv = no1 / no2;
		System.out.println("Division of two Integer numbers : " + resDiv);

		resMod = no1 % no2;
		System.out.println("Modulo of two Integer numbers : " + resMod);
	}
	
	/**
	 * It performs Arithmetic operations with integer nos Only division, modulo
	 * and subtraction result are correct, for multiplication & addition it
	 * gives some weird output because of it exceeds integer max. limit.
	 * 
	 * @param no1
	 * @param no2
	 */
	public static void longOperations(long no1, long no2)
	{
		long resAdd, resMul, resSub, resDiv, resMod;

		resAdd = no1 + no2;
		System.out.println("Addition of two Long numbers : " + resAdd);

		resMul = no1 * no2;
		System.out.println("Multiplication of two Long numbers : " + resMul);

		resSub = no1 - no2;
		System.out.println("Substraction of two Long numbers : " + resSub);

		resDiv = no1 / no2;
		System.out.println("Division of two Long numbers : " + resDiv);

		resMod = no1 % no2;
		System.out.println("Modulo of two Long numbers : " + resMod);
	}
	
	/**
	 * It performs Arithmetic operations with integer nos.
	 * It has 7 decimal places.
	 * @param no1
	 * @param no2
	 */
	public static void floatOperations(float no1, float no2)
	{
		float resAdd, resMul, resSub, resDiv, resMod;

		resAdd = no1 + no2;
		System.out.println("Addition of two Float numbers : " + resAdd);

		resMul = no1 * no2;
		System.out.println("Multiplication of two Float numbers : " + resMul);

		resSub = no1 - no2;
		System.out.println("Substraction of two Float numbers : " + resSub);

		resDiv = no1 / no2;
		System.out.println("Division of two Float numbers : " + resDiv);

		resMod = no1 % no2;
		System.out.println("Modulo of two Float numbers : " + resMod);
	}
	
	/**
	 * It performs Arithmetic operations with integer nos.
	 * It has 16 decimal places.
	 * @param no1
	 * @param no2
	 */
	public static void doubleOperations(double no1, double no2)
	{
		double resAdd, resMul, resSub, resDiv, resMod;

		resAdd = no1 + no2;
		System.out.println("Addition of two Double numbers : " + resAdd);

		resMul = no1 * no2;
		System.out.println("Multiplication of two Double numbers : " + resMul);

		resSub = no1 - no2;
		System.out.println("Substraction of two Double numbers : " + resSub);

		resDiv = no1 / no2;
		System.out.println("Division of two Double numbers : " + resDiv);

		resMod = no1 % no2;
		System.out.println("Modulo of two Double numbers : " + resMod);
	}
	
	/**
	 * Print minimum & maximum values of numeric data type
	 */
	public static void minMaxValues()
	{
		System.out.println("Minimum value of byte : " + Byte.MIN_VALUE);
		System.out.println("Maximum value of byte : " + Byte.MAX_VALUE);
		System.out.println("==========================================");

		System.out.println("Minimum value of short : " + Short.MIN_VALUE);
		System.out.println("Maximum value of short : " + Short.MAX_VALUE);
		System.out.println("==========================================");

		System.out.println("Minimum value of integer : " + Integer.MIN_VALUE);
		System.out.println("Maximum value of integer : " + Integer.MAX_VALUE);
		System.out.println("==========================================");

		System.out.println("Minimum value of long : " + Long.MIN_VALUE);
		System.out.println("Maximum value of long : " + Long.MAX_VALUE);
		System.out.println("==========================================");

		System.out.println("Minimum value of float : " + Float.MIN_VALUE);
		System.out.println("Maximum value of float : " + Float.MAX_VALUE);
		System.out.println("==========================================");

		System.out.println("Minimum value of double : " + Double.MIN_VALUE);
		System.out.println("Maximum value of double : " + Double.MAX_VALUE);
	}
	
	
	/**
	 * Implicit type casting for numeric data type.
	 * Casting will automatically done where the smaller data type convert into larger data type.
	 */
	public static void implicitTypeCasting()
	{
		byte byteVal = 78;
		short shortVal = 45, convertedValShort;
		int intVal = 10, convertedValInt;
		long longVal = 15L, convertIntLong;
		float floatVal = 18.96f, convertedValFloat;
		double convertedValDouble, convertValLong;
		
		convertedValShort = byteVal;
		System.out.println("Convert Byte data type into Short data type: " + convertedValShort);

		convertedValInt = shortVal;
		System.out.println("Convert Short data type into Integer data type: " + convertedValInt);

		convertIntLong = intVal;
		System.out.println("Convert Integer data type into Long data type: " + convertIntLong);

		convertedValFloat = longVal;
		System.out.println("Convert Long data type into Float data type: " + convertedValFloat);

		convertedValDouble = floatVal;
		System.out.println("Convert Float data type into Double data type: " + convertedValDouble);
		
		convertValLong = longVal;
		System.out.println("Convert Long data type into Double data type: " + convertValLong);
	}
	
	/**
	 * Explicit type casting for numeric data type. Casting need to be do by
	 * manually where the larger data type convert into smaller data type.
	 */
	public static void explicitTypeCasting()
	{
		byte convertedByteVal;
		short shortVal = 98, convertedShortVal;
		int intVal = 18, convertedIntVal;
		long longVal = 86, convertedLongVal, convertdoubleVal;
		float floatVal = 45.8556f, convertedFloatVal;
		double doubleVal = 857.45d;

		convertedByteVal = (byte) shortVal;
		System.out.println("Convert Short data type into Byte data type: " + convertedByteVal);

		convertedShortVal = (short) intVal;
		System.out.println("Convert Short data type into Byte data type: " + convertedShortVal);

		convertedIntVal = (int) longVal;
		System.out.println("Convert Short data type into Byte data type: " + convertedIntVal);

		convertedLongVal = (long) floatVal;
		System.out.println("Convert Short data type into Byte data type: " + convertedLongVal);

		convertedFloatVal = (float) doubleVal;
		System.out.println("Convert Short data type into Byte data type: " + convertedFloatVal);

		convertdoubleVal = (long) doubleVal;
		System.out.println("Convert Double data type into Long data type: " + convertdoubleVal);
	}
}
