package com.automation;

import java.util.Scanner;

public class Arraynew {
	
	public static void main(String[] args)
	{
	   int a[]=new int[5];
	   int i;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Array Elements :");	   
	   for(i=0;i<a.length;i++)
	   {
		   System.out.print("Enter "+i+" Element  :");
		   a[i]=sc.nextInt();
	   }
		System.out.println("Array elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}	
	}
}
