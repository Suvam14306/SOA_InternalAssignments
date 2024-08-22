/*Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java*/

public class program2 {
	public static void main(String[] args) {
	String ar[]= {"blue","green","red","pink"};
	try {
		System.out.println(ar[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
    try
   {
	ar[1]=null;
	System.out.println(ar[1].toLowerCase());
   }
    catch(NullPointerException p)
    {
    	System.out.println(p);
    }
	}
}