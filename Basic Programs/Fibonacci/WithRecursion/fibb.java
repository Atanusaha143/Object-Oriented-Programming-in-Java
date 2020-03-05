import java.util.Scanner;

class fibb
{
	static long n1 = 0, n2 = 1, n3 = 0;
	static void printFib(long n)
	{
		if(n>0)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			printFib(n-1);  
		}
	}

	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a Number: ");
		long n = input.nextInt();
		System.out.print("Fibonacci Series Upto "+n+" is: "+n1+" "+n2);
		printFib(n-2);
	}
}
