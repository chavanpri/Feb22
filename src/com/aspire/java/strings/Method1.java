package com.aspire.java.strings;

public class Method1 
{
	public static void main(String[] args)
	{
		String s="Priyanka";
		String s1="chavan";
		String s2="PRIYANKA";
		String s3="priyanka chavan";
		String s4="Priyanka";
		String s5=new String("Priyanka");
		String s6=new String("Priyanka");
		
		
//		System.out.println(s==s4);
//		System.out.println(s.equals(s4));
//		System.out.println(s==s2);
//		System.out.println(s.equalsIgnoreCase(s2));
//		System.out.println(s.equals(s2));
//		System.out.println(s5==s6);
//		System.out.println(s5.equals(s6));
//		
//		
//		System.out.println(s.toUpperCase());
//		System.out.println(s2.toLowerCase());
//		System.out.println(s3.length());
//		System.out.println(s.indexOf("y"));
//		System.out.println(s.lastIndexOf("a"));
//		System.out.println(s.charAt(2));
//		System.out.println(s.replace('i', 'I'));
//		System.out.println(s2.isEmpty());
//		
		System.out.println(s.contains(s4));
		System.out.println(s3.startsWith("pri"));
		System.out.println(s3.endsWith("an"));
		
		
	}

}
