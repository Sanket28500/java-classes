package com.assignment.q2;

public class Circle extends Shape {

     private double radius;
	
     
     
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("Area of a Circle is:");
		return 3.14*(radius*radius);
	}

	public String toString()
	{
		return super.toString()+"radius of a circle is:"+radius;
	}
}
