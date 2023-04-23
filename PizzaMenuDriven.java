import java.util.Scanner;

public class PizzaMenuDriven {

	public static void main(String[] args) {
		
		System.out.println("1:paneerpizza 300Rs, 2:margerita 200Rs, 3:cheezypizza 200Rs, 4:plainpizza 100Rs, 5:exit, 6:totalamount");
		int choice=0,qty;
		int amount=0;
		do {
			System.out.println("enter your choice:");
			Scanner sc=new Scanner(System.in);
			 choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter the no of quantity u want to order:");
				qty=sc.nextInt();
				amount=amount+(300*qty);
				break;
			case 2:
				System.out.println("enter the no of quantity u want to order:");
				qty=sc.nextInt();
				amount=amount+(200*qty);
				break;
			case 3:
				System.out.println("enter the no of quantity u want to order:");
				qty=sc.nextInt();
				amount=amount+(200*qty);
				break;
			case 4:
				System.out.println("enter the no of quantity u want to order:");
				qty=sc.nextInt();
				amount=amount+(200*qty);
				break;
				
			case 5:
				System.out.println("thank you visit again");
				
			case 6:
				System.out.println("total amount of your bill is:"+amount);
				break;
				
			default :
			{
				System.out.println("you have not given your choice");
			}
			}
		}while(choice!=5);
		//System.out.println("total amount is "+amount);
	}

}
