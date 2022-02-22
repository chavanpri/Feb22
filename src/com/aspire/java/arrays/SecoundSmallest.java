package com.aspire.java.arrays;

import java.util.Arrays;

public class SecoundSmallest 
{
	public static void main(String[] args) 
	{
		int a[]= {112,34,56,78,7,8,13,98};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("2nd smallest number in array "+a[1]);
		System.out.println();
		System.out.println("2nd largest number in array "+(a[a.length-2]));



	}

}
