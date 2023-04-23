import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
	
	int[]arr;// declaration
//	arr=new int[5];//instantiation
//	arr[0]=10;
//	arr[1]=20;
//	arr[2]=30;
//	arr[3]=40;
//	arr[4]=50;
	
	System.out.println("enter the size of array:");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	arr=new int[size];
	for(int j=0;j<size;j++)
	{
		arr[j]=sc.nextInt();
	}
	
	//for display the array:
	for(int i=0;i<size;i++)
	{
		System.out.println(""+arr[i]);
	}
	
	
}
}
