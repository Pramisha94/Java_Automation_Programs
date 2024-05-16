package com.automation;

import java.util.Scanner;

public class Arrayadd {
	
	public static void main(String[] args) {
	   
	   int a[]=new int[3];
	   int i,sum=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Array Elements :");
	   
	   for(i=0;i<a.length;i++)
	   {
		   System.out.print("Enter "+i+" Element  :");
		   a[i]=sc.nextInt();
		   sum= a[i]+sum;
	   }
		System.out.println("Array elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		System.out.println("Sum of array elements :"+sum);
		
	}

}
