package com.automation;

import java.util.Scanner;

//based on user selected option,doing arithmetic operations using switch case
public class Switchcase {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B :");
		b=sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		d=sc.nextInt();
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition : "+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Substraction : "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication : "+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division : "+c);
			break;
		default:
			System.out.println("Invalid choice ");
		}



	}

}
