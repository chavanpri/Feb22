package com.aspire.java.arrays;

public class SecoundLargest 
{
	public static void main(String[] args)
	{
		int a[]= {12,34,56,78,7,8,13,98};
		int largest=0;
		int seclargest=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				seclargest=largest;
				largest=a[i];
			}
		}
		System.out.println(seclargest);
		
	}

}
