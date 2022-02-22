package com.aspire.java.arrays;

public class Addition 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		float sum=0;
		float avg;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		avg=sum/a.length;
		System.out.println(avg);
	}

}
