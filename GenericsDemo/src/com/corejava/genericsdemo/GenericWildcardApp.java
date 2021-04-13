package com.corejava.genericsdemo;

import java.util.LinkedList;
import java.util.List;

class Phone
{
	private double osVersion;
	
	public Phone(double osVersion)
	{
		this.osVersion = osVersion;
	}
	public double getOsVersion()
	{
		return osVersion;
	}
	public void printInfo()
	{	
		System.out.println("Print Os Version : "+osVersion);
	}
	
	@Override
	public String toString()
	{
		return "Phone [osVersion=" + osVersion + "]";
	}
}

class Nokia extends Phone
{
	private String modalName;

	public Nokia(double osVersion, String modalName)
	{
		super(osVersion);
		this.modalName = modalName;
	}

	public String getModalName()
	{
		return modalName;
	}

	
	@Override
	public String toString()
	{
		return "Nokia [modalName=" + modalName + "]";
	}

	public void printInfo()
	{
		System.out.println("Print ModalName : " + modalName + ", Os version : "+getOsVersion());
	}
}

public class GenericWildcardApp
{
	public static void main(String[] args)
	{
		List<Object> lst = new LinkedList<Object>();
		lst.add(new Phone(1.8d));
		lst.add(new Phone(1.7d));
		lst.add(new Phone(1.4d));
		lst.add(new Nokia(1.5d, "Nokia 3"));
		lst.add(new String("Sample Text"));
		
		printData(lst);
		
		//Upper bound
		List<Phone> lstphone = new LinkedList<Phone>();
		lstphone.add(new Phone(1.8d));
		lstphone.add(new Phone(1.7d));
		lstphone.add(new Phone(1.4d));
		lstphone.add(new Nokia(1.5d, "Nokia 3"));
//		lstphone.add(new String("Sample Text")); // only phone class and its subclass allow.
		printDataphone(lstphone);
		
		
		//Lower bound
		List<Object> lstNokia = new LinkedList<Object>();
		lstNokia.add(new Phone(1.8d));
		lstNokia.add(new Phone(1.7d));
		lstNokia.add(new Phone(1.4d));
		lstNokia.add(new Nokia(1.5d, "Nokia 3"));
		lstNokia.add(new String("Sample Text"));
						
		printDataNokia(lstNokia);
	}
	
	/** Print any object data
	 * @param lst
	 */
	public static void printData(List<?> lst)
	{
		System.out.println("------------------------------");
		for (Object obj : lst)
		{
			System.out.println("Data are : " + obj);
		}
			
	}
	
	/**
	 * Print data with Upper bound
	 * @param lst
	 */
	public static void printDataphone(List<? extends Phone> lst)
	{
		System.out.println("------------------------------");
		for (Phone obj : lst)
		{
			System.out.println("Data is : " + obj);
			obj.printInfo();// Here, Polymorphism occurred, sub class method is
							// called
		}
	}
	
	/**
	 * Print data with Lower bound
	 * @param lst
	 */
	public static void printDataNokia(List<? super Nokia> lst)
	{
		System.out.println("------------------------------");
		for (Object obj : lst)
		{
			System.out.println("Data == : " + obj);
			// obj.printInfo(); Here, we can't use this method because object
			// class doesn't have it.Its restriction of lower bound
		}
	}
}
