import java.util.Scanner;
public class StoreArray {

	public static void main(String[] args) {
		
int index=0;
int []arr1= {1,2,3};
int[]arr2= {5,6,7,8,9};

System.out.println("enter elements of first array:");
     for(int i=0;i<arr1.length;i++) 
     {
	System.out.println(arr1[i]);
     }
     
     System.out.println("enter elements of second array:");
     for(int i=0;i<arr2.length;i++) 
     {
	       System.out.println(arr2[i]);
     }
		
     int[]arr3=new int[arr1.length+arr2.length];
     for(int i=0;i<arr1.length;i++)
     {
    	 arr3[index]=arr1[i];
    	 index++;
     }
     for(int j=0;j<arr2.length;j++)
     {
    	 arr3[index]=arr2[j];
    	 index++;
     }
	 for(int k=0;k<arr3.length;k++)
	 {
		 System.out.println(""+arr3[k]);
	 }
		

	}

}
