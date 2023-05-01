package com.interfaceque.org;

import com.Myinterface.Printable;

public class Shape implements Printable{

	public void CalArea()
	{
	     System.out.println("calculate area");
	}
	
	
	
	@Override
	public void Print() {
		
		System.out.println("print any shape beacuse shape is not a shape");
	}

}
