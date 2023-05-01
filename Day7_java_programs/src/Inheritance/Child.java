package Inheritance;

public class Child extends Parent{

	private String role;
	
	public Child()
	{
	    System.out.println("---child class default constructor");	
		this.role="myrole";
	}
	
	public Child(String name,String city,String role)
	{
		super(name,city);
	    System.out.println("---child class para-constructor constructor");	
		this.role=role;
	}
	
	public void display()
	{
		System.out.println("role :" +role);
	}
	
//	public void Behaviour()
//	{
//		
//		System.out.println("---childs class behaviour");
//	}
}
