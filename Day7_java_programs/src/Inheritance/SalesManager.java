package Inheritance;

public class SalesManager extends Employee{

	private int incentive;
	
	public SalesManager()
	{
		this.incentive=1;
	}
	
	public SalesManager(int id,String name,double salary,int incentive)
	{
		super(id,name,salary);
		this.incentive=incentive;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	public void calincentive()
	{
		System.out.println("salary+incentive: "+(this.salary+this.incentive));
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nincentive is:"+incentive;
	}
}
