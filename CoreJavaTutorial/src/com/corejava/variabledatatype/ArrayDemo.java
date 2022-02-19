package com.corejava.variabledatatype;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 1, 3 };
		int element = 5, index = 0;
		boolean isFind = false;
		// Search element's index
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				isFind = true;
				index = i;
			}
		}
		if (isFind)
			System.out.println("Index of element " + element + " is " + index);
		else
			System.out.println("No element found!!");
	}

}
