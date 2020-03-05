import java.util.Scanner;
import  java.lang.Math;

public class PalindromOrNot
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a string: ");
		
		String s = input.next();
		int size = s.length();
		boolean flag = false;
		
		char[] arr = s.toCharArray(); 
		for(int i=0; i<size; i++)
		{
			if(arr[i]!=arr[size-i-1])
			{
				flag = true;
				break;
			}
		}
		
		if(flag) 
		{
			System.out.println("String is not palindrome");
		}
		else
		{
			System.out.println("String is palindrome");
		}
	}
}