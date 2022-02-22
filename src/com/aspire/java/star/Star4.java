package com.aspire.java.star;

public class Star4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int space=4;space>=i;space--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			
			for(int j=0;j<=i-2;j++)
			{
				System.out.print("**");
			}
			System.out.println();
		}

		
	}

}
