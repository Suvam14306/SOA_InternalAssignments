/* The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
 each is the sum of the preceding two. Write a recursive method in Java which, given n,
 returns the nth Fibonacci number*/

public class program7 {
public static int fibo(int n)
{
	if(n==0)
	{
		return 0;
	}
	else if (n==1)
	{
		return 1;
	}
	else {
		return fibo(n-1)+fibo(n-2);
	}	
}
	public static void main(String[] args) {
		int res=fibo(7);
		System.out.println(res);				
	}
}