package com.assignment.q2;

import com.Myinterface.Printable;

public abstract class Shape{

	private int x;
	private int y;
	
	public abstract double area();
	
	public String toString()
	{
		return "x:" +x+ "y" +y;
	}
	
}
