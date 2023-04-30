package TestAccount;
import pkgAccount.Account;
import java.util.Scanner;
public class BankAccount {

	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      Account[]bank=new Account[size];
      
      System.out.println("1:create account 2:show details 3:Deposit amount 4:withdraw amount 5:moneyTransfer 6:Exit");
      int index=0;
      int choice=0;
      
      
      do {
    	  System.out.println("Enter your choice :");
          choice=sc.nextInt();
          
          switch(choice)
          {
          case 1:
        	  if(index<size)
        	  {
        	  System.out.println("Enter your Name and Email here:");
        	  bank[index]=new Account(sc.next(),sc.next());
        	  index++;
        	  }
        	  else
        	  {
        		  System.out.println("array size is full!!");
        	  }
        	  break;
        	  
        	  case 2:
        		  System.out.println("Account details are:");
        			  for(int i=0;i<index;i++)
            		  {
            			  bank[i].display();
            		  }
        		 
        		  break;
        		  
        	  case 3:
        		  System.out.println("enter your id");
        		  int id=sc.nextInt();
        		  for(int i=0;i<index;i++)
        		  {
        		  if(bank[i].getAccid()==id)
        		  {
        			  System.out.println("enter amount to deposit");
        			  int amt=sc.nextInt();
        			  bank[i].Deposit(amt);
        		  }
        		  }
        		  break;
        		  
        	  case 4:
        		  System.out.println("enter your id");
        		  int withid=sc.nextInt();
        		  for(int i=0;i<index;i++)
        		  {
        		  if(bank[i].getAccid()==withid)
        		  {
        			  System.out.println("enter amount to withdraw");
        			  int amt=sc.nextInt();
        			  bank[i].withdraw(amt);
        		  }
        		  }
        		  break;
        		  
        	  case 5:
        		  System.out.println("enter senders account id");
        		  int sid=sc.nextInt();
        		  for(int i=0;i<index;i++)
        		  {
        			  if(bank[i].getAccid()==sid)
        			  {
        				  System.out.println("enter recievers account id");
        				  int rid=sc.nextInt();
        				  for(int j=0;j<index;j++)
        				  {
        					  if(bank[j].getAccid()==rid)
        					  {
        						  System.out.print("account verified successfully");
        						  
        						  System.out.print("enter the amount u want to send");
        						  int amt=sc.nextInt();
        						  bank[i].moneyTransfer(bank[j],amt);
        						 break;
        					  }
        				  }
        			  }
        		  }
        		  break;
        		  
        	  case 6:
        		  break;
          }
          
    	  
      }while(choice!=6);
 

      System.out.println("Thank You for Banking with us");
	}

}
