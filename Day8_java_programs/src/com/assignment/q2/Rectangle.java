package com.assignment.q2;
import java.util.Scanner;

public class Rectangle extends Shape{

	private double height;
	private double width;
	
	
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		System.out.println("Area of a Rectangle is:");
		return +(height*width);
	}

	@Override
	public String toString() {
		return super.toString()+"height and width is " +height+" " +width;
	}

	
}
