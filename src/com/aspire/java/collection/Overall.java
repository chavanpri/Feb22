package com.aspire.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Overall 
{
	public static void main(String[] args) 
	{
		int a[]= {4,2,6,7,2,12,9,23};
		String[] s= {"priyanka","abhishek","advika","vedika","soham","malhar"};
		
		System.out.println("**********array list***********");
		ArrayList al = new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		
		for(String b:s)
		{
			al.add(b);
		}
		System.out.print(al+" ");
		System.out.println();
		System.out.println("**********linked list***********");
		
	LinkedList ll = new LinkedList();
	for(int i=0;i<a.length;i++)
	{
		ll.add(a[i]);
	}
	
	for(String b:s)
	{
		ll.add(b);
	}
	System.out.print(ll+" ");
	System.out.println();
	System.out.println("**********vector***********");
	Vector v = new Vector();
	for(int i=0;i<a.length;i++)
	{
		v.add(a[i]);
	}
	
	for(String b:s)
	{
		v.add(b);
	}
	System.out.print(v+" ");
	System.out.println();
	System.out.println("**********Hashset***********");
	HashSet hs = new HashSet();
	for(int i=0;i<a.length;i++)
	{
		hs.add(a[i]);
	}
	
	for(String b:s)
	{
		hs.add(b);
	}
	System.out.print(hs+" ");
	System.out.println();
	System.out.println("**********linked hashset***********");
	LinkedHashSet ls = new LinkedHashSet();
	for(int i=0;i<a.length;i++)
	{
		ls.add(a[i]);
	}
	
	for(String b:s)
	{
		ls.add(b);
	}
	System.out.print(ls+" ");
	System.out.println();
	System.out.println("**********tree set***********");
	
	TreeSet ts = new TreeSet();
//	for(int i=0;i<a.length;i++)
//	{
//		ts.add(a[i]);
//	}
	
	for(String b:s)
	{
		ts.add(b);
	}
	System.out.print(ts+" ");
	

	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		
	}

}
