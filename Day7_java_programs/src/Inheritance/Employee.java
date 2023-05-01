package Inheritance;

public class Employee {

	private int id;
	private String name;
	protected double salary;
	
	public Employee()
	{
		this.id=1;
		this.name="myname";
		this.salary=10;
	}
	public Employee(int id, String name, double salary) {
		//super();
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
	
	public String toString()
	{
		return "id :" +id+ "name :" +name+ "salary :"+salary;
	}
}
