package com.string.demos;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String str = sc.nextLine();

		char[] chars = str.toCharArray();
		String revStr = new String();

		for (int i = chars.length - 1; i >= 0; i--) {
			revStr = revStr + chars[i];
		}
		System.out.println("Original string : " + str + " Reversed String : " + revStr);
	}

}
