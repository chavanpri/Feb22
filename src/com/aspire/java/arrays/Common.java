package com.aspire.java.arrays;

public class Common 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,56,67};
		int b[]= {4,5,6,7,87,9,8};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					count++;
				}
			}
		}System.out.println(count);
		
	}

}
