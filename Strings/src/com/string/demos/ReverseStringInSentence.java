package com.string.demos;

import java.util.Scanner;

public class ReverseStringInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		String str = sc.nextLine();

		String[] strArr = str.split(" ");
		String revStr = new String();

		for (String s : strArr) {
			char[] chars = s.toCharArray();
			for (int i = chars.length - 1; i >= 0; i--) {
				revStr += chars[i];
			}
			revStr += " ";
		}

		System.out.println("Reveres Sentence : " + revStr);
	}

}
