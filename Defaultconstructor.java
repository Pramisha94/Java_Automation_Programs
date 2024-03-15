package com.automation;

//Default constructor : has no arguments()

class Box
{
	double width,height,depth;
	Box()
	{
		System.out.println("Default Constructor called");
		width =3;
		height=4;
		depth=3;
	}
	void volume()
	{
		System.out.println("Volume :"+(width*height*depth));
	}
}
public class Defaultconstructor {
public static void main(String[] args) {
	Box b1=new Box();
	b1.volume(); 
}
}
