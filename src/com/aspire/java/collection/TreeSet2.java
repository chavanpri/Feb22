package com.aspire.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		System.out.println(ts.isEmpty());
		ts.add("Priyanka");
		ts.add("Abhishek");
		ts.add("Advika");
		ts.add("Vedika");
		ts.add("swara");
		ts.add("Malhar");
		ts.add("Abhishek");
		ts.add("Tanvi");
		ts.add("Vedika");
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		ts.remove("swara");
		System.out.println(ts);
		System.out.println("for each loop");
		for(Object a:ts)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("by using iterator");
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		
		
	}

}
