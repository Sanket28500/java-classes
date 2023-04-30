package pkgAccount;

public class Account {

	private int Accid;
	private String email,city;
	private double balance;
	private static int counter=100;
	
	public Account()
	{	
		
		this.Accid=1;
		this.email="default@gmail";
		this.city="mycity";
		this.balance=1;
	}
	public Account(String email,String city)
	{	counter++;
		this.Accid=counter;
		this.email=email;
		this.city=city;
		
	}
	public int getAccid() {
		return Accid;
	}
	public void setAccid(int accid) {
		Accid = accid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getBalance() {
		return balance;
	}
	
	public void display()
	{
		System.out.println("Your bank details are : "+Accid+" "+email+" "+city+" "+balance);
	}
	
	public void Deposit(int amount)
	{
		this.balance=this.balance+amount;
		System.out.println("your new balance is:"+balance);
	}
	
	public void withdraw(int amount)
	{
		if(amount>balance) {
			System.out.println("insufficie balance");
		}else {
			this.balance=this.balance-amount;
			System.out.println(" your bal after withdraw is: "+balance);
		}	
	}
	
	public void moneyTransfer(Account reciever,int amount)
	{
		this.balance=this.balance-amount;
		reciever.balance=reciever.balance+amount;
		System.out.println("Payment Successfully");
		System.out.println("Your balance after Transfer is  "+balance);
	}
}
