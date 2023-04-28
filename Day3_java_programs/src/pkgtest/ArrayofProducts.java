package pkgtest;
import java.util.Scanner;
import pkgproduct.Product;

public class ArrayofProducts {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product details here:");
		Product p1=new Product(sc.nextInt(),sc.next(),sc.nextInt());
		Product p2=new Product(sc.nextInt(),sc.next(),sc.nextInt());
     	p1.display();
		p2.display();
		
		Product[]shop=new Product[2];
		shop[0]=p1;
		shop[1]=p2;
		
	
	}

}
