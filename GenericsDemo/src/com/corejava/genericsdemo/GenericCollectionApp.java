package com.corejava.genericsdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class GenericCollectionDemo<T>
{
	Object data;

	public GenericCollectionDemo(Object data)
	{
		this.data = data;
	}

	public Object getData()
	{
		return data;
	}
}

public class GenericCollectionApp
{
	public static void main(String[] args)
	{
		//Set all primitive type of data into list and print it.
		List<GenericCollectionDemo<Object>> lst = new LinkedList<>();
		lst.add(new GenericCollectionDemo<Object>(123));
		lst.add(new GenericCollectionDemo<Object>("Test String"));
		lst.add(new GenericCollectionDemo<Object>(158.98f));
		lst.add(new GenericCollectionDemo<Object>('*'));
		lst.add(new GenericCollectionDemo<Object>(102.58d));

		printListData(lst);
	}
	
	/**
	 * Iterator and print list elemets
	 * @param lst
	 */
	public static void printListData(List<GenericCollectionDemo<Object>> lst)
	{
		ListIterator<GenericCollectionDemo<Object>> lstIterator = lst.listIterator();
		while (lstIterator.hasNext())
		{
			System.out.println("List elements are : " + lstIterator.next().getData());
		}
	}
	
}
