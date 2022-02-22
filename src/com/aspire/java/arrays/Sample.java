package com.aspire.java.arrays;

public class Sample 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,6,7,8,9,5,6};
		int b[]= {3,6,7,8,9,8};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<b.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate="+a[i]);
					
				}
			}
		}
		
	}

}
