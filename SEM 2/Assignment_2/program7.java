/*Define an interface DetailInfo to declare methods display( ) & count( ). Another class
Person contains a static data member maxcount, instance member name & method
display( ) to display name of a person, count the no. of characters present in the name
of the person.
*/

interface DetailInfo
{
	void display();
	int count();
	
}
class People implements DetailInfo
{
	static int maxcount=0;
	String name;
	People( String name)
	{
		this.name=name;
	}
	public int count()
	{
		maxcount=name.length();
			return maxcount;
			
	}
	public void display()
	{
		System.out.println("the total no of character is "+maxcount);
	}
}
public class program7 {

	public static void main(String[] args) {
		
		People p1=new People("suvam");
		p1.count();
		p1.display();
	}
}