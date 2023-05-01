package testshape;
import java.util.Scanner;
import com.interfaceque.org.*;
public class TestInterface {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("EmpId  EmpName  EmpSalary");
		Employee e=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		e.Print();
		
		System.out.println("day  month  year");
		Date d=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		d.Print();
		
		System.out.println(" shape class ");
		Shape s=new Shape();
		s.Print();
		

	}

}
