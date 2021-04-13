package com.corejava.genericsdemo;

class GenericDemo<T>
{
	private T dataObj;

	public T getDataObj()
	{
		return dataObj;
	}

	public void setDataObj(T dataObj)
	{
		this.dataObj = dataObj;
	}
}

public class GenericDemoApp
{
	public static void main(String[] args)
	{
		GenericDemo<String> gd = new GenericDemo<String>();
		// gd.setDataObj(123); Compile time Type checking/ Type safety. Because
		// we restrict this class for string type of parameter only.
		gd.setDataObj("Generic Demo");
		String str = gd.getDataObj(); // No type casting issue because class
										// already restrict for string only.
		System.out.println("Example with Generic: " + str);

	}

}
