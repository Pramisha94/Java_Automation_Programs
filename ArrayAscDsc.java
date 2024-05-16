package com.automation;

import java.util.Scanner;


public class ArrayAscDsc {
public static void main(String[] args) {
	int a[]=new int[3];
	int i,j,temp;
	System.out.println("Enter array elements :");
	Scanner sc=new Scanner(System.in);
	for(i=0;i<a.length;i++)
	{
		System.out.print("A["+i+"]="+a[i]);
		a[i]=sc.nextInt();
	}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
				
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		System.out.println("Array elements are in ascending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]= "+a[i]);
		}

		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
				
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		System.out.println("Array elements are in descending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]= "+a[i]);
		}
}
}
