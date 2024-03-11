package com.automation;
// printing output as per break and continue
public class Breakcontinue {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
		{
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.println("I : "+i);
			}
		}
	}

}
