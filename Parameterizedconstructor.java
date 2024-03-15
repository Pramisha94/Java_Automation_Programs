package com.automation;

//have some argument while defining class (..,..)

class Box
{
	double w,h,d;
	Box(double w,double h,double d)
	{
		System.out.println("Parameterized constructor called");
	}
	void volume()
	{
		System.out.println("Volume :"+(w*h*d));
	}
}
public class Parameterizedconstructor {
public static void main(String[] args) {
	Box b2=new Box(4,5,6);
	b2.volume();
}
}
