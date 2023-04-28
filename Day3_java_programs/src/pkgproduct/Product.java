package pkgproduct;

public class Product {

	int id;
	String productname;
	int price;
	
	public Product()
	{
		this.id=1;
		this.productname="myproduct";
		this.price=1;
	}
	public Product(int id, String productname, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("product details are : "+id+" "+productname+" "+price);
	}
	
}
