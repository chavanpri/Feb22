package com.aspire.java.oops.inter;

abstract public class Child implements Inter_face1,Inter_face2
{

	public void multification() {
		int a=20;
		int b=10;
		int multi=a*b;
		System.out.println("multification="+multi);
		
	}

	public void division() {
		int a=20;
		int b=10;
		int div=a/b;
		System.out.println("divition="+div);
		
		
	}

	public void addition() {
		int a=20;
		int b=10;
		int add=a+b;
		System.out.println("addition="+add);
		
		}

	abstract public void subtraction();
	
		
	

}
