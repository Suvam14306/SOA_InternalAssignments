/* Write a recursive method in Java which, given an integer n, print it with its digits reversed.
 For example , given 4735, it prints 5374*/

public class program6 {
public static int rev(int n ,int sum)
{
	if(n==0)
	{
		return sum;
	}
	else {
		return rev(n/10,sum*10+(n%10));
	}
}
	public static void main(String[] args) {
		int res=rev(1543,0);
		System.out.println(res);
	}
}