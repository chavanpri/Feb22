package com.aspire.java.methods;

import java.util.Scanner;

public class divisible
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		int c=a/b;
		if(a%2==0)
		{
			System.out.println("given number is sum");
		}
		else
		{
			System.out.println("given number is odd");
		}
		
	}

}
