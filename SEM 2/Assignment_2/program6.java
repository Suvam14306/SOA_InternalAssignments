/*Create an abstract class Marks with three instance variables (markICP, markDSA,
and percentage) and an abstract method getPercentage(). Create two classes: CSE
with instance variable algoDesign, and NonCSE with instance variable enggMechanics. Both classes inherit the abstract class Marks and override the abstract method
getPercentage(). The constructor of class CSE takes the marks in three subjects
(markICP, markDSA, and algoDesign) as its parameters, and the constructor of class
NonCSE takes the marks in three subjects (markICP, markDSA, and enggMechanics)
as its parameters. Create an object for each of the two classes and print the percentage
of marks for both students.*/

abstract class Marks
{
	double markICP;
	double markDSA;
	double percentage;
	Marks(double markICP,double markDSA)
	{
		this.markICP=markICP;
		this.markDSA=markDSA;
	}
	abstract void getPercentage();
}
 class CSE extends Marks
{
	double algodesign;
	CSE(double markICP,double markDSA,double algodesign)
	{
		super(markICP,markDSA);
		this.algodesign=algodesign;
		
	}
	 void getPercentage()
	 {
		percentage=(markICP+markDSA+algodesign)/300*100;
		System.out.println(percentage);
	}
}
 class NonCSE extends Marks
{
	double enggMechanics;
	NonCSE(double markICP,double markDSA,double enggMechanics )
	{
		super(markICP,markDSA);
		this.enggMechanics=enggMechanics;
		
	}
	 void getPercentage()
	 {
		percentage=(markICP+markDSA+enggMechanics)/300*100;
		System.out.println(percentage);
	}
}
public class program6 {
	public static void main(String[] args) {
		CSE p1=new CSE(99,99,100);
		NonCSE p2=new NonCSE(100,100,100);
		p1.getPercentage();
		p2.getPercentage();
	}
}