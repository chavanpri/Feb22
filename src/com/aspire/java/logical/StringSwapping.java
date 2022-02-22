package com.aspire.java.logical;

public class StringSwapping
{
	public static void main(String[] args)
	{
		String s1="good";
		
		String s2="morning";
		
		s1=s1.concat(s2);
		
		System.out.println(s1);
		
		s2=s1.substring(s1.indexOf('g'),s1.indexOf('m'));
		
		System.out.println("s2="+s2);
		
		s1=s1.substring(s1.indexOf('m'));
		
		System.out.println("s1="+s1);
		
	}

}
