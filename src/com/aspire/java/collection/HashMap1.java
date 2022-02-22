package com.aspire.java.collection;

import java.util.HashMap;

public class HashMap1
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Priyanka");
		hm.put(2, "Abhishek");
		hm.put(3, "Advika");
		hm.put(4, "Swara");
		hm.put(5, "Malhar");
		System.out.println(hm);
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("Sona"));
		System.out.println(hm.get(4));
		System.out.println(hm.entrySet());
		System.out.println(hm.equals("Priyanka"));
		System.out.println(hm.replace(4, "Swara", "Vedika"));
		System.out.println(hm);
		hm.remove(5);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.replace(4, "soham"));
		System.out.println(hm);
		System.out.println(hm.values());
		for(int i=1;i<=hm.size();i++)
		{
			System.out.print(hm.get(i)+" ");
		}
		
	}

}
