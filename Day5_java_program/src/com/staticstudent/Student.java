
package com.staticstudent;

public class Student {

	private int rollno;
	private String name,city;
	private static int count=100;
	
	
	//private static String institutionname;
	// 
//	 static
//	{
//		institutionname="iacsd";
//	}
//	 public static void displayInstituteName()
//	    {
//	    	System.out.println(instituteName);
//	    }
	 
	 public Student(String name, String city) {
			count++;
			this.rollno = count;
			this.name = name;
			this.city = city;
		}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public void display()
	{
		System.out.println("rollno:" +rollno+ " name :" +name+ "city :" +city);
	}
	
	
	
}
