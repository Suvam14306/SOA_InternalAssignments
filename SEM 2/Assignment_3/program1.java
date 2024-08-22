/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.*/

import java.util.Scanner;
public class program1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("enter your lucky number");
			int x=sc.nextInt();
			if(x<0)
			{
				throw new NumberFormatException("Number cant be negative" );					
			}
			System.out.println("YOUR LUCKY NUMBER IS"+x);			
		}
		catch(NumberFormatException e)
		{
			System.out.println("error"+e);				
		}			
	}
}
