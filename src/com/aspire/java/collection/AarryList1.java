package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AarryList1
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
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf('A'));
		System.out.println(al.indexOf(98.5f));
		System.out.println(al.lastIndexOf(98.5f));
		al.remove(98.5f);
		
		System.out.println(al);
		System.out.println(al.indexOf("Priyanka"));
		System.out.println(al.lastIndexOf("Priyanka"));
		al.set(0, "ADVIKA");
		System.out.println(al);
		int a=10;
		System.out.println(a+(int)al.get(8));

for(int i=0;i<al.size();i++)
{
	
	System.out.print(al.get(i)+" ");
	}
System.out.println();
for(Object b:al)
{
	System.out.print(b+" ");
	}
System.out.println();
System.out.println("********by using listiterator******");
       ListIterator li = al.listIterator();
       while(li.hasNext())
       {
    	   System.out.print(li.next()+" ");
       }System.out.println();
       System.out.println("********by using listiterator in reverse******");
       
             ListIterator lirev = al.listIterator(al.size());
             while(lirev.hasPrevious())
             {
            	 System.out.print(lirev.previous()+" ");
             }
            	System.out.println();	
            	System.out.println("********by using iterator******");
            	Iterator it = al.iterator();
            	while(it.hasNext())
            	{
            		System.out.print(it.next()+" ");
            	}
	}

}
