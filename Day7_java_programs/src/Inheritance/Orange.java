package Inheritance;

public class Orange extends Fruit{

	public void juice()
	{
		System.out.println("for making juice");
	}
	
	@Override
	public void taste()
	{
		System.out.println("souur in taste");
	}
}
