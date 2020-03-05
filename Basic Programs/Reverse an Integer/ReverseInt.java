import java.util.Scanner;

public class ReverseInt
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a Number: ");

		int n = input.nextInt();

		int sum = 0, temp = n;

		while(temp != 0)
		{
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10; 
		}

		System.out.print("After reversing the number it is: "+sum);
	}
}