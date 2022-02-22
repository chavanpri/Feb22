package com.aspire.java.arrays;

import java.util.Arrays;

public class Sort 
{
	public static void main(String[] args) 
	{
		int a[]= {12,34,456,1,45,76,90};
		String[] s= {"as","er","ty","dfg","rgyt","hgf"};
		Arrays.sort(s);
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
	}

}
