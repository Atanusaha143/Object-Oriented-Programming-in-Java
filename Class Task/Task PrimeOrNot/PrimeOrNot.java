import java.util.Scanner;
import  java.lang.Math;

public class PrimeOrNot
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number: ");
		
		int n = input.nextInt();

		boolean flag = false;

		for(int i=2; i<Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				flag = true;
				break;
			}
		}
		
		if(flag) 
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}
}
