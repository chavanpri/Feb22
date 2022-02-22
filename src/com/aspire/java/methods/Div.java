package com.aspire.java.methods;

import java.util.Scanner;

public class Div 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		while(b>=a)
		{
			if(a%3==0)
			{
				System.out.println(a);
				//System.out.println(" is divisible by 2");
			}
			a++;
		}
		
	}

}
