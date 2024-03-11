package com.automation;

import java.util.Scanner;
//sum of n numbers using while loop
public class Whileloop {
public static void main(String[] args) {
	int i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a value : ");
	i=sc.nextInt();
	while(i>0)
	{
		sum=sum+i;
		i--;
		
	}
	System.out.println("Sum is :"+sum);
}
}
