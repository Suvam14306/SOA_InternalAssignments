/*Question-2: 
Write a Java program that takes all the lines input to standard input and writes them to 
standard output in reverse order. That is, each line is output in the correct order, but the 
ordering of the lines is reversed. */

public class program6 {

	public static void main(String[] args) {
		String[]ar=new String[3];
		ar[0]="i like anime";
		ar[1]="naruto is goat";
		ar[2]="one piece is goated";
		
		for(int i=2;i>=0;i--) {
			System.out.println(ar[i]);
		}

	}

}
