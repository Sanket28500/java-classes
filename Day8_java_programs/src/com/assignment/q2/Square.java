package com.assignment.q2;

public class Square extends Shape {

	private double side;

	
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double area() {
		
		System.out.println("Area of the Square is:");
		return +(side*side);
	}

	@Override
	public String toString() {
		
		return super.toString() +"side of a square is: " +side;
	}
	
	
	
}
