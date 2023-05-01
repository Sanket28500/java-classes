package Inheritance;

public class Mango extends Fruit{
	
	public void pulp()
	{
		System.out.println("for making pulp");
	}

	@Override
	public void taste()
	{
		System.out.println("sweet in taste");
	}
}
