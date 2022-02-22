package com.aspire.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add("Priyanka");
		hs.add(123455);
		hs.add(98.5f);
		hs.add("chavan");
		hs.add("Priyanka");
		hs.add('A');
		hs.add(null);
		hs.add(98.5f);
		hs.add(null);
		hs.add(50);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove("priyanka");
		System.out.println(hs);
		hs.remove('A');
		System.out.println(hs);
		System.out.println("for each");
		for(Object a:hs)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("by using iterator");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	   
		
	}

}
