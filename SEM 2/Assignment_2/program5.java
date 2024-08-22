/*Define a base class Person with instance variable name, age. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance
variables are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information
of employee details.*/

class Person2
{
	String name;
	int age;
	
	Person2(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class employee extends Person2
{
	int Eid;
	double salary;
	
	employee(String name,int age,int Eid,double salary)
	{
		
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	 void empDisplay()
	{
		System.out.println("name is "+name+"\n"+"age is "+age+"\n"+"employee id is "+Eid+"\n"+"salary is "+salary);
	}
	
}
public class program5 {

	public static void main(String[] args) {
		employee e1=new employee("suvam",20,1234,56000);
		e1.empDisplay();
	}
}