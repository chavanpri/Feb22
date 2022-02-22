package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Sample 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Priyanka");
		al.add(123455);
		al.add(98.5f);
		al.add("chavan");
		al.add("Priyanka");
		al.add('A');
		al.add(null);
		al.add(98.5f);
		al.add(null);
		al.add(50);
		Vector v = new Vector();
		v.add("Priyanka");
		v.add(123455);
		v.add(98.5f);
		v.add("chavan");
		v.add("Priyanka");
		v.add('A');
		v.add(null);
		v.add(98.5f);


	System.out.println(al.contains(123455));
	System.out.println(al.containsAll(v));
		
		System.out.println(al.equals(v));
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("list iterator");
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		
		
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement()+" ");
		}
		
		
		System.out.println();
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		for(Object a:al)
		{
			System.out.print(a+" ");
		}
		
	}

}
