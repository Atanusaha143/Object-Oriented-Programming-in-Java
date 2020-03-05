import java.util.Scanner;

public class fib
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		long n1 = 0, n2 =1;

		System.out.print("Enter a Number: ");
		int n = input.nextInt();
		System.out.print("Fibonacci Series Upto "+n+" is: "+n1+" "+n2);
		for(int i=3; i<=n; i++)
		{
			long n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}