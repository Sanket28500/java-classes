package testshape;

import com.assignment.q2.*;


public class TestShape{

	public static void main(String[] args) {
		
		
	Shape s=null;
		for(int i=0;i<5;i++)
		{
			
			{
			System.out.println(ShapeFactory.generateshape());
			
			if(ShapeFactory.generateshape()==2)
			{
				System.out.println(s);
			    s=new Circle(5);
			    System.out.println(s.area());
			}
			else if(ShapeFactory.generateshape()==3)
			{
				System.out.println(s);
				s=new Rectangle(10,12);
				System.out.println(s.area());
			}
			else
			{
				System.out.println(s);
				s=new Square(4);
				System.out.println(s.area());
			}
			
		}
		}
	}

}
