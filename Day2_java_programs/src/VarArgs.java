
public class VarArgs {

	public void sum(int...a)
	{
		System.out.println("enter as many as u want:"+a.length);
	}
	public static void main(String[] args) {
		
	VarArgs obj=new VarArgs();
	 obj.sum(10,23,35,6,5);
	
	
	
	}
}
