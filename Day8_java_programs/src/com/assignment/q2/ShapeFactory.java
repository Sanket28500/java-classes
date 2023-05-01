package com.assignment.q2;

public class ShapeFactory extends Shape{

	
	public static int generateshape() {
		return (int)Math.round(Math.random()*2+1);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
