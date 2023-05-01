package Inheritance;

public class Parent {

	private String name,city;
	
	public Parent()
	{
		System.out.println("parent class default constructor");
		this.name="pname";
		this.city="pcity";
	}
	
	public Parent(String name,String city)
	{
		System.out.println("---parent para-constructorS");
		this.name=name;
		this.city=city;
	}
	
	public void display()
	{
		System.out.println("name"+name+"city"+city);
	}
	
	
	public void behaviour()
	{
		System.out.println("-----parents behaviour-----");
	}
}
