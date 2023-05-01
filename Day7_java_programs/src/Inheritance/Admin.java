package Inheritance;

public class Admin extends Employee{

	private double allowance;
	
	public Admin()
	{
		this.allowance=1;
	}
	public Admin(int id,String name,int salary,double allowance)
	{
		super(id,name,salary);
		this.allowance=allowance;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nallowance is:"+allowance;
	}
	
}
