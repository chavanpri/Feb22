package com.aspire.java.collection;

import java.util.ArrayList;

public class Add2Array 
{
	public static void main(String[] args) 
	{
		ArrayList aList1 = new ArrayList();
		aList1.add("Monday");
		aList1.add("Tuesday");
		aList1.add("Wednesday");
		aList1.add("Thursday");
		System.out.println("Size of 1st list="+aList1.size());
		ArrayList aList2 = new ArrayList();
		aList2.add("Friday");
		aList2.add("Saturday");
		aList2.add("Sunday");
		System.out.println("Size of 2nd list="+aList2.size());
		
		
		ArrayList aJoin = new ArrayList();
		
		aJoin.addAll(aList1);
		aJoin.addAll(aList2);
		System.out.println("addition of 2 arraylist is="+aJoin);
		
		System.out.println("Size of 2nd list="+aJoin.size());

	}

}
