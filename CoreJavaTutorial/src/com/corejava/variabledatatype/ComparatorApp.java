package com.corejava.variabledatatype;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class ComparatorDemo<K, V>
{
	private K	key;
	private V	value;

	public ComparatorDemo(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public K getKey()
	{
		return key;
	}

	public void setKey(K key)
	{
		this.key = key;
	}

	public V getValue()
	{
		return value;
	}

	public void setValue(V value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "ComparatorDemo [key=" + key + ", value=" + value + "]";
	}
}

public class ComparatorApp
{
	public static void main(String[] args)
	{

		Comparator<ComparatorDemo<Integer, String>> compareByID = new Comparator<ComparatorDemo<Integer, String>>() {

			@Override
			public int compare(ComparatorDemo<Integer, String> obj1, ComparatorDemo<Integer, String> obj2)
			{
				if (obj1.getKey() < obj2.getKey())
					return -1;
				else if (obj1.getKey() > obj2.getKey())
					return 1;
				else
					return 0;
			}
		};

		Comparator<ComparatorDemo<Integer, String>> compareByValueLength = new Comparator<ComparatorDemo<Integer, String>>() {

			@Override
			public int compare(ComparatorDemo<Integer, String> obj1, ComparatorDemo<Integer, String> obj2)
			{
				if (obj1.getValue().length() < obj2.getValue().length())
					return -1;
				else if (obj1.getValue().length() > obj2.getValue().length())
					return 1;
				else
					return 0;
			}
		};

		Set<ComparatorDemo<Integer, String>> setByID = new TreeSet<>(compareByID);

		setByID.add(new ComparatorDemo<Integer, String>(1, "Divya"));
		setByID.add(new ComparatorDemo<Integer, String>(5, "Abhigya"));
		setByID.add(new ComparatorDemo<Integer, String>(2, "Zeck"));
		setByID.add(new ComparatorDemo<Integer, String>(8, "Yummy!"));
		setByID.add(new ComparatorDemo<Integer, String>(9, "Moony"));

		for (ComparatorDemo<Integer, String> demo : setByID)
			System.out.println("Set Elements Key are : " + demo.getKey() + ", Value are : " + demo.getValue());

		System.out.println("-------------------------------------------");

		Set<ComparatorDemo<Integer, String>> setByLength = new TreeSet<>(compareByValueLength);

		// While we compare by length it allow only one recored for particular length
		setByLength.add(new ComparatorDemo<Integer, String>(1, "Divya"));
		setByLength.add(new ComparatorDemo<Integer, String>(5, "Abhigya"));
		setByLength.add(new ComparatorDemo<Integer, String>(2, "Zeck"));
		setByLength.add(new ComparatorDemo<Integer, String>(8, "Yummy!"));
		setByLength.add(new ComparatorDemo<Integer, String>(9, "Moony"));

		for (ComparatorDemo<Integer, String> demo : setByLength)
			System.out.println("Set Elements Key are : " + demo.getKey() + ", Value are : " + demo.getValue());
	}

}
