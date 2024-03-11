package com.automation;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a :");
a=sc.nextDouble();
System.out.print("Enter b :");
b=sc.nextDouble();
c= a+b;
System.out.println("Addition :"+c);
c=a-b;
System.out.println("Substraction :"+c);
c=a*b;
System.out.println("Multiplication :"+c);
c=a/b;
System.out.println("Division :"+c);
}
	
}
