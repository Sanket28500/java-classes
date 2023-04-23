import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int num,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range you want to print the primeno:");
		num=sc.nextInt();
		int i,j;
		for(i=1;i<num;i++)
		{
			
			for(j=2;j<i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j)
			System.out.println("given number is prime");
			else
				System.out.println("no is not prime number");
				
		}

	}

}
