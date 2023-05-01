package com.interfaceque.org;
import com.Myinterface.Printable;

public class Employee implements Printable{

	private int id;
	private String name;
	private double salary;
	
	public Employee()
	{
		this.id=1;
		this.name="myname";
		this.salary=0.0;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return +id+" "+name+" "+salary;
	}

	@Override
	public void Print() {
		
		
		System.out.println("print the data of Employees: " +this.toString());
		
		
	}
	
	
}
