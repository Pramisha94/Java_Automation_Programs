package com.automation;

import java.util.Scanner;

public class Array2Dsum {
	
	public static void main(String[] args)
	{
	   int a[][]=new int[2][2];
	   int i,j,sum=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter 2D Array Elements :");	   
	   for(i=0;i<a.length;i++)
	   {
		   for(j=0;j<a.length;j++)
		   {
			   System.out.print("Enter "+i+" Row &"+j+" Column :");
			   a[i][j]=sc.nextInt();
			   sum=sum+a[i][j];
		   }
	   }
		System.out.println("2D array is :");
		for(i=0;i<a.length;i++)
		{
			 for(j=0;j<a.length;j++)
			   {
				  System.out.println("A["+i+"]["+j+"]="+a[i][j]);
				  {
					  System.out.print("Sum : "+sum);
				  }
			   }
		}
	}
}
