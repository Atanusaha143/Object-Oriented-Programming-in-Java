import java.util.Scanner;

abstract class one
{
	public static int sum;
	public one(int a, int b)
	{
		sum = a + b;
	}
	
	static void stat()
	{
		System.out.println("In Static Method of abstract Class");
	}
	
	abstract void abs();
}

class two extends one 
{
	public two(int a, int b)
	{
		super(a,b);
		System.out.println("Sum: "+sum);
	}
	
	void abs()
	{
		System.out.println("Abstruct method in Inherited Class");
	}
}

public class Main
{
	public static void main (String args[])
	{
		Scanner cin = new Scanner(System.in);
		
		System.out.print("Enter an Integer Input: ");
		int a = cin.nextInt();
		
		System.out.print("Enter an another Integer Input: ");
		int b = cin.nextInt();
		
		two t = new two(a,b);
		t.abs();
		
		one.stat();	
	}
}

