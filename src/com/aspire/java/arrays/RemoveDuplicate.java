package com.aspire.java.arrays;

public class RemoveDuplicate 
{
	public static void main(String[] args)
	{

		int a[]= {1,2,3,4,5,6,14,5};
		int remove;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=i;k<a.length-1;k++)
					{
						a[k]=a[k+1];
					}
					break;
				}
			}
			
			
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}