package com.corejava.genericsdemo;

class Demo
{
	private Object obj;

	public Object getObj()
	{
		return obj;
	}

	public void setObj(Object obj)
	{
		this.obj = obj;
	}
}

public class DemoApp
{
	public static void main(String args[])
	{
		Demo demo = new Demo();
		demo.setObj("Sample Text");
		String str = (String) demo.getObj(); // Issue w/o generic need to cast explicitly.
		System.out.println("Demo class for Issue w/o generics: " + str);
	}
}
