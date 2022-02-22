package com.aspire.java.logical;

public class Armstrong
{
	public static void main(String[] args)
	{
		int num=153;
		int sum=0;
		int rem=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println(temp+" is armstrong number");
		}
		else
		{
			System.out.println(temp+" is not aremstrong number");
		}
	}

}
