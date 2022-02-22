package com.aspire.java.arrays;

public class Index
{
	public static void main(String[] args) 
	{
		int a[]= {2,34,56,78,879,2,3,1};
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==2)
			{
				index=i;
			}
			
		}System.out.println(index);
	}

}
