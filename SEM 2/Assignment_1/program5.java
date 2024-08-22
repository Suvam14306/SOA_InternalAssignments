/*Write a java method to calculate the sum of digits of a given number until the number is a 
single digit. The method signature is as follows. */

import java.util.Scanner;
public class program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		while(x/10!=0)
		{
			int sum=0;
			while(x!=0)
			{
				int rem=x%10;
				sum=sum+rem;
				x=x/10;
			}
			x=sum;
		}
		System.out.println(x);
		sc.close();
	}
}