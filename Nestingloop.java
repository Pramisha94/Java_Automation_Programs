package com.automation;
//Printing pattern using for loop
public class Nestingloop {
public static void main(String[] args) {
	int i,j,k;
	for(i=0;i<15;i++)
	{
		for(k=0;k<14-i;k++)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println(" ");
		//System.out.println();
	}
	for(i=14;i>=0;i--)
	{
		for(k=0;k<14-i;k++)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print(" *");
		}
		System.out.println(" ");
}
}
}
