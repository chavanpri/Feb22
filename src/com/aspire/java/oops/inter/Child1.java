package com.aspire.java.oops.inter;

public class Child1 extends Child
{

	public void subtraction() 
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("subtraction="+sub);
		
		
	}
	public static void main(String[] args) 
	{
		Child1 ch=new Child1();
		ch.addition();
		ch.subtraction();
		ch.multification();
		ch.division();
		
	}

}
