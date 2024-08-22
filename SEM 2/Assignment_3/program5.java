/*Write a recursive method in Java which, given real value x and a positive integer n, returns
 the value of xn.*/

public class program5 {
public static int power(int x,int n)
{
	if(n==0)
	{
		return 1;
		
	}
	else {
		return x*power(x,n-1);
	}
}	
	public static void main(String[] args) {
		int res=power(5,6);
		System.out.println(res);
	}
}