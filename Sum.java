package com.automation;

import java.util.Scanner;

//Sum of n numbers using for loop
public class Sum {
public static void main(String[] args) {
	int i,n,total=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a value : ");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		total= total +i;
	}
		System.out.println("Total : "+total);
		
	
}
}
