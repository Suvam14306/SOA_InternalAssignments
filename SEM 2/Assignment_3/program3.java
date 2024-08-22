/*Create a class Student & enter mark, name of the student. If mark is more than 100, create
 exception MarksOutOfBoundException & throw it using Java.*/

class Student
{
	String name;
	int marks;
Student(String name,int marks)
{
	this.name=name;
	this.marks=marks;
}

class MarksOutOfBoundsException extends Exception
{
	MarksOutOfBoundsException(String S){
		super(S);
	}
}
public void checkMarks(int n)
{
	try {
	if(n>100)
	{
		throw new MarksOutOfBoundsException("Marks can not be greater than 100");
		
	}
	System.out.println("marks secured="+n);
	
}
catch(MarksOutOfBoundsException e)
{
	System.out.println("error"+e);
}
}
}	
public class program3 {

	public static void main(String[] args) {
		Student s1=new Student("suvam",34);
		Student s2=new Student("suvam",120);
		s1.checkMarks(34);
		s2.checkMarks(120);		
	}
}