package com.aspire.java.arrays;

public class Addition2array 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[] = {};
		int k = 0;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				c[k]=a[i]+b[j];
				System.out.println(c[k]);
				
			}
		}
		

		
	}

}
