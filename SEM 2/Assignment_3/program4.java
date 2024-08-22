 /*Write a recursive method in Java that computes the factorial of a given integer*/

public class program4 {
public static int fact(int n)
{
	if (n==0)
	{
		return 1;
	}
	else {
		return n*fact(n-1);
	}
}
	public static void main(String[] args) {
		int res=fact(4);
		System.out.println(res);
	}
}