/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.*/

import java.util.Scanner;
public class program4 {
	public static double sumColoumn(double[][] m,int index)
	{
		double sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+m[i][index];
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int row=sc.nextInt();
		int col = sc.nextInt();
		double[][]ar=new double[row][col];
		System.out.println("enter the elements of array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("enter the index");
		int index=sc.nextInt();		
		System.out.println(sumColoumn(ar,index));
		sc.close();
	}
}