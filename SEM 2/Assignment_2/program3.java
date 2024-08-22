/*In a super market each product is having minimum details like prodId, price, quantity
that is used during the biling process. Keeping this in mind prepare a class named as
Product having the member variables
 prodId, price, quantity
 a static variable totalPrice
Initialize the value of product through parameterized constructor. It consists of a
display() method to display the value of instance variables. A person went to market
and purchase 5 different products. Using the above mentioned class, display the details
of products that the person has purchased. Also, determine how much total amount
the person will pay for the purchase of 5 products.*/

class Product
{
	int prodId;
	double price;
	int quantity;
	static double totalPrice;	
	Product(int prodId,double price,int quantity)
	{
		this.prodId=prodId;
		this.price=price;
		this.quantity=quantity;
		totalPrice= totalPrice+price*quantity;		
	}
	void gettotalPrice()
	{
		System.out.println("total price is "+totalPrice);
	}
	void display()
	{
	 System.out.println(prodId+"  "+price+" "+quantity);
	}	
}
public class program3 {
	public static void main(String[] args) {
		Product p1=new Product(123,34,65);		
		p1.display();
		Product p2=new Product(123,34,65);		
		p2.display();
		Product p3=new Product(123,34,65);		
		p3.display();
		Product p4=new Product(123,34,65);		
		p4.display();
		Product p5=new Product(123,34,65);
		p5.display();
		p5.gettotalPrice();
	}
}
