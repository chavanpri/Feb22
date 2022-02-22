package com.aspire.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Priyanka");
		lh.add(123455);
		lh.add(98.5f);
		lh.add("chavan");
		lh.add("Priyanka");
		lh.add('A');
		lh.add(null);
		lh.add(98.5f);
		lh.add(null);
		lh.add(50);
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		lh.remove(123455);
		System.out.println(lh);
		System.out.println("for each loop");
		for(Object a:lh)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("for iterator");
		Iterator it = lh.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		

		
	}

}
