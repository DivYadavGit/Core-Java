package com.corejava.lambdaexresion;

import java.util.ArrayList;
import java.util.List;

public class ListwithForEach
{

	public static void main(String[] args)
	{
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(15);
		lst.add(45);
		lst.add(18);
		lst.add(7);
		lst.add(59);
		lst.add(23);

		for (Integer i : lst)
			System.out.println("List data are: " + i);

		System.out.println("---------------------------");

		lst.forEach(i -> {
			if (i > 20)
				System.out.println(i);
		});
	}

}
