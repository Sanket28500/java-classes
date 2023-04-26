
public class MethodTest {

	public static void main(String[] args) {
		
		Methods obj;
		obj=new Methods();
		String str=obj.msg();
		System.out.println(str);
		obj.sum(10, 20);
		int s=obj.sub(20, 10);
		System.out.println("subtraction is:"+s);
		obj.welcome();

	}

}
