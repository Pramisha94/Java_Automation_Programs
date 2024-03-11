package com.automation;

import java.util.Scanner;

//sum of numbers using do while 
public class Dowhile {
	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		i=sc.nextInt();
		do
		{
			sum=sum+i;
			i--;	
		}
		while(i>0);
		System.out.println("Sum is :"+sum);
	}
}
