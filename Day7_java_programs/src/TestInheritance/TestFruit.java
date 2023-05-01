package TestInheritance;
import Inheritance.*;
public class TestFruit {

	public static void main(String[] args) {
		
		Fruit f=new Fruit("grey",150.34);
		f.display();
		f.taste();
		
		Mango m=new Mango();
		m.pulp();
		m.taste();
		System.out.println("\n\n");
		Orange org=new Orange();
		org.juice();
		org.taste();
		
		

	}

}
