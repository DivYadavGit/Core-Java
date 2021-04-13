package com.corejava.genericsdemo;

class BoundedTypePara <K,V>
{
	private K	key;
	private V	val;

	public K getKey()
	{
		return key;
	}

	public void setKey(K key)
	{
		this.key = key;
	}

	public V getVal()
	{
		return val;
	}

	public void setVal(V val)
	{
		this.val = val;
	}

	public <E, N> void printValue(E ele, N no)
	{
		System.out.println("Element : " + ele + " , Number : " + no);
	}

	/**
	 * It set the limit for Number types of data only. We can bound its value.
	 * @param ele
	 * @param no
	 */
	public <E extends String, N extends Number> void printValue(E ele, N no)
	{
		System.out.println("Element is: " + ele + " , Number is: " + no);
	}
}

public class GenericBoundedTypePara
{
	public static void main(String[] args)
	{
		BoundedTypePara<Integer, Double> typePara = new BoundedTypePara<Integer, Double>();
		typePara.setKey(1);
		typePara.setVal(15.25d);
		typePara.printValue(85, 58.5); // It call printValue(E ele, N no)
		typePara.printValue("Some Text", 85.5d); // It call bounded type method

		BoundedTypePara<Integer, GenericBoundedTypePara> typePara1 = new BoundedTypePara<Integer, GenericBoundedTypePara>();
		typePara1.setKey(2);
		typePara1.setVal(new GenericBoundedTypePara()); // Set current class object as value and call its display() method
		typePara1.printValue(85, 95l);
		typePara1.getVal().display();
	}
	
	public void display()
	{
		System.out.println("Print some text...");
	}
	
}
