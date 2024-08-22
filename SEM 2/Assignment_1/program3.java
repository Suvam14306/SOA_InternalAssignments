/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
elements of the array.*/

import java.util.Scanner;
public class program3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int m = sc.nextInt();
	int[][]ar=new int[n][m];
	System.out.println("enter the elements of array");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			ar[i][j]=sc.nextInt();
		}
	}
		int sum=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			sum=sum+ar[i][j];
		}
	}		
		System.out.println(sum);
		sc.close();
	}
}