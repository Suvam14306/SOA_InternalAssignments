/* Define a class Person with two instance variables:
 name and age
and two member methods:
 setData(): set the details of the person.
 displayData(): display the details of the person.
Now, create two objects of class person and initialize one object value directly (by
using the dot(.) operator name: “Rohan” and age: 20 ). Accept your name and age
through the keyboard and set them to another object using the setData() method.
Now display both the member variables using the displayData() method. Also, check
who is younger.*/

import java.util.Scanner;

class person
{
	String name;
	int age;	
	void setData()
	{
		System.out.println("enter the name and age");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		age=sc.nextInt();		
	}
	void displayData()
	{
		System.out.println("name is "+name+" and age is "+age);		
	}	
}
public class program1 {
	public static void main(String[] args) {
		person P1=new person();
		person P2=new person();
		P1.name="rohan";
		P1.age=12;
		P1.displayData();
		P2.setData();
		P2.displayData();			
	}
}