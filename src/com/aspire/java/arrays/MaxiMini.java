package com.aspire.java.arrays;

public class MaxiMini
{
	public static void main(String[] args)
	{
		int a[]= {26,34,43,62,7,113,13,243};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
			
		}
		System.out.println("maximum value of array "+max);
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}System.out.println("minimum value of array "+min);
		
	}

}
