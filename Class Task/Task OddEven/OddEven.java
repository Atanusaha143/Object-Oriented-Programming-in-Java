import java.util.Scanner;
import  java.lang.Math;

public class OddEven
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number: ");
		
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = input.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Index "+i+" contains an Even Number which is "+arr[i]);
			}
			else
			{
				System.out.println("Index "+i+" contains an Odd Number which is "+arr[i]);
			}
		}
	}
}