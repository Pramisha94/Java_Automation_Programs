package com.automation;

import java.util.Scanner;

//Odd and even number
public class OddEven {
public static void main(String[] args) {
	int a;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter a number :");
	a=sc.nextInt();
	if(a%2==0)
	{
		System.out.println("It is an Even Number.");
	}
	else
	{
		System.out.println("It is an Odd number");
	}
}
}
