package com.aspire.java.oops;
 public class Child extends Parent
{

	
	public void multification()
	{

		int a=20;
		int b=10;
		int multi=a*b;
		System.out.println("multi "+multi);	
		
	}
	public void division() 
	{
		int a=20;
		int b=10;
		int div=a/b;
		System.out.println("div "+div);	
	}
	public static void main(String[] args) 
	{
		Child ch=new Child();
		ch.additon();
		ch.subtraction();
		ch.multification();
		ch.division();
	}
	@Override
	  public void subtraction() {
		
	}
		
		
	}


