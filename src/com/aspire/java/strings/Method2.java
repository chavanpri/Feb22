package com.aspire.java.strings;

public class Method2 
{
	public static void main(String[] args)
	{
		String s1="Aspire";
		String s2="Training Institute ";
		String s3=" ";
		String s4="Pune";
		
		System.out.println(s1.concat(s3).concat(s2));
		
		System.out.println(s1.substring(3));
		System.out.println(s2.substring(s2.indexOf('I')));
		System.out.println(s2.substring(0, 7));
		System.out.println(s2.substring(s2.indexOf('I'), s2.lastIndexOf(' ')));
		System.out.println(s1.substring(s1.indexOf('p')));
		
		
	}

}
