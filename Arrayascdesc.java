package com.automation;

import java.util.Scanner;

//sorting ascending and descending 
public class Arrayascdesc {
public static void main(String[] args) {
	int a[]=new int[5];
	int i,j,temp;
	Scanner sc=new Scanner(System.in);
	for(i=0;i<a.length;i++)
	{
		System.out.print("A["+i+"]= "+a[i]);
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
		System.out.print("Array elements are in ascending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]= "+a[i]);
		}
}

}
