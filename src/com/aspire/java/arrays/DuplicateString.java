  package com.aspire.java.arrays;

public class DuplicateString 
{
	public static void main(String[] args) 
	{
		String []s= {"aa","bb","cc","aa","dd"};
		System.out.println(s[0]);
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[i]);
					
				}
			}
		}
		
	}

}
