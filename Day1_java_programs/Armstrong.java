import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int rem=0;
		int res=0;
		int temp;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if(temp==res) {
			System.out.println("given number is armstrong number");
		}
		else
			System.out.println("given number is not an armstrong number");
		}

}

