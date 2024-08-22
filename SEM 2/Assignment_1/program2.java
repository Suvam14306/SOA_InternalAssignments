/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/

import java.util.Scanner;
public class program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System .in);
		int[]ar=new int[5];
		System.out.println("enter the elements of thearray");
		for(int i =0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		} 
			int max=ar[0];
			int min=ar[0];
			int count1=0;
			int count2=0;
			int maxIndex=0;
			int minIndex=0;
			for(int i=0;i<5;i++)
			{
				if(ar[i]>max)
				{
					max=ar[i];
					count1=1;
					maxIndex=i+1;
					
				}
				else if(ar[i]==max) {
					count1++;
					
				}
				if(ar[i]<min)
				{
					min=ar[i];
					count2=1;															
				}
				else if(ar[i]==min)
				{
					count2++;
					minIndex=i+1;
				}
			}	
		System.out.println("Maximum element of Array is"+max+" occurs"+count1+"times");
		System.out.println("Minimum element of Array is"+min+" occurs"+count2+"times");
		System.out.println("First occurrence of maximum element is at position"+maxIndex);
		System.out.println("Last occurrence of maximum element is at position"+minIndex);
		sc.close();
	}
}