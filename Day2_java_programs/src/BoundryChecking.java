import java.util.Scanner;
public class BoundryChecking {

	public static void main(String[] args) {
		

		
		int index=0;
		Scanner sc=new Scanner(System.in);
		//int size=sc.nextInt();
		//arr=new int[size];
		int[]arr=new int[7];
				if(index<arr.length)
			
		{
			System.out.println("enter the number to add:");
			int number=sc.nextInt();
			arr[index]=number;
			index++;
		}
		else
		{
			System.out.println("size is full");
		}
	}

}
