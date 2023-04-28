package pkgtest;

import pkgproduct.Product;
import java.util.Scanner;

public class ProductMenudriven {

	public static void main(String[] args) {

		Product p = new Product();
		System.out.println("1:Add product 2:display product 3:update id 4:update productname 5:exit");

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		Product[] shop = new Product[100];
		Product pdt = null;
		int index = 0;

		do {
			System.out.println("enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter details");
				if (index < shop.length) {
					p = new Product(sc.nextInt(), sc.next(), sc.nextInt());
					shop[index] = p;
					index++;
					break;
				} else
					System.out.println("size is full!!!");
				break;
			case 2:
				if (p == null) {
					System.out.println("first add the product please :case 1");
				} else {
					for (int i = 0; i < index; i++) {
						shop[i].display();
					}
				}
				break;

			case 3:
				System.out.println("enter your new id:");
				int id = sc.nextInt();
				p.setId(id);
				System.out.println("changed id is:" + p.getId());
				break;

			case 4:
				System.out.println("enter your new product name:");
				String productname=sc.next();
				p.setProductname(productname);
				System.out.println("changed product name is:"+p.getProductname());
				break;
				
			case 5:
				break;
				
				default :
					System.out.println("Thank you plz visit again!!");
					break;
			}
		} while (choice != 5);

		System.out.println("-----------end----------");
	}

}
