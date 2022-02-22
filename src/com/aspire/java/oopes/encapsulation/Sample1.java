package com.aspire.java.oopes.encapsulation;

public class Sample1 extends Sample
{
	private int i=10;
	
	 int j=20;
	 public void multi()
	 {
		 int k=i*j;
		 System.out.println("k="+k);
		 System.out.println(i);
	 }
	 public static void main(String[] args) 
	 {
		 Sample1 s=new Sample1();
		 s.sum();
		 s.multi();
		 System.out.println();
		
	}
	
	

}
