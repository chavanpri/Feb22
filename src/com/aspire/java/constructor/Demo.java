package com.aspire.java.constructor;

public class Demo
{
	int a;
	int b;
	Demo()
	{
		 a=10;
		 b=20;
	}
	Demo(int c ,int d)
	{
		a=c;
		b=d;
	}
	public void add() 
	{
	     System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		Demo object=new Demo();
	object.add();
		
	}

}
