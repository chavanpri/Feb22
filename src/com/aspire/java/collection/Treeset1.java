package com.aspire.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(11);
		ts.add(6);
		ts.add(9);
		ts.add(5);
		ts.add(1);
		ts.add(5);
		ts.add(10);
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains(2));
		System.out.println(ts.contains(6));
		System.out.println("for each loop");
		for(Object a:ts)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("iterator");
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}

}
