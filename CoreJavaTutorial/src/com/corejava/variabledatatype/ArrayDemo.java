package com.corejava.variabledatatype;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = {5,6,8,1,3};
		int element = 1;
		
		//Search element's index
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == element)
				System.out.println("Index of element "+ element+" is "+i);
		}

	}

}
