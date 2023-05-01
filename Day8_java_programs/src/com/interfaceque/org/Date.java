package com.interfaceque.org;

import com.Myinterface.Printable;

public class Date implements Printable{

	private int day,month,year;
	
	public void Date()
	{
		this.day=1;
		this.month=06;
		this.year=1960;
	}
	

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		
		return +day+"/"+month+"/"+year;
	}

	@Override
	public void Print() {
		System.out.println("print the date: " +this.toString());
		
		
	}

}
