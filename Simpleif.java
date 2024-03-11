package com.automation;

import java.util.Scanner;

public class Simpleif {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a :");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("a is postive");
		}
		else
			System.out.println("a is negative");
	}

}
