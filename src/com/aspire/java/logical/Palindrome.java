package com.aspire.java.logical;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=1232134;
		int rev=0;
		int rem=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse number="+rev);
		
		if(temp==rev)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
	}

}
