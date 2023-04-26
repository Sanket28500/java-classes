
public class Methods {

	void welcome()  //without parameter without return
	{
		System.out.println("welcome to java:");
	}
	
	void sum(int a,int b) //with parameter without return
	{
		int c=a+b;
		System.out.println("sum of the integer is:"+c);
	}
	int sub(int i, int j) //with parameter with return 
	{
		int k=i-j;
		return k;
	}
	String msg() //without parameter with return
	{
		return "sanket";
	}
}
