package com.aspire.java.logical;

public class Swapping2STRING
{
	public static void main(String[] args)
	{
		String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;       //Loveyou
        
        b = a.substring(0, a.length() - b.length());  // a(0,7-3)=a(0,4)  love
        
        a = a.substring(4);  //3
        
        System.out.println("After : ");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }  	}


