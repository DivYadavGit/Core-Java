package com.patterns.printdemo;

public class FloydsTriangle {

	public static void main(String[] args) {
		int n = 5, no = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(no + " ");
				no++;
			}
			System.out.println("");
		}
	}

}
