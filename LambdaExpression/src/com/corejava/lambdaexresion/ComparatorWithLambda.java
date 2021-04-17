package com.corejava.lambdaexresion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ListDemo
{
	private String name;

	public ListDemo(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return "ListDemo [name=" + name + "]";
	}
}

public class ComparatorWithLambda
{
	public static void main(String[] args)
	{
		List<ListDemo> lst = new ArrayList<>();
		lst.add(new ListDemo("Happie"));
		lst.add(new ListDemo("Moonny"));
		lst.add(new ListDemo("Zack"));
		lst.add(new ListDemo("Charles"));
		lst.add(new ListDemo("Nicky"));

		// Iterate above list and print its data
		for (ListDemo lstdemo : lst)
			System.out.println("Before sorting, List elements are: " + lstdemo.getName());

		// Want to sort the above data
		// Collections.sort(lst); But it won't allow because the ListDemo isn't
		// predefine type.

		// Sort list data by using comparator interface(w/o using lambda)
		Collections.sort(lst, new Comparator<ListDemo>() {

			@Override
			public int compare(ListDemo o1, ListDemo o2)
			{
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("-------------------------------------");
		for (ListDemo lstdemo : lst)
			System.out.println("After sorting, List elements are: " + lstdemo.getName());

		// Sort data by using lambda expression
		Collections.sort(lst, (ListDemo o1, ListDemo o2) -> o1.getName().compareTo(o2.getName()));

		System.out.println("-------------------------------------");
		for (ListDemo lstdemo : lst)
			System.out.println("After sorting by using lambda expresion, List elements are: " + lstdemo.getName());

		// Sort data for string length by using lambda expression
		Collections.sort(lst, (ListDemo o1, ListDemo o2) -> {
			if (o1.getName().length() > o2.getName().length())
				return 1;
			else if (o1.getName().length() < o2.getName().length())
				return -1;
			else
				return 0;
		});

		System.out.println("-------------------------------------");
		for (ListDemo lstdemo : lst)
			System.out.println("After sorting by using lambda expresion, List elements are: " + lstdemo.getName());
	}
}
