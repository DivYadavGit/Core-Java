package com.corejava.genericsdemo;

import java.util.LinkedList;
import java.util.List;

class GenericMethodDemo
{
	/**
	 * Print various primitive type data from List.
	 * @param list
	 */
	public <E> void printListData(List<E> list)
	{
		System.out.println("----------------------------------");
		for (E e : list)
		{
			System.out.println("List element are : " + e);
		}
	}
}

public class GenericMethodApp
{
	public static void main(String[] args)
	{
		GenericMethodDemo gmDemo = new GenericMethodDemo();

		List<Integer> intList = new LinkedList<Integer>();
		intList.add(12);
		intList.add(85);
		intList.add(40);

		gmDemo.printListData(intList);

		List<String> strList = new LinkedList<String>();
		strList.add("ABCD");
		strList.add("Sample");
		strList.add("Test Data");
		strList.add("Some Text");

		gmDemo.printListData(strList);

		List<Double> doubleList = new LinkedList<Double>();
		doubleList.add(48.63D);
		doubleList.add(95.058D);
		doubleList.add(522.10d);
		doubleList.add(102.58d);
		doubleList.add(123.78D);

		gmDemo.printListData(doubleList);
	}
}
