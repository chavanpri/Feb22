package com.aspire.java.strings;



public class Rev
{
	public static void main(String[] args)
	{
		
		String s="abcd1234";
		//s.charAt(0);
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s.substring(s.indexOf("1")));
		System.out.println(s.subSequence(s.indexOf("a"), s.indexOf("1")));
}}
