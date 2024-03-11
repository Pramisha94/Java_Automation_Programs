package com.automation;

import java.util.Scanner;

//Simple for loop 
public class Forloop {
public static void main(String[] args) {
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a value : ");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		System.out.println(i);
		
	}
}
}
