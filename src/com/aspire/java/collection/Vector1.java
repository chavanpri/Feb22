package com.aspire.java.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Priyanka");
		v.add(123455);
		v.add(98.5f);
		v.add("chavan");
		v.add("Priyanka");
		v.add('A');
		v.add(null);
		v.add(98.5f);
		v.add(null);
		v.add(50);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf("chavan"));
		System.out.println(v.lastIndexOf(null));
		System.out.println(v.indexOf(98.5f));
		v.remove(3);
		System.out.println(v);
		v.add(3, 100);
		int a=10;
		System.out.println(a+(int)v.get(3));
		System.out.println("for loop");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i)+" ");
		}System.out.println();
		System.out.println("for each loop");
		for(Object b:v)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("using iterator");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("list iterator in forword");
		ListIterator li = v.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println("list iterator in reverse direction");
		ListIterator lirev = v.listIterator(v.size());
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+" ");
		}
		System.out.println();
		System.out.println("using enumarator");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+" ");
		}
		
	}

}
