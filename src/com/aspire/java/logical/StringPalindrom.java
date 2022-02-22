package com.aspire.java.logical;

public class StringPalindrom
{
	public static void main(String[] args) 
	{
		String s="abcddcba";
		String rev="";
		String temp=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			  rev=rev+ s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(temp))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
		
	}

}
