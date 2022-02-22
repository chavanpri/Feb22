package com.aspire.java.strings;

public class Sample
{
	public static void main(String[] args) 
	{
		String s="Priyanka";
		String s1="Priyanka";
		String s3=new String ("priyanka");
		String s4=new String ("Priyanka");
		System.out.println(s4==s3);
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.concat(s1));
	}

}
