import java.util.Scanner;

public class ArrayMenDriven {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[5];
		// System.out.println("enter the size of array:");

		System.out.println(
				"1:Read array 2:print array " + "3:search element in array 4:Reverse array 5:Even no from array "
						+ "6:sum of array elements 7:exit");

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {

			System.out.println("enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("read your array:");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				break;

			case 2:
				System.out.println("print your array:");
				for (int i = 0; i < arr.length; i++) {
					System.out.println("" + arr[i]);
				}
				break;

			case 3:
				System.out.println("to search element in array...give the number");

				int search = sc.nextInt();
				boolean flag = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == search) {
						System.out.println("number is present");
						flag = true;
						break;
					}
				}
				if (flag == false) {
					System.out.println("Number not found");
				}
				break;
			case 4:
				System.out.println("enter your original array:");
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=sc.nextInt();
				}
				System.out.println("reversed array is:");
				for(int i=arr.length-1;i>=0;i--)
				{
					System.out.println(""+arr[i]);
				}
				break;
				
			case 5:
				//System.out.println("enter your array:");
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]%2==0)
					{
						System.out.println("even numbers are:"+arr[i]);
					}
				}
				
				break;
			case 6:
				System.out.println("enter the elements you want to sum of:");
				int sum=sc.nextInt();
				for(int i=0;i<arr.length;i++)
				{
					sum+=arr[i];
				}
				break;
				
			case 7:
				break;
			default:
				System.out.println("thankyou");
			}
		} while (choice != 7);

		System.out.println("------The End------");

	}

}
