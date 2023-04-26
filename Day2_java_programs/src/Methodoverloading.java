
public class Methodoverloading {

	public void addition(int i,int j)
	{
		System.out.println("addition is:"+(i+j));
	}
	
	public void addition(double d1,double d2)
	{
		System.out.println("addition :"+(d1+d2));
	}
	
	public void addition(int k, double d3)
	{
		System.out.println("add is:"+(k+d3));
	}
}
