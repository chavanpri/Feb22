package com.aspire.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linklist1
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add("Priyanka");
		ll.add(123455);
		ll.add(98.5f);
		ll.add("chavan");
		ll.add("Priyanka");
		ll.add('A');
		ll.add(null);
		ll.add(98.5f);
		ll.add(null);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf("chavan"));
		System.out.println(ll.lastIndexOf(null));
		System.out.println(ll.indexOf(98.5f));
		int a=20;
		System.out.println(a+(int)ll.get(9));
		ll.set(0, "advi");
		System.out.println(ll);
		System.out.println("for loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		System.out.println("for each loop");
		for(Object b:ll)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("iterator");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("list iterator in forword");
		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println("list iterator in reverse");
		ListIterator lirev = ll.listIterator(ll.size());
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+" ");
		}
	}

}
