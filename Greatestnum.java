

import java.util.Scanner;

public class Greatestnum {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is the greatest number:");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greatest number:");
		}
		if(c>a && c>b)
		{
			System.out.println("c is the greatest number:");
		}

	}

}