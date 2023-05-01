package TestInheritance;
import Inheritance.*;
public class TestParentChild {

	public static void main(String[] args) {
		
		//code before inheritance
//		Child c=new Child();
//		c.Behaviour();
//		
//		Parent p=new Parent();
//		p.behaviour();
//		
		
		Parent p=new Parent("simket","pune");
		p.display();
		
		System.out.println("\n\n");
		
		Parent p1=new Child("sank","pbn","student");
		p1.display();

	}

}
