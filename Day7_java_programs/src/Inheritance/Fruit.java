package Inheritance;

public class Fruit {

	private String color;
	private double weight;

	public Fruit()
	{
		this.color="any";
		this.weight=10.10;
	}
	
	public Fruit(String color,double weight)
	{
		this.color=color;
		this.weight=weight;
	}
	
	public void display()
	{
		System.out.println("color :"+color+" weight:"+weight+"gram");
	}
	
	
	public void taste()
	{
		System.out.println("every fruit has a taste");
	}
}
