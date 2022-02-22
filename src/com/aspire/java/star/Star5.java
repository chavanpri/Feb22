package com.aspire.java.star;

public class Star5 
{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int space=4;space>=i;space--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=0;i<=5;i++)
		{
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
	}

}
