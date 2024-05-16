package com.automation;

class Box
{
	double width,height,depth;
	void volume()
		{
			System.out.println("Volume :"+(width*height*depth));
		}
Box()
		{
			System.out.println("Default Constructor called");
			width =3;
			height=4;
			depth=5;
		}
	}

public class Defaultcons {
public static void main(String[] args) {
	Box b1=new Box();
	b1.volume(); 
}
}
