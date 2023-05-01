package TestInheritance;
import java.util.Scanner;
import Inheritance.*;
public class TestEmployee {

	public static void main(String[] args) {
		
//		Employee e1=new SalesManager(101,"sachin",20000,200);
//		System.out.println(e1);
//		
//		Employee e2=new Admin(102,"rohit",30000,300);
//		System.out.println(e2);
//		
//		//downcasting
//		
//		if(e1 instanceof SalesManager)
//		{
//			((SalesManager)e1).calincentive();;
//		}
		
		Employee[]arr=new Employee[5];
		arr[0]=new SalesManager(101,"sachin",20000,200);
		arr[1]=new Admin(102,"rohit",30000,300);
		
		if(arr!=null)
		{
		for(int i=0;i<2;i++)
		{
				System.out.println(arr[i]);
			}
		}
		}

	
}
