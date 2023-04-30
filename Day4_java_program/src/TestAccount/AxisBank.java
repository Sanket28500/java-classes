package TestAccount;
import java.util.Scanner;

import pkgAccount.Account;
public class AxisBank {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Account acts=new Account(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		//acts.display();
		
		Account[] axisbank=new Account[5];

		
		int choice=0,index=0;
		Account acts=null;
		
		System.out.println("1:create account 2:show details 3:deposit amount 4:withdraw amount 5:exit");
		
		do {
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 if(index<axisbank.length)
				 {
					 System.out.println("Accid Email City Balance");
					 acts=new Account(sc.next(),sc.next());
					 axisbank[index]=acts;
					 index++;
				 }else
				 {
					 System.out.println("size is full");
				 }
				 break;
				 
			 case 2:
				 System.out.println("your account details are:");
				 if(acts!=null) {
					 for(int i=0;i<index;i++)
					 {
						 axisbank[i].display();
					 }
				 }else {
					 System.out.println("Account does not exist");
				 }
				 break;
				 
			 case 3:
				 System.out.println("Enter your Account id:");
				 int Accid=sc.nextInt();
				 for(int i=0;i<index;i++)
				 {
					 if(axisbank[i].getAccid()==Accid)
					 {
						 System.out.println("enter amount to deposit");
						 int amt=sc.nextInt();
						 axisbank[i].Deposit(amt);
						 System.out.println("your");
						 break;
					 }
					
				 }
				 break;
				 
			 case 4:
				 System.out.println("enter your Account id");
				 int id=sc.nextInt();
				 for(int i=0;i<index;i++)
				 {
				 if(axisbank[i].getAccid()==id)
				 {
					 System.out.println("enter the amount you want to withdraw");
					 int amt=sc.nextInt();
					axisbank[i].withdraw(amt);
					
					 break;
				 }
				 else
				 {
					 System.out.println("verify your gmail");
				 }
				 }
				 break;
				 
			 case 5:
				 
				 break;
				 default:
					 System.out.println("thank youuuuu");
			 }
			 
		}while(choice!=5);
 
		System.out.println("thank you for banking with us:");
	}

}
