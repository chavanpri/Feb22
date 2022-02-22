package com.aspire.java.logical;

import java.util.Scanner;

public class RecursionFact

{
	   static int method(int n)
	   
	   {      
          if (n == 1)      
            return 1;      
          else      
            return(n * method(n-1));   
          
    }      
  
    public static void main(String[] args)
    {  
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
    	int m=sc.nextInt();
    	
      System.out.println("Factorial of "+m +":" +method(m));  
}  
}  


