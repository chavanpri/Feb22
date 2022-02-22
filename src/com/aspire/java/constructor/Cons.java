package com.aspire.java.constructor;

public class Cons 
{
	int a;
	int b;
	Cons()
	{
		 a=10;
		 b=20;
		
	}
	Cons(int c,int d,int e)
	{
		c=a+b;
		d=a;
		e=b;
		
		}
	public void sub()
	{
		System.out.println(b-a);
	}
	public static void main(String[] args) 
	{
		Cons ob=new Cons();
		ob.sub();
		
	}

}
