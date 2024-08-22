/*2. Define a class called Complex with instance variables real, imag and instance methods
 void setData(),
 void display(),
 public Complex add(Complex, Complex)
Write the main method in a separate class to implement the addition of two complex
number with the given method signature as above.*/

class Complex
{
	int real;
	int imag;
	
	void setData(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	public Complex add(Complex c11,Complex c22)
	{
    Complex c33=new Complex();
	c33.real=c11.real+c22.real;
	c33.imag=c11.imag+c22.imag;
	return c33;
	}
	void displayData()
	{
		System.out.println(real+" + "+imag+"i");
	}
}
public class program2 {
	public static void main(String[] args) {
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		c1.setData(5, 7);
		c2.setData(4, 7);
		c3=c3.add(c1,c2);
		c1.displayData();
		c2.displayData();
		c3.displayData();		
	}
}